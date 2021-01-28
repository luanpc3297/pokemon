package com.pokemon.pokedex.ui.move

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.pokemon.pokedex.R

class MoveFragment : Fragment(R.layout.fragment_moves) {

//    private lateinit var dashboardViewModel: MoveViewModel
//
//    override fun onCreateView(
//            inflater: LayoutInflater,
//            container: ViewGroup?,
//            savedInstanceState: Bundle?
//    ): View? {
//        dashboardViewModel =
//                ViewModelProvider(this).get(MoveViewModel::class.java)
//        val root = inflater.inflate(R.layout.fragment_moves, container, false)
////        val textView: TextView = root.findViewById(R.id.navigation_moves)
////        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
////            textView.text = it
////        })
//        return root
//    }
}