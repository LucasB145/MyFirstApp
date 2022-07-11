package com.example.lancede

import androidx.lifecycle.ViewModel

class LancerDeViewModel : ViewModel() {
    var lancer = 0;
    var nbFaces = 6
    fun lanceDe() {
        lancer = (1..nbFaces).random()
    }
    fun setMaxFaces(nbFaces : Int){
        this.nbFaces= nbFaces
    }
}