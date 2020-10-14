package com.github.falchio.engdictionaryapp.viewmodel

import com.github.falchio.engdictionaryapp.model.Model
import com.github.falchio.engdictionaryapp.model.ModelImpl

class MainViewModel: BaseViewModel {
    val model : Model = ModelImpl()
    override fun getWord(word: String) {
        model.getData(word)
    }
}