package com.example.larestopartnersorigin.data.dto

import com.example.larestopartnersorigin.data.vo.Picture
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PictureDto(
    @SerializedName("image_url")
    @Expose
    var imageUrl: String? = null,
    @SerializedName("width")
    @Expose
    var width: Int? = null,
    @SerializedName("is_silhouette")
    @Expose
    var isSilhouette: Boolean,
    @SerializedName("height")
    @Expose
    var height: Int? = null,
)

fun PictureDto.toPicture(): Picture {
    return Picture(imageUrl = imageUrl, width = width, isSilhouette = isSilhouette, height = height)
}