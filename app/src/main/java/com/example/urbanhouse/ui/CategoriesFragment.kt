package com.example.urbanhouse.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.urbanhouse.adapters.CategoriesAdapter
import com.example.urbanhouse.databinding.FragmentCategoriesBinding
import com.example.urbanhouse.models.HomeModel
import com.example.urbanhouse.retrofit.RecyclerviewOnClick

class CategoriesFragment : Fragment() {
    private lateinit var binding: FragmentCategoriesBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var fragmentadapter: CategoriesAdapter
    private var list: java.util.ArrayList<HomeModel> = java.util.ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCategoriesBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = binding.fraRecyclerview
        recyclerView.layoutManager = GridLayoutManager(context,3)
        list.add(HomeModel("https://m.media-amazon.com/images/I/61-tZX1gYbL._AC_UL320_.jpg", "Co-ord Sets"))
        list.add(HomeModel("https://m.media-amazon.com/images/I/61JIDzwAA7L._AC_UF226,226_FMjpg_.png","Topwear"))
        list.add(HomeModel("https://m.media-amazon.com/images/I/41LgihwADmL._AC_SR400,600_AGcontrast_.jpg","Winter Wear"))
        list.add(HomeModel("https://m.media-amazon.com/images/I/51o9uTXniLL._AC_UL320_.jpg","Kurta & Kurta Sets"))
        list.add(HomeModel("https://m.media-amazon.com/images/I/61y0Epu6YtL._SX679_.jpg", "Fragrance"))
        list.add(HomeModel("https://m.media-amazon.com/images/I/71s7RCZyOsL._SY395_.jpg", "Footwear"))
        list.add(HomeModel("https://m.media-amazon.com/images/I/41uemn6oABL._AC_UL320_.jpg", "Watches"))
        list.add(HomeModel("https://m.media-amazon.com/images/I/71Ppuph2B3L._AC_UL320_.jpg", "Jewellery"))
        list.add(HomeModel("https://m.media-amazon.com/images/I/61nPtGyMrdS._AC_UL320_.jpg","Bags & Handbags"))
        list.add(HomeModel("https://m.media-amazon.com/images/G/31/img23/Fashion/AF/Flip/Winterwearflip/HALOS/Main/beauty._SS300_QL85_FMpng_.png","Beauty"))
        list.add(HomeModel("https://m.media-amazon.com/images/I/61xkoSbMMPL._AC_UL320_.jpg","Luxury"))

        fragmentadapter = CategoriesAdapter(requireActivity(), list, object : RecyclerviewOnClick{
            override fun onClick(position: Int, viewType: Int, view: View) {
                val intent = Intent(context, ProductListActivity::class.java)
                intent.putExtra("product", position)
                intent.putExtra("type", "categories")
                startActivity(intent)
            }
        })
        recyclerView.adapter = fragmentadapter

        }
}

