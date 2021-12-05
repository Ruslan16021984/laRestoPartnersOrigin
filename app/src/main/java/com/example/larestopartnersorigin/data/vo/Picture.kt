package com.example.larestopartnersorigin.data.vo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Picture(
    var imageUrl: String? = null,
    var width: Int? = null,
    var isSilhouette: Boolean,
    var height: Int? = null,
)
