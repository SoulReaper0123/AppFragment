package com.example.frogmint

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example: Navigate to LoginFragment when the activity starts
        findNavController(R.id.nav).navigate(R.id.loginFragment)
    }
}