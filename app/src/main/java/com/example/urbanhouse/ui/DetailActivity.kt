package com.example.urbanhouse.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.urbanhouse.databinding.ActivityDetailBinding
import com.example.urbanhouse.models.ProductModel

class DetailActivity : AppCompatActivity() {
    private var binding: ActivityDetailBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        val details = intent.getParcelableExtra<ProductModel>("product")

        if (details != null) {
            binding?.proName?.text = details.name
            binding?.proDesc?.text = details.desc
            binding?.proPrice?.text = details.price
            binding?.proImg?.setImageResource(details.img)
        }

        binding?.btnAddtocart?.setOnClickListener {
            val intent = Intent(this, PlaceOrderActivity::class.java)
            intent.putExtra("product", details)
            startActivity(intent)
        }
    }
}