package com.noor.newsfragmentmanagement

import android.graphics.Typeface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.noor.newsfragmentmanagement.databinding.FragmentCategoryBinding

class CategoryFragment : Fragment() {

    private lateinit var binding: FragmentCategoryBinding
    private var selectedText = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCategoryBinding.inflate(layoutInflater, container, false)

        loadSetClickListeners()

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            CategoryFragment().apply {
            }
    }

    private fun loadSetClickListeners() {
        binding.tvCategory1.setOnClickListener {
            changeTextStyleNormal()
            changeTextStyleBold(1)
            selectedText = 1
        }
        binding.tvCategory2.setOnClickListener {
            changeTextStyleNormal()
            changeTextStyleBold(2)
            selectedText = 2
        }
        binding.tvCategory3.setOnClickListener {
            changeTextStyleNormal()
            changeTextStyleBold(3)
            selectedText = 3
        }
        binding.tvCategory4.setOnClickListener {
            changeTextStyleNormal()
            changeTextStyleBold(4)
            selectedText = 4
        }
        binding.tvCategory5.setOnClickListener {
            changeTextStyleNormal()
            changeTextStyleBold(5)
            selectedText = 5
        }
        binding.tvCategory6.setOnClickListener {
            changeTextStyleNormal()
            changeTextStyleBold(6)
            selectedText = 6
        }
        binding.tvCategory7.setOnClickListener {
            changeTextStyleNormal()
            changeTextStyleBold(7)
            selectedText = 7
        }
    }

    private fun changeTextStyleNormal() {
        when (selectedText) {
            1 -> {
                binding.tvCategory1.typeface = Typeface.DEFAULT
                binding.tvCategory1.setTextColor(
                    ContextCompat.getColor(
                        requireContext(),
                        R.color.white_gray
                    )
                )
            }
            2 -> {
                binding.tvCategory2.typeface = Typeface.DEFAULT
                binding.tvCategory2.setTextColor(
                    ContextCompat.getColor(
                        requireContext(),
                        R.color.white_gray
                    )
                )
            }
            3 -> {
                binding.tvCategory3.typeface = Typeface.DEFAULT
                binding.tvCategory3.setTextColor(
                    ContextCompat.getColor(
                        requireContext(),
                        R.color.white_gray
                    )
                )
            }
            4 -> {
                binding.tvCategory4.typeface = Typeface.DEFAULT
                binding.tvCategory4.setTextColor(
                    ContextCompat.getColor(
                        requireContext(),
                        R.color.white_gray
                    )
                )
            }
            5 -> {
                binding.tvCategory5.typeface = Typeface.DEFAULT
                binding.tvCategory5.setTextColor(
                    ContextCompat.getColor(
                        requireContext(),
                        R.color.white_gray
                    )
                )
            }
            6 -> {
                binding.tvCategory6.typeface = Typeface.DEFAULT
                binding.tvCategory6.setTextColor(
                    ContextCompat.getColor(
                        requireContext(),
                        R.color.white_gray
                    )
                )
            }
            7 -> {
                binding.tvCategory7.typeface = Typeface.DEFAULT
                binding.tvCategory7.setTextColor(
                    ContextCompat.getColor(
                        requireContext(),
                        R.color.white_gray
                    )
                )
            }
        }
    }

    private fun changeTextStyleBold(selection: Int) {
        when (selection) {
            1 -> {
                binding.tvCategory1.typeface = Typeface.DEFAULT_BOLD
                binding.tvCategory1.setTextColor(
                    ContextCompat.getColor(
                        requireContext(),
                        R.color.black
                    )
                )
            }
            2 -> {
                binding.tvCategory2.typeface = Typeface.DEFAULT_BOLD
                binding.tvCategory2.setTextColor(
                    ContextCompat.getColor(
                        requireContext(),
                        R.color.black
                    )
                )
            }
            3 -> {
                binding.tvCategory3.typeface = Typeface.DEFAULT_BOLD
                binding.tvCategory3.setTextColor(
                    ContextCompat.getColor(
                        requireContext(),
                        R.color.black
                    )
                )
            }
            4 -> {
                binding.tvCategory4.typeface = Typeface.DEFAULT_BOLD
                binding.tvCategory4.setTextColor(
                    ContextCompat.getColor(
                        requireContext(),
                        R.color.black
                    )
                )
            }
            5 -> {
                binding.tvCategory5.typeface = Typeface.DEFAULT_BOLD
                binding.tvCategory5.setTextColor(
                    ContextCompat.getColor(
                        requireContext(),
                        R.color.black
                    )
                )
            }
            6 -> {
                binding.tvCategory6.typeface = Typeface.DEFAULT_BOLD
                binding.tvCategory6.setTextColor(
                    ContextCompat.getColor(
                        requireContext(),
                        R.color.black
                    )
                )
            }
            7 -> {
                binding.tvCategory7.typeface = Typeface.DEFAULT_BOLD
                binding.tvCategory7.setTextColor(
                    ContextCompat.getColor(
                        requireContext(),
                        R.color.black
                    )
                )
            }
        }
        loadPage()
    }

    private fun loadPage() {
        //TODO("Not yet implemented")
    }

}