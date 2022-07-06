package com.example.vraioufaux

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.vraioufaux.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val arrayListQR = arrayOf(
        QuestionReponse("Quelle est la circonférence du soleil ?",true),
        QuestionReponse("Comment s'appelle le fameux plat vietnamien de soupe aux vermicelles de riz",false),
        QuestionReponse("Combien y-a-t'il de mois dans une année ?",true),
        QuestionReponse("Est-ce qu'Android est un langage de programmation",false),
        QuestionReponse("Un iphone tourne t-il sur Android",false),
        QuestionReponse("Philéas va t-il amener les pains aux choc demain?",false),
        QuestionReponse("Comment s'appelle votre soeur",true),
    )

    var index = 0

    var score = 0

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.q = arrayListQR[index]
        showScore()
        binding.buttonFalse.setOnClickListener{checkUserResponse(false)}
        binding.buttonVrai.setOnClickListener{checkUserResponse(true)}

    }

    fun checkUserResponse(responseUser:Boolean){
        if(index > arrayListQR.size-1 )return
        if (responseUser == arrayListQR[index].reponse){
            score++
            showScore()
        }
        if(++index <= (arrayListQR.size -1)){
            binding.q = arrayListQR[index]
        }
    }

    fun showScore() {
        binding.textViewPoints.text = "${score.toString()}/${arrayListQR.size}"
    }

}