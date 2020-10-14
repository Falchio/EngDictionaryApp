package com.github.falchio.engdictionaryapp.model.repository.remote.retrofit_skyeng

import com.google.gson.annotations.SerializedName

data class SkyEngBaseData (

	@SerializedName("id") val id : Int,
	@SerializedName("text") val text : String,
	@SerializedName("meanings") val meanings : List<Meanings>
)