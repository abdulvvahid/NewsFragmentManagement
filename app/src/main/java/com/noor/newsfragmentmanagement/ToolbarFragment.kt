package com.noor.newsfragmentmanagement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.noor.newsfragmentmanagement.databinding.FragmentToolbarBinding

class ToolbarFragment : Fragment() {

    private lateinit var binding: FragmentToolbarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentToolbarBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            ToolbarFragment().apply {
            }
    }
}