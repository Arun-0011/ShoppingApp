package com.example.urbanhouse.ui

import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
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
            binding?.proImg?.let {
                Glide.with(this)
                    .load(details.img)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
//                            .error(R.drawable.logo)
                    .listener(object : RequestListener<Drawable> {
                        override fun onResourceReady(
                            resource: Drawable?,
                            model: Any?,
                            target: com.bumptech.glide.request.target.Target<Drawable>?,
                            dataSource: com.bumptech.glide.load.DataSource?,
                            isFirstResource: Boolean
                        ): Boolean {
//                                    binding.progressBar.visibility = View.GONE
                            return false
                        }

                        override fun onLoadFailed(
                            e: GlideException?,
                            model: Any?,
                            target: com.bumptech.glide.request.target.Target<Drawable>?,
                            isFirstResource: Boolean
                        ): Boolean {
//                                    binding.progressBar.visibility = View.GONE
                            return false
                        }
                    }).into(it)
            }
        }

        binding?.btnAddtocart?.setOnClickListener {
            val intent = Intent(this, PlaceOrderActivity::class.java)
            intent.putExtra("product", details)
            startActivity(intent)
        }
    }
}