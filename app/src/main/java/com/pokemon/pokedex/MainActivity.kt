package com.pokemon.pokedex

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.pokemon.pokedex.ui.item.ItemFragment
import com.pokemon.pokedex.ui.move.MoveFragment
import com.pokemon.pokedex.ui.pokemon.PokemonFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pokemonFragment=PokemonFragment()
        val moveFragment=MoveFragment()
        val itemFragment=ItemFragment()

        setCurrentFragment(pokemonFragment)

        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.navigation_pokemon -> {
                    // Respond to navigation item 1 click
                    true
                }
                R.id.navigation_moves -> {
                    // Respond to navigation item 2 click
                    //sfgdfhfghg
                    true
                }
                R.id.navigation_items -> {
                    // Respond to navigation item 2 click
                    true
                }

                else -> false
            }
        }
    }
    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }
}