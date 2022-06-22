package com.example.reservationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import android.widget.ImageView

class JackSplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jack_splash)

        val splashLogo: ImageView = findViewById(R.id.SplashLogo)
        val sideAnimation= AnimationUtils.loadAnimation(this,R.anim.slide)
        splashLogo.startAnimation(sideAnimation)

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent = Intent(this,JackMaps::class.java)
            startActivity(intent)
            finish()
        },4000)
    }
}