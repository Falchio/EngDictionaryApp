package com.github.falchio.engdictionaryapp.model.repository.remote

interface RemoteRepository {
    fun getData(word:String)
}