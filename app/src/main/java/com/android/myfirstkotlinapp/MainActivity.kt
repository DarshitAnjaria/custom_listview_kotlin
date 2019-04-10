package com.android.myfirstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        val list = mutableListOf<Nature>()

        list.add(Nature(R.drawable.forest, "Forest"))
        list.add(Nature(R.drawable.green, "Green"))
        list.add(Nature(R.drawable.jungle, "Jungle"))
        list.add(Nature(R.drawable.mountain, "Mountain"))
        list.add(Nature(R.drawable.nature, "Nature"))
        list.add(Nature(R.drawable.sunset, "Sunset"))

        val adapter = myListAdapter(this, R.layout.itemview, list)
        listView.adapter = adapter
    }
}
