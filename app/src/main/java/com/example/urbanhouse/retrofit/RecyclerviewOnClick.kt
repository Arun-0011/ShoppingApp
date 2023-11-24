package com.example.urbanhouse.retrofit

import android.view.View

interface RecyclerviewOnClick {
    fun onClick(position: Int, viewType: Int, view: View)
}