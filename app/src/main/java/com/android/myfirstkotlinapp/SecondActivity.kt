package com.android.myfirstkotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var tvFetch : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        tvFetch = findViewById(R.id.tvFetch)

        val fetch = intent.getStringExtra(MainActivity.KEY_NAME)

        tvFetch.text = "$fetch"
    }
}
