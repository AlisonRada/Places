package com.alisonrada.places


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    private var b1: Button? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        // Inflate the layout for this fragment

        b1 = view?.findViewById(R.id.atlantico_btn) as Button;

        return inflater.inflate(R.layout.fragment_main, container, false)
    }

}
