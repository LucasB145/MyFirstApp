package com.example.racontemoiunehistoire

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ResultFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val resultFragmentsArgs = arguments?.let { ResultFragmentArgs.fromBundle(it) }
        val textView = view.findViewById<TextView>(R.id.textViewResult)
        textView.text =
            "Il etait une fois un être nommé(e) ${resultFragmentsArgs?.story?.personnage} " +
                    " qui vivait dans un(e) ${resultFragmentsArgs?.story?.lieu} "
    }
}