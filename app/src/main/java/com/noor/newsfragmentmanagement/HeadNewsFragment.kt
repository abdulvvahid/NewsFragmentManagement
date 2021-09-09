package com.noor.newsfragmentmanagement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.noor.newsfragmentmanagement.databinding.FragmentHeadNewsBinding

class HeadNewsFragment : Fragment() {

    private lateinit var binding: FragmentHeadNewsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHeadNewsBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            HeadNewsFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}