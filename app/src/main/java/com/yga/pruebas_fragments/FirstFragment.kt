package com.yga.pruebas_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FirstFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var name: String? = null
    private var address: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            name = it.getString(NAME_BUNDLE)
            address = it.getString(ADDRESS_BUNDLE)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    companion object { //este metodo lo que hace es devolverte el fragment
        private const val NAME_BUNDLE = "name_bundle"
        private const val ADDRESS_BUNDLE = "address_bundle"
        @JvmStatic
        fun newInstance(name: String, address: String) =
            FirstFragment()
                .apply {
                arguments = Bundle().apply {
                    putString(NAME_BUNDLE, name)
                    putString(ADDRESS_BUNDLE, address)
                }
            }
    }
}