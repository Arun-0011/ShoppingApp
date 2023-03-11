package com.example.urbanhouse.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.urbanhouse.databinding.ActivityForPassBinding

class ForPassActivity : AppCompatActivity() {
    private var binding: ActivityForPassBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForPassBinding.inflate((layoutInflater))
        setContentView(binding!!.root)

        val backBtn = binding!!.back
        backBtn.setOnClickListener {
            finish()
        }
    }
}