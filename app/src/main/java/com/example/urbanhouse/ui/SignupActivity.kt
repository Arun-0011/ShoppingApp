package com.example.urbanhouse.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.urbanhouse.R
import com.example.urbanhouse.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    private var binding: ActivitySignupBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        setOnClickListeners()
    }

    private fun setOnClickListeners() {
        binding!!.back.setOnClickListener {
            finish()
        }

        binding?.btnSignup?.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}