package com.example.wyszukiwarkazwierzat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.wyszukiwarkazwierzat.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (intent.hasExtra("WYSZUKIWANE_ZWIERZE")) {
            val nazwaPoszukiwanego = intent.getStringExtra("WYSZUKIWANE_ZWIERZE")

            val resID = resources.getIdentifier(nazwaPoszukiwanego, "drawable", packageName)

            if (resID == 0) {
                binding.tvTwojeZwierze.text = "Brak zwierzęcia w bazie!"
            } else {
                binding.ivTwojeZwierze.setImageResource(resID)
            }

        }
    }
}