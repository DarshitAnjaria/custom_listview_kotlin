package com.android.myfirstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var etName : EditText
    lateinit var btnClick : Button
    lateinit var tvName : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById(R.id.etName)
        btnClick = findViewById(R.id.btnClick)
        tvName = findViewById(R.id.tvName)

        btnClick.setOnClickListener { this }
    }

    override fun onClick(v: View?) {
        val name = etName.text
        tvName.text = name
    }
}
