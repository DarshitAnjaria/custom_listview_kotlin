package com.android.myfirstkotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    companion object {
        const val KEY_NAME = "name"
    }

    lateinit var etName : EditText
    lateinit var btnClick : Button
    lateinit var btnIntroduce : Button
    lateinit var btnNext : Button
    lateinit var tvName : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById(R.id.etName)
        btnClick = findViewById(R.id.btnClick)
        btnIntroduce = findViewById(R.id.btnIntroduce)
        btnNext = findViewById(R.id.btnNext)
        tvName = findViewById(R.id.tvName)

        btnClick.setOnClickListener{
            val name = etName.text
            tvName.text = "Click as $name"
        }

        btnIntroduce.setOnClickListener{
            val name = etName.text
            tvName.text = "Introducing $name"
        }

        btnNext.setOnClickListener{

            val name : String = etName.text.toString()

            startActivity(Intent(applicationContext, SecondActivity::class.java)
                .putExtra(KEY_NAME, name))

        }
    }
}
