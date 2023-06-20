package com.remedios.fitnessgymapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat


import com.remedios.fitnessgymapp.databinding.ActivitySplashscreenBinding

class SplashScreen:AppCompatActivity() {
    private lateinit var binding: ActivitySplashscreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashscreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler(Looper.getMainLooper()).postDelayed({
            binding.animation1.playAnimation()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }, 9000)



    }

}

