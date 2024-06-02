package com.marisma.proyectorecu.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int=2
    override fun createFragment(position: Int): Fragment {
        return when (position){

            0 -> Serie1Fragment()
            1 -> Serie2Fragment()

            else -> throw IllegalArgumentException("Posicion invalida: $position")

        }
    }
}