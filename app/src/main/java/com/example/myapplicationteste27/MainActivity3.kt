package com.example.myapplicationteste27

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
//Teste TPC3  17:30 -19:30
class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Aqui dentro meter
        Log.d("MainActivity", "onCreate")
//Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()
        Toast.makeText(this,R.string.app_name, Toast.LENGTH_SHORT).show()
    }
    // Tenho de adicionar o OnPause,OnResume e OnStop
    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause")
        Toast.makeText(this,R.string.textoOnPause, Toast.LENGTH_SHORT).show()
    }
    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume")
        Toast.makeText(this,R.string.textoOnResume, Toast.LENGTH_SHORT).show()
    }
    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop")
    }

}