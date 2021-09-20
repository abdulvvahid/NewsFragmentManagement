package com.noor.newsfragmentmanagement.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.noor.newsfragmentmanagement.databinding.FragmentWriterBinding
import com.noor.newsfragmentmanagement.util.Constants.Companion.WRITER_IMAGE
import com.noor.newsfragmentmanagement.util.Constants.Companion.WRITER_NAME

class WriterFragment : Fragment() {

    private var imageId: Int? = null
    private var name: String? = null

    private lateinit var binding: FragmentWriterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            imageId = it.getInt(WRITER_IMAGE)
            name = it.getString(WRITER_NAME)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWriterBinding.inflate(layoutInflater, container, false)

        binding.profileImage.setImageResource(imageId!!)
        binding.tvWriterName1.text = name

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(writerImageId: Int, writerName: String) =
            WriterFragment().apply {
                arguments = Bundle().apply {
                    putInt(WRITER_IMAGE, writerImageId)
                    putString(WRITER_NAME, writerName)
                }
            }
    }
}