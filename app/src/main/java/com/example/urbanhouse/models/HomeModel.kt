package com.example.urbanhouse.models

import android.os.Parcel
import android.os.Parcelable


data class HomeModel(
    val image:String? = " ",
    val name:String? = " "
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun describeContents(): Int {

        return TODO("Provide the return value")
    }

    override fun writeToParcel(p0: Parcel, p1: Int) {
        TODO("Not yet implemented")
    }

    companion object CREATOR : Parcelable.Creator<HomeModel> {
        override fun createFromParcel(parcel: Parcel): HomeModel {
            return HomeModel(parcel)
        }

        override fun newArray(size: Int): Array<HomeModel?> {
            return arrayOfNulls(size)
        }
    }
}
