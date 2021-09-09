package com.noor.newsfragmentmanagement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import com.noor.newsfragmentmanagement.adapter.SliderAdapter
import com.noor.newsfragmentmanagement.databinding.FragmentHeadlineBinding
import kotlin.math.abs

class HeadlineFragment : Fragment() {

    private lateinit var binding: FragmentHeadlineBinding

    private val headNewsFragment1 =
        HeadNewsFragment.newInstance(R.drawable.rectangle1, "Headline News 1")
    private val headNewsFragment2 =
        HeadNewsFragment.newInstance(R.drawable.rectangle2, "Headline News 2")
    private val headNewsFragment3 =
        HeadNewsFragment.newInstance(R.drawable.rectangle3, "Headline News 3")
    private val headNewsFragment4 =
        HeadNewsFragment.newInstance(R.drawable.rectangle4, "Headline News 4")
    private val headNewsFragment5 =
        HeadNewsFragment.newInstance(R.drawable.rectangle5, "Headline News 5")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHeadlineBinding.inflate(layoutInflater, container, false)

        val fragments = ArrayList<Fragment>()
        fragments.add(headNewsFragment1)
        fragments.add(headNewsFragment2)
        fragments.add(headNewsFragment3)
        fragments.add(headNewsFragment4)
        fragments.add(headNewsFragment5)

        val sliderAdapter = SliderAdapter(
            fragments,
            requireActivity()
        )

        binding.viewPager.apply {
            adapter = sliderAdapter
            clipToPadding = false
            clipChildren = false
            offscreenPageLimit = 1
        }

        val compositePagerTransformer = CompositePageTransformer()
        compositePagerTransformer.addTransformer(MarginPageTransformer(40))
        compositePagerTransformer.addTransformer { page, position ->
            val r = 1 - abs(position)
            page.scaleY = 0.85f + r * 0.15f
        }

        binding.viewPager.setPageTransformer(compositePagerTransformer)

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            HeadlineFragment().apply {
            }
    }
}