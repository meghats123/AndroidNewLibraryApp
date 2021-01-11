package com.megha.androidmylibrarynewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun buttonclick(view: View) {
        var getUsername=findViewById<EditText>(R.id.uname);
        var getPassword=findViewById<EditText>(R.id.pass);
        var u=getUsername.text.toString();
        var p=getPassword.text.toString();
        if(u.equals("admin")and p.equals("1234")){
            intent= Intent(this,NewActivity::class.java);
            startActivity(intent);

        }
        else{
            Toast.makeText(this,"Invalid User",Toast.LENGTH_LONG).show();
        }

    }

    fun register(view: View) {
        intent= Intent(this,RegisterActivity::class.java);
        startActivity(intent);
    }


}