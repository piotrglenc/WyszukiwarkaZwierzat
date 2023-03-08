package com.example.wyszukiwarkazwierzat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wyszukiwarkazwierzat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnWyszukaj.setOnClickListener {
            val wyszukiwaneZwierze = binding.nazwaZwierzecia.text.toString()
            val intencja = Intent(applicationContext, SecondActivity::class.java)
            intencja.putExtra("WYSZUKIWANE_ZWIERZE", wyszukiwaneZwierze)
            startActivity(intencja)
        }
    }
}