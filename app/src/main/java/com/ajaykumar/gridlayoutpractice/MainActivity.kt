package com.ajaykumar.gridlayoutpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var mRecyclerView: RecyclerView
    private lateinit var mLayoutManager: GridLayoutManager
    private lateinit var mAdapter: GridViewAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     val cardImages : Array<String> = resources.getStringArray(R.array.cardImages)
     val cardTitle : Array<String> = resources.getStringArray(R.array.cardTitle)

        mAdapter = GridViewAdapter(cardTitle, cardImages)
        mLayoutManager = GridLayoutManager(this, 2)
        mRecyclerView = findViewById(R.id.RecyclerView)
        mRecyclerView.apply {
            adapter = mAdapter
            layoutManager = mLayoutManager
        }

//        var etInput = findViewById<EditText>(R.id.etInput)
//        var textdis = findViewById<TextView>(R.id.textview)
        var btnAdd = findViewById<Button>(R.id.buttonAdd)

        btnAdd.setOnClickListener {
           startActivity(Intent(this, DisplayActivity::class.java))
        }


    }


}
