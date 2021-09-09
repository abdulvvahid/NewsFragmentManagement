package com.noor.newsfragmentmanagement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.noor.newsfragmentmanagement.databinding.FragmentDetailBinding
import com.noor.newsfragmentmanagement.util.Constants.Companion.DETAIL_DESC
import com.noor.newsfragmentmanagement.util.Constants.Companion.DETAIL_ID
import com.noor.newsfragmentmanagement.util.Constants.Companion.DETAIL_TITLE

class DetailFragment : Fragment() {

    private var imageId: Int? = null
    private var textTitle: String? = null
    private var textDesc: String? = null

    private lateinit var binding: FragmentDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            imageId = it.getInt(DETAIL_ID)
            textTitle = it.getString(DETAIL_TITLE)
            textDesc = it.getString(DETAIL_DESC)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(layoutInflater, container, false)

        binding.ivDetail.setImageResource(imageId!!)
        binding.tvDetailNewsTitle.text = textTitle
        binding.tvDetailNewsDesc.text = textDesc

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(image: Int, title: String, desc: String) =
            DetailFragment().apply {
                arguments = Bundle().apply {
                    putInt(DETAIL_ID, image)
                    putString(DETAIL_TITLE, title)
                    putString(DETAIL_DESC, desc)
                }
            }
    }
}