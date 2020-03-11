package com.ardihadma.latihanview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity2 : AppCompatActivity() {

    //inisialisasi variable button
    private lateinit var button1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        //Membuat fungsi kembali pada button
        button1 = findViewById(R.id.btn1)
        button1.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
