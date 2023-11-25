package com.example.urbanhouse.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.urbanhouse.adapters.HomeAdapter
import com.example.urbanhouse.databinding.FragmentHomeBinding
import com.example.urbanhouse.models.CategoriesModel
import com.example.urbanhouse.models.HomeModel
import com.example.urbanhouse.retrofit.RecyclerviewOnClick


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var adapter: HomeAdapter
    private var list: java.util.ArrayList<HomeModel> = java.util.ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        setAdapter()
        return binding.root
    }

    private fun setAdapter() {
        list.add(HomeModel("https://m.media-amazon.com/images/I/61JIDzwAA7L._AC_UF226,226_FMjpg_.png","Topwear"))
        list.add(HomeModel("https://m.media-amazon.com/images/I/41LgihwADmL._AC_SR400,600_AGcontrast_.jpg","Winter Wear"))
        list.add(HomeModel("https://m.media-amazon.com/images/I/61nPtGyMrdS._AC_UL320_.jpg","Bags & Handbags"))
        list.add(HomeModel("https://m.media-amazon.com/images/G/31/img23/Fashion/AF/Flip/Winterwearflip/HALOS/Main/watches._SS300_QL85_FMpng_.png","Watches"))
        list.add(HomeModel("https://m.media-amazon.com/images/G/31/img21/shoes/2023/Winterflip/WS/Tile/Mochi_11._SX564_QL85_FMpng_.png","Sandals & more"))
        list.add(HomeModel("https://m.media-amazon.com/images/G/31/img23/Fashion/AF/Flip/Winterwearflip/HALOS/Main/beauty._SS300_QL85_FMpng_.png","Beauty"))

        adapter = HomeAdapter(requireActivity(), list, object : RecyclerviewOnClick {
            override fun onClick(position: Int, viewType: Int, view: View) {
                val intent = Intent(context, ProductListActivity::class.java)
                intent.putExtra("product", position)
                intent.putExtra("type", "home")
                startActivity(intent)
            }
        })
        binding.rvHome.adapter = adapter
    }
}