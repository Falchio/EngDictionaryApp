package com.github.falchio.engdictionaryapp.model.repository.remote.retrofit_skyeng

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface SkyEngApi {
    @GET("words/search")
    fun search(@Query("search") wordToSearch: String): Observable<List<SkyEngBaseData>>
}