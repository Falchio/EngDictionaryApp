package com.github.falchio.engdictionaryapp.view

import androidx.appcompat.app.AppCompatActivity
import com.github.falchio.engdictionaryapp.model.AppState

abstract class BaseView<T: AppState>: AppCompatActivity() {

    abstract fun renderData(datamodel: T)
}