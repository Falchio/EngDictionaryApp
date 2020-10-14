package com.github.falchio.engdictionaryapp.model.repository.remote

import android.util.Log
import com.github.falchio.engdictionaryapp.model.repository.remote.retrofit_skyeng.SkyEngApi
import com.github.falchio.engdictionaryapp.model.repository.remote.retrofit_skyeng.SkyEngBaseData
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RemoteRepositoryImpl() : RemoteRepository {
    val retrofit = createRetrofit()
    override fun getData(word: String) {
        val something = createRetrofit().create(SkyEngApi::class.java).search("brain")
    }


    companion object {
        private const val BASE_URL_SKYENG_API = "https://dictionary.skyeng.ru/api/public/v1/"
    }


    private fun createRetrofit(): Retrofit {
        val interceptor = HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)
        val client = OkHttpClient.Builder()
            .addInterceptor(interceptor).build()

        val baseUrl = BASE_URL_SKYENG_API

        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(client)
            .build()
    }

}