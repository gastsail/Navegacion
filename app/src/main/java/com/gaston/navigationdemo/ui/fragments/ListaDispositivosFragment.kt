package com.gaston.navigationdemo.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.gaston.navigationdemo.R
import kotlinx.android.synthetic.main.fragment_lista_dispositivos.*

/**
 * A simple [Fragment] subclass.
 */
class ListaDispositivosFragment : Fragment() {

    private lateinit var adapter:DispositivosAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lista_dispositivos, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = DispositivosAdapter(requireActivity())
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->

            val action = ListaDispositivosFragmentDirections.actionListaDispositivosFragmentToDetallesFragment()
            action.setNombre(adapter.getItem(position))
            action.setEdad(40)
            findNavController().navigate(action)
        }
    }


}
