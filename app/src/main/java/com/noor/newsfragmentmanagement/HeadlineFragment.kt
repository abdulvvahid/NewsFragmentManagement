package com.noor.newsfragmentmanagement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.noor.newsfragmentmanagement.databinding.FragmentHeadlineBinding

class HeadlineFragment : Fragment() {

    private lateinit var binding: FragmentHeadlineBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHeadlineBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            HeadlineFragment().apply {
            }
    }
}