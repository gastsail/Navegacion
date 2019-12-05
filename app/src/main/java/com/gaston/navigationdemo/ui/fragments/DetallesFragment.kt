package com.gaston.navigationdemo.ui.fragments


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.gaston.navigationdemo.R

/**
 * A simple [Fragment] subclass.
 */
class DetallesFragment : Fragment() {

    private var nombre:String = ""
    private var edad = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        nombre = DetallesFragmentArgs.fromBundle(arguments!!).nombre!!
        edad = DetallesFragmentArgs.fromBundle(arguments!!).edad
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detalles, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d("Nombre:","$nombre $edad")

    }


}
