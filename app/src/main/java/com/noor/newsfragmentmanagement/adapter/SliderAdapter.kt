package com.noor.newsfragmentmanagement.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter

class SliderAdapter(
    private val fragments: ArrayList<Fragment>,
    fragmentActivity: FragmentActivity
): FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = fragments.size

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}