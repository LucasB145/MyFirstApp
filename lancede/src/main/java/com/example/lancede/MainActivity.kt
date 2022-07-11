package com.example.lancede

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.lancede.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var ld: LancerDeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        ld = ViewModelProvider(this).get(LancerDeViewModel::class.java)

        binding.textNumberMaxFaces.hint = ld.nbFaces.toString()
        binding.textViewValeurD.text = ld.lancer.toString()
        binding.buttonLancer.setOnClickListener{
            ld.lanceDe()
            binding.textViewValeurD.text = ld.lancer.toString()
        }
        binding.updateMax.setOnClickListener {
            val nbFacesMax = binding.textNumberMaxFaces.text.toString().toIntOrNull()
            if(nbFacesMax==null){
                Toast.makeText(this, "Merci de rentrer un nombre", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }else{
                ld.nbFaces = nbFacesMax
                Toast.makeText(this, "Nombre de faces : $nbFacesMax", Toast.LENGTH_SHORT).show()
            }
        }
    }
}