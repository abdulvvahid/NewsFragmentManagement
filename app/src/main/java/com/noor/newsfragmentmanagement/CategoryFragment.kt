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
        binding.tvCategory1.categoryTextClicked(1)
        binding.tvCategory2.categoryTextClicked(2)
        binding.tvCategory3.categoryTextClicked(3)
        binding.tvCategory4.categoryTextClicked(4)
        binding.tvCategory5.categoryTextClicked(5)
        binding.tvCategory6.categoryTextClicked(6)
        binding.tvCategory7.categoryTextClicked(7)
    }

    private fun View.categoryTextClicked(num : Int) {
        setOnClickListener {
            changeTextStyleNormal()
            changeTextStyleBold(num)
            selectedText = num
        }
    }

    private fun changeTextStyleNormal() {
        when (selectedText) {
            1 -> {
                binding.tvCategory1.typeface = Typeface.DEFAULT
                binding.tvCategory1.setTextColor(
                    ContextCompat.getColor(
                        requireContext(),
                        R.color.gray
                    )
                )
            }
            2 -> {
                binding.tvCategory2.typeface = Typeface.DEFAULT
                binding.tvCategory2.setTextColor(
                    ContextCompat.getColor(
                        requireContext(),
                        R.color.gray
                    )
                )
            }
            3 -> {
                binding.tvCategory3.typeface = Typeface.DEFAULT
                binding.tvCategory3.setTextColor(
                    ContextCompat.getColor(
                        requireContext(),
                        R.color.gray
                    )
                )
            }
            4 -> {
                binding.tvCategory4.typeface = Typeface.DEFAULT
                binding.tvCategory4.setTextColor(
                    ContextCompat.getColor(
                        requireContext(),
                        R.color.gray
                    )
                )
            }
            5 -> {
                binding.tvCategory5.typeface = Typeface.DEFAULT
                binding.tvCategory5.setTextColor(
                    ContextCompat.getColor(
                        requireContext(),
                        R.color.gray
                    )
                )
            }
            6 -> {
                binding.tvCategory6.typeface = Typeface.DEFAULT
                binding.tvCategory6.setTextColor(
                    ContextCompat.getColor(
                        requireContext(),
                        R.color.gray
                    )
                )
            }
            7 -> {
                binding.tvCategory7.typeface = Typeface.DEFAULT
                binding.tvCategory7.setTextColor(
                    ContextCompat.getColor(
                        requireContext(),
                        R.color.gray
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