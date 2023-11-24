package com.example.urbanhouse.models

import android.os.Parcel
import android.os.Parcelable

data class ProductModel(
    val img: String?,
    val name: String?,
    val desc: String?,
    val price: String?
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(img)
        parcel.writeString(name)
        parcel.writeString(desc)
        parcel.writeString(price)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ProductModel> {
        override fun createFromParcel(parcel: Parcel): ProductModel {
            return ProductModel(parcel)
        }

        override fun newArray(size: Int): Array<ProductModel?> {
            return arrayOfNulls(size)
        }
    }
}
