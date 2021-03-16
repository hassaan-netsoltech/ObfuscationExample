package com.example.obfuscationexample

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Model(
        @Expose
        @SerializedName("naam")
        val name:String,

        @Expose
        @SerializedName("aeyD")
        val id:Int,

        @Expose
        @SerializedName("raqam")
        val balance:Double
):Parcelable
