package com.example.urbanhouse.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.urbanhouse.R
import com.example.urbanhouse.models.ProductModel

class ProductAdapter(private val productList : ArrayList<ProductModel>) :
    RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    var productClick : ((ProductModel) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.product_card_design,
            parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = productList[position]
        holder.imageView.setImageResource(product.img)
        holder.textname.text = product.name
        holder.textdesc.text = product.desc
        holder.textprice.text = product.price

        holder.itemView.setOnClickListener {
        productClick?.invoke(product)
    }
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.product_image)
        val textname: TextView = itemView.findViewById(R.id.product_namee)
        val textdesc: TextView = itemView.findViewById(R.id.product_desc)
        val textprice: TextView = itemView.findViewById(R.id.product_rate)
    }
}