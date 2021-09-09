package com.noor.newsfragmentmanagement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.noor.newsfragmentmanagement.databinding.FragmentHeadNewsBinding
import com.noor.newsfragmentmanagement.util.Constants.Companion.HEAD_IMAGE
import com.noor.newsfragmentmanagement.util.Constants.Companion.HEAD_TITLE

class HeadNewsFragment : Fragment() {

    private lateinit var binding: FragmentHeadNewsBinding

    private var imageId: Int? = null
    private var titleText: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            imageId = it.getInt(HEAD_IMAGE)
            titleText = it.getString(HEAD_TITLE)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHeadNewsBinding.inflate(layoutInflater, container, false)

        binding.apply {
            ivHeadNews.setImageResource(imageId!!)
            tvHeadNews.text = titleText
        }

        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance(headImageId: Int, headText: String) =
            HeadNewsFragment().apply {
                arguments = Bundle().apply {
                    putInt(HEAD_IMAGE, headImageId)
                    putString(HEAD_TITLE, headText)
                }
            }
    }
}