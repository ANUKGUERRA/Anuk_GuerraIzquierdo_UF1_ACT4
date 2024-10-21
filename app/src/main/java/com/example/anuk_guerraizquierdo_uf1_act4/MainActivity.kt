package com.example.anuk_guerraizquierdo_uf1_act4

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val logCat = findViewById<Button>(R.id.LogCat)
        logCat.setOnClickListener{
            Log.d("LogCat:", "S'ha clicat el boto (logCat)")
        }

        val toast = findViewById<Button>(R.id.Toast)
        toast.setOnClickListener{
            Toast.makeText(this, "S'ha clicat el boto (toast)", Toast.LENGTH_SHORT).show();
        }
    }

}