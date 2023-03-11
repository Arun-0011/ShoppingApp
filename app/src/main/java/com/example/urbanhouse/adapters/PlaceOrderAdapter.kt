package com.example.urbanhouse.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.urbanhouse.R
import com.example.urbanhouse.models.PlaceOrderModel

class PlaceOrderAdapter(private val orderList: ArrayList<PlaceOrderModel>) : RecyclerView.Adapter<PlaceOrderAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.place_order_cart, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return orderList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val order = orderList[position]
        holder.imageView.setImageResource(order.img)
        holder.textname.text = order.name
        holder.textprice.text = order.price
    }
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView)  {
        val imageView: ImageView = itemView.findViewById(R.id.product_image)
        val textname: TextView = itemView.findViewById(R.id.product_namee)
        val textprice: TextView = itemView.findViewById(R.id.product_rate)
    }
}