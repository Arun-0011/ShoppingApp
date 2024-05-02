package com.example.urbanhouse.adapters

import android.app.Activity
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.example.urbanhouse.R
import com.example.urbanhouse.listener.RecyclerviewListener
import com.example.urbanhouse.models.PlaceOrderModel
import com.example.urbanhouse.retrofit.RecyclerviewOnClick

class PlaceOrderAdapter(
    private var activity: Activity,
    private val orderList: ArrayList<PlaceOrderModel>,
    private var onClick: RecyclerviewListener
) : RecyclerView.Adapter<PlaceOrderAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.place_order_cart, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return orderList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val order = orderList[position]
        var quantity = 1
        holder.imageView.let {
            Glide.with(activity)
                .load(order.img)
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
        holder.textname.text = order.name
        holder.textprice.text = order.price

        holder.tvQuantity.text = quantity.toString()

        holder.ivAdd.setOnClickListener {
            quantity = quantity + 1
            holder.tvQuantity.text = quantity.toString()
            onClick.onClick(
                quantity
            )
        }
        holder.ivRemove.setOnClickListener {
            if (quantity != 1) {
                quantity = quantity - 1
                holder.tvQuantity.text = quantity.toString()
                onClick.onClick(
                    quantity
                )
            } else {
                quantity = 1
                holder.tvQuantity.text = quantity.toString()
            }
        }
    }
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView)  {
        val imageView: ImageView = itemView.findViewById(R.id.product_image)
        val ivAdd: ImageView = itemView.findViewById(R.id.ic_add)
        val ivRemove: ImageView = itemView.findViewById(R.id.ic_remove)
        val textname: TextView = itemView.findViewById(R.id.product_namee)
        val textprice: TextView = itemView.findViewById(R.id.product_rate)
        val tvQuantity: TextView = itemView.findViewById(R.id.tv_item_count)
    }
}