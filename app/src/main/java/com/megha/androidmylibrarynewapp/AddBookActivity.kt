package com.megha.androidmylibrarynewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class AddBookActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_book)
    }



    fun back(view: View) {
        intent= Intent(this,NewActivity::class.java);
        startActivity(intent);
    }
}