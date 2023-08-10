package com.example.meuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tvPrincipal = findViewById<TextView>(R.id.textView)
        var botaoPrincipal = this.findViewById<Button>(R.id.button)

        botaoPrincipal.setOnClickListener { tvPrincipal.setText("Pressione")}


    }
}