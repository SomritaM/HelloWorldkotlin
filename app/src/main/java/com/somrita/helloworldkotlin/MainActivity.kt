package com.somrita.helloworldkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sammy=findViewById<TextView>(R.id.sammy)
        sammy.setText("Welcome to Kotlin")
    }
}
