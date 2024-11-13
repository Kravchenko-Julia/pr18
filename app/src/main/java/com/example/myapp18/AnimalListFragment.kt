package com.example.myapp18

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class AnimalListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_animal_list, container, false)

        view.findViewById<Button>(R.id.button_dog).setOnClickListener {
            (activity as MainActivity).showAnimalInfo("dog")
        }

        view.findViewById<Button>(R.id.button_cat).setOnClickListener {
            (activity as MainActivity).showAnimalInfo("cat")
        }

        return view
    }
}
