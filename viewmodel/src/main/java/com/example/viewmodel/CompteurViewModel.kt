package com.example.viewmodel

import androidx.lifecycle.ViewModel

class CompteurViewModel : ViewModel() {
    var compteur = 0;
    fun increment() = ++compteur
}