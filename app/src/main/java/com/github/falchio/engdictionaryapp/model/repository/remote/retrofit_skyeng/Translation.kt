package com.github.falchio.engdictionaryapp.model.repository.remote.retrofit_skyeng

import com.google.gson.annotations.SerializedName

data class Translation (

	@SerializedName("text") val text : String,
	@SerializedName("note") val note : String
)