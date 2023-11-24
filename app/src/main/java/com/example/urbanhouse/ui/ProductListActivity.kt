package com.example.urbanhouse.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.urbanhouse.adapters.ProductAdapter
import com.example.urbanhouse.databinding.ActivityProductListBinding
import com.example.urbanhouse.models.ProductModel


class ProductListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductListBinding
    private lateinit var productAdapter: ProductAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val productPosition = intent.extras?.getInt("product")
        recyclerView = binding.productListRecyclerview
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        val productList = ArrayList<ProductModel>()

        when (productPosition) {
            0 -> {
                productList.add(
                    ProductModel(
                        "https://m.media-amazon.com/images/I/61-tZX1gYbL._AC_UL320_.jpg",
                        "Red Tape",
                        "Smile",
                        "1499"
                    )
                )
                productList.add(
                    ProductModel(
                        "https://m.media-amazon.com/images/I/61-tZX1gYbL._AC_UL320_.jpg",
                        "Red Tape",
                        "Smile",
                        "1499"
                    )
                )
            }
            1 -> {
                productList.add(
                    ProductModel(
                        "https://m.media-amazon.com/images/I/61-tZX1gYbL._AC_UL320_.jpg",
                        "Red Tape",
                        "Smile",
                        "1499"
                    )
                )
            }

        }

        productAdapter = ProductAdapter(this, productList)
        recyclerView.adapter = productAdapter


        productAdapter.productClick = {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("product",it)
            startActivity(intent)
        }
    }
}