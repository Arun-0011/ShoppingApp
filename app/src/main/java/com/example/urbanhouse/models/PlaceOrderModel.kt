package com.example.urbanhouse.models

import android.os.Parcel
import android.os.Parcelable

data class PlaceOrderModel(
    var img : String?,
    var name : String?,
    var price : String?,
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(img)
        parcel.writeString(name)
        parcel.writeString(price)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PlaceOrderModel> {
        override fun createFromParcel(parcel: Parcel): PlaceOrderModel {
            return PlaceOrderModel(parcel)
        }

        override fun newArray(size: Int): Array<PlaceOrderModel?> {
            return arrayOfNulls(size)
        }
    }
}
