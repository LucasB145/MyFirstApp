package com.example.findviewbyid

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewHello = findViewById<TextView>(R.id.textViewHello)
        val editTextCava = findViewById<EditText>(R.id.editTextCava)
        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)

        textViewHello.text = "Hello"
        editTextCava.setText("Comment allez vous ?")
        ratingBar.rating = 3f
        
        val btnToast = findViewById<Button>(R.id.btnToast)

        btnToast.setOnClickListener {
            Toast.makeText(this, "Clic !", Toast.LENGTH_SHORT).show()
            Snackbar.make(it,"Ploc !",Snackbar.LENGTH_SHORT).show()
        }
    }
}