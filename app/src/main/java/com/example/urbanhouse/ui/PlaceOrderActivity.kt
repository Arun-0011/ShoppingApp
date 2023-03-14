package com.example.urbanhouse.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.urbanhouse.adapters.PlaceOrderAdapter
import com.example.urbanhouse.databinding.ActivityPlaceOrderBinding
import com.example.urbanhouse.models.PlaceOrderModel
import com.example.urbanhouse.models.ProductModel

class PlaceOrderActivity : AppCompatActivity() {
    private var binding: ActivityPlaceOrderBinding? = null
    private lateinit var recyclerView: RecyclerView
    private lateinit var placeOrderAdapter: PlaceOrderAdapter
    private var detail: ProductModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlaceOrderBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        detail = intent.getParcelableExtra("product")
        setOnClickListener()
        setAdapter()
    }

    private fun setOnClickListener() {
        binding!!.back.setOnClickListener {
            finish()
        }
    }

    private fun setAdapter() {
        recyclerView = binding!!.placeOrderRview
        recyclerView.layoutManager = LinearLayoutManager(this)
        val orderList = ArrayList<PlaceOrderModel>()
        orderList.add(
            PlaceOrderModel(
                img = detail?.img!!,
                name = detail?.name,
                price = detail?.price
            )
        )

        placeOrderAdapter = PlaceOrderAdapter(orderList)
        recyclerView.adapter = placeOrderAdapter
    }
}