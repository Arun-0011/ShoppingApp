package com.example.urbanhouse.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.urbanhouse.R
import com.example.urbanhouse.databinding.ActivityLoginBinding

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
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}