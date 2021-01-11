package com.megha.androidmylibrarynewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
    }

    fun button(view: View) {
        intent= Intent(this,NewActivity::class.java);
        startActivity(intent);
    }
}