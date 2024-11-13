package com.example.myapp18

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class AnimalInfoFragment : Fragment() {

    private var animalType: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            animalType = it.getString("animal_type")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_animal_info, container, false)

        val textView = view.findViewById<TextView>(R.id.text_view_info)

        textView.text = when (animalType) {
            "dog" -> getString(R.string.dog_info)
            "cat" -> getString(R.string.cat_info)
            else -> ""
        }

        return view
    }

    companion object {
        fun newInstance(animalType: String) =
            AnimalInfoFragment().apply {
                arguments = Bundle().apply {
                    putString("animal_type", animalType)
                }
            }
    }
}
