package com.rifara.besmart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.rifara.besmart.databinding.ActivityMainBinding
import com.rifara.besmart.ui.splash_screen.SplashScreenActivity.Companion.appContext

class MainActivity : AppCompatActivity() {

    private lateinit var _binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        appContext = applicationContext

        supportActionBar?.hide()
        createBottomNavigation()

    }

    private fun createBottomNavigation() {

        _binding.apply {
            val navController = findNavController(R.id.nav_host_fragment)
        }

    }
}