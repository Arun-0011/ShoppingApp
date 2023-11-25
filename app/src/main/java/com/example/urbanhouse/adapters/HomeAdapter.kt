package com.example.urbanhouse.adapters

import android.app.Activity
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.example.urbanhouse.databinding.ListHomeBinding
import com.example.urbanhouse.models.CategoriesModel
import com.example.urbanhouse.models.HomeModel
import com.example.urbanhouse.retrofit.RecyclerviewOnClick

class HomeAdapter(
    private val activity: Activity,
    private var list: java.util.ArrayList<HomeModel> = java.util.ArrayList(),
    private var recyclerviewOnClick: RecyclerviewOnClick

    ) : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    inner class ViewHolder(internal val binding: ListHomeBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ListHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.apply {
            with(list[position]) {
                binding.apply {
                    tvSong.text = name
                    ivImage.let {
                        Glide.with(activity)
                            .load(image)
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
                    holder.itemView.setOnClickListener {
                        recyclerviewOnClick.onClick(position, 0, it)
                    }

                }
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}