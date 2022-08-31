package com.nimantha.android.myapp3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nimantha.android.myapp3.adapter.Adapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerview: RecyclerView = findViewById(R.id.recyclerview)

        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = Adapter()

        var addNew:Button = findViewById(R.id.addLocation)
        addNew.setOnClickListener {

                val intent = Intent(this@MainActivity,AddLocationActivity::class.java)
                startActivity(intent)
        }


    }




}