package com.noor.newsfragmentmanagement.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.noor.newsfragmentmanagement.databinding.FragmentNewsBinding
import com.noor.newsfragmentmanagement.util.Constants.Companion.NEWS_DATE
import com.noor.newsfragmentmanagement.util.Constants.Companion.NEWS_DESC
import com.noor.newsfragmentmanagement.util.Constants.Companion.NEWS_IMAGE
import com.noor.newsfragmentmanagement.util.Constants.Companion.NEWS_TITLE

class NewsFragment : Fragment() {

    private var imageId: Int? = null
    private var title: String? = null
    private var desc: String? = null
    private var date: String? = null

    private lateinit var binding: FragmentNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            imageId = it.getInt(NEWS_IMAGE)
            title = it.getString(NEWS_TITLE)
            desc = it.getString(NEWS_DESC)
            date = it.getString(NEWS_DATE)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewsBinding.inflate(layoutInflater, container, false)

        binding.apply {
            imageRes = imageId
            titleXml = title
            descXml = desc
            dateXml = date
        }

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(image: Int, title: String, desc: String, date: String) =
            NewsFragment().apply {
                arguments = Bundle().apply {
                    putInt(NEWS_IMAGE, image)
                    putString(NEWS_TITLE, title)
                    putString(NEWS_DESC, desc)
                    putString(NEWS_DATE, date)
                }
            }
    }
}