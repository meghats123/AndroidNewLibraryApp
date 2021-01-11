package com.megha.androidmylibrarynewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun mybtnclick(view: View) {
        var getName=findViewById<EditText>(R.id.name);
        var getMobileNo=findViewById<EditText>(R.id.mob);
        var getEmail=findViewById<EditText>(R.id.email);
        var getUsername=findViewById<EditText>(R.id.username);
        var getPassword=findViewById<EditText>(R.id.password);
        var getConfirmPassword=findViewById<EditText>(R.id.confirmpass);
        Toast.makeText(this,getName.text.toString() + " " + getMobileNo.text.toString() + " " + getEmail.text.toString() + " " + getUsername.text.toString() + " " + getPassword.text.toString() + " " + getConfirmPassword.text.toString(),Toast.LENGTH_LONG).show();


    }

    fun loginpage(view: View) {
        intent= Intent(this,MainActivity::class.java);
        startActivity(intent);
    }
}