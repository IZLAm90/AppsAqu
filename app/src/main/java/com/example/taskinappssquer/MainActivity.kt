package com.example.taskinappssquer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.taskinappssquer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        // val btn :Button=findViewById(R.id.Btn)
        // val test :TextView =findViewById(R.id.show)
        binding.Btn.setOnClickListener {
            binding.show.setText(R.string.myname)
        }

    }
}