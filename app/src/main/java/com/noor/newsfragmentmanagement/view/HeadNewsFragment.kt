package com.noor.newsfragmentmanagement.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.noor.newsfragmentmanagement.databinding.FragmentHeadNewsBinding
import com.noor.newsfragmentmanagement.util.Constants.Companion.HEAD_DESC
import com.noor.newsfragmentmanagement.util.Constants.Companion.HEAD_IMAGE
import com.noor.newsfragmentmanagement.util.Constants.Companion.HEAD_TITLE

class HeadNewsFragment : Fragment() {

    private lateinit var binding: FragmentHeadNewsBinding

    private var imageId: Int? = null
    private var titleText: String? = null
    private var titleDesc: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            imageId = it.getInt(HEAD_IMAGE)
            titleText = it.getString(HEAD_TITLE)
            titleDesc = it.getString(HEAD_DESC)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHeadNewsBinding.inflate(layoutInflater, container, false)

        binding.apply {
            title = titleText
            imageRes = imageId
            ivHeadNews.setOnClickListener {
                val detailFragment = DetailFragment.newInstance(imageId!!, titleText!!, titleDesc!!)
                (activity as MainActivity).loadDetail(detailFragment)
            }
        }

        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance(headImageId: Int, headText: String, headDesc: String) =
            HeadNewsFragment().apply {
                arguments = Bundle().apply {
                    putInt(HEAD_IMAGE, headImageId)
                    putString(HEAD_TITLE, headText)
                    putString(HEAD_DESC, headDesc)
                }
            }
    }
}