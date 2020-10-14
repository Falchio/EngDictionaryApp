package com.github.falchio.engdictionaryapp.model

interface Model {
    fun getData(word:String)
    fun isOnline(): Boolean
}
