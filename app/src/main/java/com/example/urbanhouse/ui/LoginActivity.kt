package com.example.urbanhouse.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.urbanhouse.R
import com.example.urbanhouse.databinding.ActivityLoginBinding
import com.example.urbanhouse.models.LoginRequest
import com.example.urbanhouse.models.LoginResponse
import com.example.urbanhouse.retrofit.ApiInterface
import com.example.urbanhouse.retrofit.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class LoginActivity : AppCompatActivity() {
    private var binding: ActivityLoginBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        setClickListeners()
    }

    private fun setClickListeners() {
        binding?.txtSignup?.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

        binding?.txtForPass?.setOnClickListener {
            val intent = Intent(this, ForPassActivity::class.java)
            startActivity(intent)
        }

        binding?.actionBack?.setOnClickListener {
            finish()
        }

        binding?.btnLogin?.setOnClickListener {
            if (binding?.edTxtEmail?.text.toString().trim().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    getString(R.string.str_enter_valid_email),
                    Toast.LENGTH_SHORT
                ).show()
            } else if (binding?.edTxtPass?.text.toString().trim().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    getString(R.string.str_enter_valid_pw),
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                loginApi(binding?.edTxtEmail?.text?.trim().toString(), binding?.edTxtPass?.text?.trim().toString())
            }
        }
    }

    private fun loginApi(username: String, password: String) {
        val apiInterface = RetrofitClient.getInstance().create(ApiInterface::class.java)

        apiInterface.loginApi(LoginRequest(username = username, password = password))
            .enqueue(object :
                Callback<LoginResponse> {
                override fun onResponse(
                    call: Call<LoginResponse>,
                    response: Response<LoginResponse>
                ) {
                    if (response.code() == 200 || response.code() == 201) {
                        startActivity(Intent(this@LoginActivity, MainActivity::class.java))
                        Toast.makeText(
                            this@LoginActivity,
                            "Login success!",
                            Toast.LENGTH_SHORT
                        )
                            .show()

                    } else {
                        Toast.makeText(
                            this@LoginActivity,
                            "Enter valid credentials",
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    }
                }

                override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                    Toast.makeText(
                        this@LoginActivity,
                        t.message,
                        Toast.LENGTH_SHORT
                    ).show()
                }
            })
    }
}