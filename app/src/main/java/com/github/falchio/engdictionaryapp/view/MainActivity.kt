package com.github.falchio.engdictionaryapp.view

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import com.github.falchio.engdictionaryapp.R
import com.github.falchio.engdictionaryapp.viewmodel.BaseViewModel
import com.github.falchio.engdictionaryapp.viewmodel.MainViewModel

class MainActivity:BaseActivity () {
    val viewmodel :BaseViewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textForSearch: EditText = findViewById(R.id.text_for_search)
        val searchButton: ImageButton = findViewById(R.id.start_search_button)
        searchButton.setOnClickListener {
                viewmodel.getWord(textForSearch.text.toString())
        }
    }

//    override fun renderData() {
//        TODO("Not yet implemented")
//    }
}