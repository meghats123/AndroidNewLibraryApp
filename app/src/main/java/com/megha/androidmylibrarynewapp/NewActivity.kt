package com.megha.androidmylibrarynewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
    }

    fun addbook(view: View) {
        intent= Intent(this,AddBookActivity::class.java);
        startActivity(intent);
    }

    fun searchbook(view: View) {
        intent= Intent(this,SearchActivity::class.java);
        startActivity(intent);

    }

    fun backtologin(view: View) {
        intent= Intent(this,MainActivity::class.java);
        startActivity(intent);

    }
}