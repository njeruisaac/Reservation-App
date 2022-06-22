package com.example.reservationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import android.widget.ImageView

class TatuSplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tatu_splash)
        val splashLogo: ImageView = findViewById(R.id.SplashLogo)
        val sideAnimation= AnimationUtils.loadAnimation(this,R.anim.slide)
        splashLogo.startAnimation(sideAnimation)

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent = Intent(this,TatuMaps::class.java)
            startActivity(intent)
            finish()
        },4000)
    }
}