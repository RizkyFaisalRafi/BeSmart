package com.rifara.besmart.ui.splash_screen

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rifara.besmart.R

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        appContext = applicationContext
        supportActionBar?.hide()

    }

    companion object{
        lateinit var appContext: Context
    }

}