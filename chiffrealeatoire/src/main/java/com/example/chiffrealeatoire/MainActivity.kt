package com.example.chiffrealeatoire

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val borneMin = findViewById<EditText>(R.id.editNumberBorneMin)
        val borneMax = findViewById<EditText>(R.id.editNumberBorneMax)
        val resultat = findViewById<TextView>(R.id.textViewResultat)
        val btnGenerate = findViewById<Button>(R.id.buttonGenerate)

        btnGenerate.setOnClickListener {

            val one = Integer.parseInt(borneMin.text.toString())
            val two = Integer.parseInt(borneMax.text.toString())

            if (one < two) {
                resultat.text = (one..two).random().toString()
            } else if (one > two) {
                resultat.text = (two..one).random().toString()
            } else if (one == two) {
                resultat.text = one.toString()
            }else{
                resultat.text = "impossible"
            }
        }
    }
}