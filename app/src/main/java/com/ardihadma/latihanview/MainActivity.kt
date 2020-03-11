package com.ardihadma.latihanview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.content.Intent

class MainActivity : AppCompatActivity() {

    // Ini sialisasi variable kemungkinan null
    var button1 : Button? = null

    //inisialisasi variable non nul
    private lateinit var button2:Button
    private lateinit var button3:Button
    private lateinit var button4:Button
    private lateinit var button5:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inisialisasi variable button finviewbyid di layout
        button1 = findViewById(R.id.bt1) as Button
        button2 = findViewById(R.id.bt2)
        button3 = findViewById(R.id.bt3)
        button4 = findViewById(R.id.bt4)
        button5 = findViewById(R.id.bt5)

        button1?.setOnClickListener{
            Toast.makeText(this, "Clicked Btn 1"+button1?.text, Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener{
            Toast.makeText(this, "Clicked Btn 2"+button2.text, Toast.LENGTH_SHORT).show()
        }

        //Membuat aksi button3 menuju aktifity2
        button3.setOnClickListener{
            startActivity(Intent(this, Activity2::class.java))
        }

        button4.setOnClickListener{
            startActivity(Intent(this, Activity3::class.java))
        }

        button5.setOnClickListener{
            startActivity(Intent(this, Activity4::class.java))
        }
    }
}
