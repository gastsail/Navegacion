package com.gaston.navigationdemo.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController

import com.gaston.navigationdemo.R
import com.gaston.navigationdemo.ui.activities.LoginActivity
import kotlinx.android.synthetic.main.login_fragment.*

/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.login_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //btn_registro.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.registroFragment))

        btn_ingresar.setOnClickListener {
            (activity as LoginActivity).goToDispositivos()
        }

        btn_registro.setOnClickListener {

            val bundle = Bundle()
            bundle.putString("nombre","jose")
            findNavController().navigate(R.id.registroFragment,bundle)
        }

    }


}
