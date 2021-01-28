package com.pokemon.pokedex.ui.pokemon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.pokemon.pokedex.R

class PokemonFragment : Fragment(R.layout.fragment_pokemons) {

//    private lateinit var homeViewModel: PokemonViewModel
//
//    override fun onCreateView(
//            inflater: LayoutInflater,
//            container: ViewGroup?,
//            savedInstanceState: Bundle?
//    ): View? {
//        homeViewModel =
//                ViewModelProvider(this).get(PokemonViewModel::class.java)
//        val root = inflater.inflate(R.layout.fragment_pokemons, container, false)
////        val textView: TextView = root.findViewById(R.id.navigation_pokemon)
////        homeViewModel.text.observe(viewLifecycleOwner, Observer {
////            textView.text = it
////        })
//        return root
//    }
}