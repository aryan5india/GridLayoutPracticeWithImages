package com.ajaykumar.gridlayoutpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class EditTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)

        val et = findViewById<EditText>(R.id.editTextTextPersonName)
        val btnItemAdded = findViewById<Button>(R.id.buttonItemAdded)
        val message = Error("Something wrong")

        btnItemAdded.setOnClickListener {
            val input = et.text?.toString()
//            textView5.text = input
        }
    }
}