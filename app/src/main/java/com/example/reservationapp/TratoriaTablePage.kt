package com.example.reservationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageButton

class TratoriaTablePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tratoria_table_page)
        val twoperson: ImageButton = findViewById(R.id.ib_twoperson)
        twoperson.setOnClickListener {
            twoperson.animate().apply {
                duration = 1000
                rotationXBy(360f)
            }.start()

            val handler= Handler((Looper.getMainLooper()))
            handler.postDelayed({
                val intent = Intent(this,TratoriaDate::class.java)
                startActivity(intent)
            },1000)



        }
        val fourperson: ImageButton = findViewById(R.id.ib_fourperson)
        fourperson.setOnClickListener {
            fourperson.animate().apply {
                duration = 1000
                rotationXBy(360f)
            }.start()

            val handler= Handler((Looper.getMainLooper()))
            handler.postDelayed({
                val intent = Intent(this,TratoriaDate::class.java)
                startActivity(intent)
            },1000)

        }
        val sixperson: ImageButton = findViewById(R.id.ib_sixperson)
        sixperson.setOnClickListener {
            sixperson.animate().apply {
                duration = 1000
                rotationXBy(360f)
            }.start()

            val handler= Handler((Looper.getMainLooper()))
            handler.postDelayed({
                val intent = Intent(this,TratoriaDate::class.java)
                startActivity(intent)
            },1000)

        }
        val eightperson: ImageButton = findViewById(R.id.ib_eightperson)
        eightperson.setOnClickListener {
            eightperson.animate().apply {
                duration = 1000
                rotationXBy(360f)
            }.start()

            val handler= Handler((Looper.getMainLooper()))
            handler.postDelayed({
                val intent = Intent(this,TratoriaDate::class.java)
                startActivity(intent)
            },1000)

        }
    }
}