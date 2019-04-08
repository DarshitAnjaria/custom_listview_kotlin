package com.android.myfirstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        val names = arrayListOf("Name 1", "Name 2", "Name 3", "Name 4")

        listView.adapter = ArrayAdapter<String>(applicationContext, android.R.layout.simple_list_item_1,names)

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(applicationContext, "You clicked : " + names[position], Toast.LENGTH_LONG).show()
        }
    }
}
