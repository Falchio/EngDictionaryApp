package com.github.falchio.engdictionaryapp.view

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import com.github.falchio.engdictionaryapp.R
import com.github.falchio.engdictionaryapp.model.AppState

class MainActivity : BaseView<AppState>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textForSearch: EditText = findViewById(R.id.text_for_search)
        val searchButton: ImageButton = findViewById(R.id.start_search_button)
        searchButton.setOnClickListener {
                Toast.makeText(
                    this,
                    textForSearch.text,
                    Toast.LENGTH_SHORT
                ).show()
        }
    }

    override fun renderData(datamodel: AppState) {
        TODO("Not yet implemented")
    }
}