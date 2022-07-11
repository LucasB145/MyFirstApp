package com.example.racontemoiunehistoire

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigationsafeargs.databinding.FragmentFormulaireBinding
import com.example.racontemoiunehistoire.databinding.FragmentFormulaireBinding

class FormulaireFragment : Fragment() {

    lateinit var binding: FragmentFormulaireBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFormulaireBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            val story = Story(
                binding.editTextPersonnage.text.toString(),
                binding.editTextLieu.text.toString(),
            )
            //On prépare la navigation avec le user en argument
            val action = FormulaireFragmentDirections.actionFormToResult(story)
            //On navigue vers la direction
            Navigation.findNavController(view).navigate(action)
        }
    }
}