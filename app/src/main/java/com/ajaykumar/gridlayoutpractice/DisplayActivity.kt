package com.ajaykumar.gridlayoutpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class DisplayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

       val addAnItem = findViewById<Button>(R.id.buttonInputPage)
        addAnItem.setOnClickListener {
            startActivity(Intent(this, EditTextActivity::class.java))

        }
    }
}