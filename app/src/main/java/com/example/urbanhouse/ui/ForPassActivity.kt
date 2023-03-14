package com.example.urbanhouse.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.urbanhouse.databinding.ActivityForPassBinding

class ForPassActivity : AppCompatActivity() {
    private var binding: ActivityForPassBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForPassBinding.inflate((layoutInflater))
        setContentView(binding!!.root)

        binding!!.back.setOnClickListener {
            finish()
        }
    }
}