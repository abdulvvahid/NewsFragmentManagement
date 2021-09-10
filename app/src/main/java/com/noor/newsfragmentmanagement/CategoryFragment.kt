package com.noor.newsfragmentmanagement

import android.graphics.Typeface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
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

    private fun changeTextStyleNormal(selection: Int) {
        when (selection) {
            1 -> binding.tvCategory1.changeTextStyleToNormal()
            2 -> binding.tvCategory2.changeTextStyleToNormal()
            3 -> binding.tvCategory3.changeTextStyleToNormal()
            4 -> binding.tvCategory4.changeTextStyleToNormal()
            5 -> binding.tvCategory5.changeTextStyleToNormal()
            6 -> binding.tvCategory6.changeTextStyleToNormal()
            7 -> binding.tvCategory7.changeTextStyleToNormal()
        }
    }

    private fun changeTextStyleBold(selection: Int) {
        when (selection) {
            1 -> binding.tvCategory1.changeTextStyleToBold()
            2 -> binding.tvCategory2.changeTextStyleToBold()
            3 -> binding.tvCategory3.changeTextStyleToBold()
            4 -> binding.tvCategory4.changeTextStyleToBold()
            5 -> binding.tvCategory5.changeTextStyleToBold()
            6 -> binding.tvCategory6.changeTextStyleToBold()
            7 -> binding.tvCategory7.changeTextStyleToBold()
        }
        loadPage()
    }

    private fun View.categoryTextClicked(num: Int) {
        setOnClickListener {
            changeTextStyleNormal(selectedText)
            changeTextStyleBold(num)
            selectedText = num
        }
    }

    private fun TextView.changeTextStyleToNormal() {
        typeface = Typeface.DEFAULT
        setTextColor(
            ContextCompat.getColor(
                requireContext(),
                R.color.gray
            )
        )
    }

    private fun TextView.changeTextStyleToBold() {
        typeface = Typeface.DEFAULT_BOLD
        setTextColor(
            ContextCompat.getColor(
                requireContext(),
                R.color.black
            )
        )
    }

    private fun loadPage() {
        //TODO("Not yet implemented")
    }

}