package com.pokemon.pokedex.ui.item

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.pokemon.pokedex.R

class ItemFragment : Fragment(R.layout.fragment_items) {

//    private lateinit var notificationsViewModel: ItemViewModel
//
//    override fun onCreateView(
//            inflater: LayoutInflater,
//            container: ViewGroup?,
//            savedInstanceState: Bundle?
//    ): View? {
//        notificationsViewModel =
//                ViewModelProvider(this).get(ItemViewModel::class.java)
//        val root = inflater.inflate(R.layout.fragment_items, container, false)
//        val textView: TextView = root.findViewById(R.id.navigation_items)
//        notificationsViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
//        return root
//    }
}