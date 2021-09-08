package com.noor.newsfragmentmanagement

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.noor.newsfragmentmanagement.adapter.SliderAdapter
import com.noor.newsfragmentmanagement.databinding.ActivityMainBinding
import kotlin.math.abs

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val toolbarFragment = ToolbarFragment.newInstance()
    private val categoryFragment = CategoryFragment.newInstance()
    private val writerFragment1 = WriterFragment.newInstance(R.drawable.profile1, "Writer1")
    private val writerFragment2 = WriterFragment.newInstance(R.drawable.profile2, "Writer2")
    private val writerFragment3 = WriterFragment.newInstance(R.drawable.profile3, "Writer3")
    private val writerFragment4 = WriterFragment.newInstance(R.drawable.profile4, "Writer4")
    private val writerFragment5 = WriterFragment.newInstance(R.drawable.profile5, "Writer5")
    private val writerFragment6 = WriterFragment.newInstance(R.drawable.profile6, "Writer6")
    private val writerFragment7 = WriterFragment.newInstance(R.drawable.profile7, "Writer7")
    private val headlineFragment1 = HeadlineFragment.newInstance()
    private val headlineFragment2 = HeadlineFragment.newInstance()
    private val headlineFragment3 = HeadlineFragment.newInstance()
    private val headlineFragment4 = HeadlineFragment.newInstance()
    private val headlineFragment5 = HeadlineFragment.newInstance()
    private val newsFragment1 = NewsFragment.newInstance(R.drawable.news1, "News Title 1", "News Description1", "News Date 1")
    private val newsFragment2 = NewsFragment.newInstance(R.drawable.news2, "News Title 2", "News Description2", "News Date 2")
    private val newsFragment3 = NewsFragment.newInstance(R.drawable.news3, "News Title 3", "News Description3", "News Date 3")
    private val newsFragment4 = NewsFragment.newInstance(R.drawable.news4, "News Title 4", "News Description4", "News Date 4")
    private val newsFragment5 = NewsFragment.newInstance(R.drawable.news5, "News Title 5", "News Description5", "News Date 5")
    private val detailFragment = DetailFragment.newInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        initFragments()

    }

    override fun onResume() {
        super.onResume()
        binding.apply {
            fragmentWriter1.setOnClickListener {
                loadDetail()
            }
            fragmentWriter2.setOnClickListener {
                loadDetail()
            }
            fragmentWriter3.setOnClickListener {
                loadDetail()
            }
            fragmentWriter4.setOnClickListener {
                loadDetail()
            }
            fragmentWriter5.setOnClickListener {
                loadDetail()
            }
            fragmentWriter6.setOnClickListener {
                loadDetail()
            }
            fragmentWriter7.setOnClickListener {
                loadDetail()
            }
//            fragmentHeadline.setOnClickListener {
//                loadDetail()
//            }
            fragmentNews1.setOnClickListener {
                loadDetail()
            }
            fragmentNews2.setOnClickListener {
                loadDetail()
            }
            fragmentNews3.setOnClickListener {
                loadDetail()
            }
            fragmentNews4.setOnClickListener {
                loadDetail()
            }
            fragmentNews5.setOnClickListener {
                loadDetail()
            }
            fragmentDetail.setOnClickListener {
                loadHome()
            }
        }
    }

    private fun initFragments() {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(binding.fragmentToolbar.id, toolbarFragment, "toolbar_fragment")
        fragmentTransaction.add(binding.fragmentCategory.id, categoryFragment, "category_fragment")
        fragmentTransaction.add(binding.fragmentWriter1.id, writerFragment1, "writer_fragment1")
        fragmentTransaction.add(binding.fragmentWriter2.id, writerFragment2, "writer_fragment2")
        fragmentTransaction.add(binding.fragmentWriter3.id, writerFragment3, "writer_fragment3")
        fragmentTransaction.add(binding.fragmentWriter4.id, writerFragment4, "writer_fragment4")
        fragmentTransaction.add(binding.fragmentWriter5.id, writerFragment5, "writer_fragment5")
        fragmentTransaction.add(binding.fragmentWriter6.id, writerFragment6, "writer_fragment6")
        fragmentTransaction.add(binding.fragmentWriter7.id, writerFragment7, "writer_fragment7")
//        fragmentTransaction.add(binding.fragmentHeadline.id, headlineFragment, "headline_fragment")
        fragmentTransaction.add(binding.fragmentNews1.id, newsFragment1, "news_fragment1")
        fragmentTransaction.add(binding.fragmentNews2.id, newsFragment2, "news_fragment2")
        fragmentTransaction.add(binding.fragmentNews3.id, newsFragment3, "news_fragment3")
        fragmentTransaction.add(binding.fragmentNews4.id, newsFragment4, "news_fragment4")
        fragmentTransaction.add(binding.fragmentNews5.id, newsFragment5, "news_fragment5")
        fragmentTransaction.addToBackStack("home_bs")
        fragmentTransaction.commit()

        val fragments = ArrayList<Fragment>()
        fragments.add(headlineFragment1)
        fragments.add(headlineFragment2)
        fragments.add(headlineFragment3)
        fragments.add(headlineFragment4)
        fragments.add(headlineFragment5)

        val sliderAdapter = SliderAdapter(
            fragments,
            this
        )

        binding.viewPager.apply {
            adapter = sliderAdapter
            clipToPadding = false
            clipChildren = false
            offscreenPageLimit = 1
        }

        val compositePagerTransformer = CompositePageTransformer()
        compositePagerTransformer.addTransformer(MarginPageTransformer(40))
        compositePagerTransformer.addTransformer(object: ViewPager2.PageTransformer{
            override fun transformPage(page: View, position: Float) {
                var r = 1 - abs(position)
                page.scaleY = 0.85f + r * 0.15f
            }

        })

        binding.viewPager.setPageTransformer(compositePagerTransformer)

    }

    private fun loadDetail() {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.remove(supportFragmentManager.findFragmentByTag("toolbar_fragment")!!)
        fragmentTransaction.remove(supportFragmentManager.findFragmentByTag("category_fragment")!!)
        fragmentTransaction.remove(supportFragmentManager.findFragmentByTag("writer_fragment1")!!)
        fragmentTransaction.remove(supportFragmentManager.findFragmentByTag("writer_fragment2")!!)
        fragmentTransaction.remove(supportFragmentManager.findFragmentByTag("writer_fragment3")!!)
        fragmentTransaction.remove(supportFragmentManager.findFragmentByTag("writer_fragment4")!!)
        fragmentTransaction.remove(supportFragmentManager.findFragmentByTag("writer_fragment5")!!)
        fragmentTransaction.remove(supportFragmentManager.findFragmentByTag("writer_fragment6")!!)
        fragmentTransaction.remove(supportFragmentManager.findFragmentByTag("writer_fragment7")!!)
//        fragmentTransaction.remove(supportFragmentManager.findFragmentByTag("headline_fragment")!!)
        fragmentTransaction.remove(supportFragmentManager.findFragmentByTag("news_fragment1")!!)
        fragmentTransaction.remove(supportFragmentManager.findFragmentByTag("news_fragment2")!!)
        fragmentTransaction.remove(supportFragmentManager.findFragmentByTag("news_fragment3")!!)
        fragmentTransaction.remove(supportFragmentManager.findFragmentByTag("news_fragment4")!!)
        fragmentTransaction.remove(supportFragmentManager.findFragmentByTag("news_fragment5")!!)
        fragmentTransaction.replace(binding.fragmentDetail.id, detailFragment, "detail_fragment")
        fragmentTransaction.commit()
    }

    private fun loadHome() {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.fragmentToolbar.id, toolbarFragment, "toolbar_fragment")
        fragmentTransaction.replace(binding.fragmentCategory.id,categoryFragment,"category_fragment")
        fragmentTransaction.replace(binding.fragmentWriter1.id, writerFragment1, "writer_fragment1")
        fragmentTransaction.replace(binding.fragmentWriter2.id, writerFragment2, "writer_fragment2")
        fragmentTransaction.replace(binding.fragmentWriter3.id, writerFragment3, "writer_fragment3")
        fragmentTransaction.replace(binding.fragmentWriter4.id, writerFragment4, "writer_fragment4")
        fragmentTransaction.replace(binding.fragmentWriter5.id, writerFragment5, "writer_fragment5")
        fragmentTransaction.replace(binding.fragmentWriter6.id, writerFragment6, "writer_fragment6")
        fragmentTransaction.replace(binding.fragmentWriter7.id, writerFragment7, "writer_fragment7")
//        fragmentTransaction.replace(binding.fragmentHeadline.id, headlineFragment, "headline_fragment")
        fragmentTransaction.replace(binding.fragmentNews1.id, newsFragment1, "news_fragment1")
        fragmentTransaction.replace(binding.fragmentNews2.id, newsFragment2, "news_fragment2")
        fragmentTransaction.replace(binding.fragmentNews3.id, newsFragment3, "news_fragment3")
        fragmentTransaction.replace(binding.fragmentNews4.id, newsFragment4, "news_fragment4")
        fragmentTransaction.replace(binding.fragmentNews5.id, newsFragment5, "news_fragment5")
        fragmentTransaction.remove(detailFragment)
        fragmentTransaction.commit()
    }

}