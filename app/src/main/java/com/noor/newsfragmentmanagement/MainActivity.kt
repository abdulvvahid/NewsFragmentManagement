package com.noor.newsfragmentmanagement

import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.noor.newsfragmentmanagement.databinding.ActivityMainBinding

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
    private val headlineFragment = HeadlineFragment.newInstance()
    private val newsFragment1 = NewsFragment.newInstance(
        R.drawable.news1,
        "News Title 1",
        "News Description1",
        "News Date 1"
    )
    private val newsFragment2 = NewsFragment.newInstance(
        R.drawable.news2,
        "News Title 2",
        "News Description2",
        "News Date 2"
    )
    private val newsFragment3 = NewsFragment.newInstance(
        R.drawable.news3,
        "News Title 3",
        "News Description3",
        "News Date 3"
    )
    private val newsFragment4 = NewsFragment.newInstance(
        R.drawable.news4,
        "News Title 4",
        "News Description4",
        "News Date 4"
    )
    private val newsFragment5 = NewsFragment.newInstance(
        R.drawable.news5,
        "News Title 5",
        "News Description5",
        "News Date 5"
    )
    private var detailFragment: DetailFragment = DetailFragment.newInstance(R.drawable.news1, "Detail Fragment", "Detail Desc")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        initFragments()
    }

    override fun onResume() {
        super.onResume()
        animateRightToLeft()
        uploadClickListeners()
    }

    private fun uploadClickListeners() {
        binding.apply {
            fragmentWriter1.detailClicked(R.drawable.profile1, "Writer1", "Writer1 desc")
            fragmentWriter2.detailClicked(R.drawable.profile2, "Writer2", "Writer2 desc")
            fragmentWriter3.detailClicked(R.drawable.profile3, "Writer3", "Writer3 desc")
            fragmentWriter4.detailClicked(R.drawable.profile4, "Writer4", "Writer4 desc")
            fragmentWriter5.detailClicked(R.drawable.profile5, "Writer5", "Writer5 desc")
            fragmentWriter6.detailClicked(R.drawable.profile6, "Writer6", "Writer6 desc")
            fragmentWriter7.detailClicked(R.drawable.profile7, "Writer7", "Writer7 desc")
            fragmentHeadline.setOnClickListener {
                // View pager
            }
            fragmentNews1.detailClicked(R.drawable.news1, "News1 Title", "News1 desc")
            fragmentNews2.detailClicked(R.drawable.news2, "News2 Title", "News2 desc")
            fragmentNews3.detailClicked(R.drawable.news3, "News3 Title", "News3 desc")
            fragmentNews4.detailClicked(R.drawable.news4, "News4 Title", "News4 desc")
            fragmentNews5.detailClicked(R.drawable.news5, "News5 Title", "News5 desc")
            fragmentDetail.setOnClickListener {
                // Detail Fragment
            }
        }
    }

    private fun View.detailClicked(imageId: Int, title: String, desc: String) {
        setOnClickListener {
            detailFragment = DetailFragment.newInstance(imageId, title, desc)
            loadDetail(detailFragment)
        }
    }

    private fun initFragments() {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.apply {
            add(binding.fragmentToolbar.id, toolbarFragment, "toolbar_fragment")
            add(binding.fragmentCategory.id, categoryFragment, "category_fragment")
            add(binding.fragmentWriter1.id, writerFragment1, "writer_fragment1")
            add(binding.fragmentWriter2.id, writerFragment2, "writer_fragment2")
            add(binding.fragmentWriter3.id, writerFragment3, "writer_fragment3")
            add(binding.fragmentWriter4.id, writerFragment4, "writer_fragment4")
            add(binding.fragmentWriter5.id, writerFragment5, "writer_fragment5")
            add(binding.fragmentWriter6.id, writerFragment6, "writer_fragment6")
            add(binding.fragmentWriter7.id, writerFragment7, "writer_fragment7")
            add(binding.fragmentHeadline.id, headlineFragment, "headline_fragment")
            add(binding.fragmentNews1.id, newsFragment1, "news_fragment1")
            add(binding.fragmentNews2.id, newsFragment2, "news_fragment2")
            add(binding.fragmentNews3.id, newsFragment3, "news_fragment3")
            add(binding.fragmentNews4.id, newsFragment4, "news_fragment4")
            add(binding.fragmentNews5.id, newsFragment5, "news_fragment5")
            commit()
        }
    }

    fun loadDetail(detail: DetailFragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.apply {
            addToBackStack("home_bs")
            remove(supportFragmentManager.findFragmentByTag("toolbar_fragment")!!)
            remove(supportFragmentManager.findFragmentByTag("category_fragment")!!)
            remove(supportFragmentManager.findFragmentByTag("writer_fragment1")!!)
            remove(supportFragmentManager.findFragmentByTag("writer_fragment2")!!)
            remove(supportFragmentManager.findFragmentByTag("writer_fragment3")!!)
            remove(supportFragmentManager.findFragmentByTag("writer_fragment4")!!)
            remove(supportFragmentManager.findFragmentByTag("writer_fragment5")!!)
            remove(supportFragmentManager.findFragmentByTag("writer_fragment6")!!)
            remove(supportFragmentManager.findFragmentByTag("writer_fragment7")!!)
            remove(supportFragmentManager.findFragmentByTag("headline_fragment")!!)
            remove(supportFragmentManager.findFragmentByTag("news_fragment1")!!)
            remove(supportFragmentManager.findFragmentByTag("news_fragment2")!!)
            remove(supportFragmentManager.findFragmentByTag("news_fragment3")!!)
            remove(supportFragmentManager.findFragmentByTag("news_fragment4")!!)
            remove(supportFragmentManager.findFragmentByTag("news_fragment5")!!)
            replace(binding.fragmentDetail.id, detail, "detail_fragment")
            commit()
        }

    }

    fun loadHome(detail: DetailFragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.apply {
            replace(binding.fragmentToolbar.id, toolbarFragment, "toolbar_fragment")
            replace(binding.fragmentCategory.id, categoryFragment, "category_fragment")
            replace(binding.fragmentWriter1.id, writerFragment1, "writer_fragment1")
            replace(binding.fragmentWriter2.id, writerFragment2, "writer_fragment2")
            replace(binding.fragmentWriter3.id, writerFragment3, "writer_fragment3")
            replace(binding.fragmentWriter4.id, writerFragment4, "writer_fragment4")
            replace(binding.fragmentWriter5.id, writerFragment5, "writer_fragment5")
            replace(binding.fragmentWriter6.id, writerFragment6, "writer_fragment6")
            replace(binding.fragmentWriter7.id, writerFragment7, "writer_fragment7")
            replace(binding.fragmentHeadline.id, headlineFragment, "headline_fragment")
            replace(binding.fragmentNews1.id, newsFragment1, "news_fragment1")
            replace(binding.fragmentNews2.id, newsFragment2, "news_fragment2")
            replace(binding.fragmentNews3.id, newsFragment3, "news_fragment3")
            replace(binding.fragmentNews4.id, newsFragment4, "news_fragment4")
            replace(binding.fragmentNews5.id, newsFragment5, "news_fragment5")
            remove(detail)
            commit()
        }
    }

    private fun animateRightToLeft(){

        val rightToLeft: Animation = AnimationUtils.loadAnimation(this, R.anim.right_to_left)
        binding.fragmentWriter1.startAnimation(rightToLeft)
        binding.fragmentWriter2.startAnimation(rightToLeft)
        binding.fragmentWriter3.startAnimation(rightToLeft)
        binding.fragmentWriter4.startAnimation(rightToLeft)
        binding.fragmentWriter5.startAnimation(rightToLeft)
        binding.fragmentWriter6.startAnimation(rightToLeft)
        binding.fragmentWriter7.startAnimation(rightToLeft)

        val bottomToTop: Animation = AnimationUtils.loadAnimation(this, R.anim.bottom_to_top)
        binding.fragmentNews1.startAnimation(bottomToTop)
        binding.fragmentNews2.startAnimation(bottomToTop)
        binding.fragmentNews3.startAnimation(bottomToTop)
        binding.fragmentNews4.startAnimation(bottomToTop)
        binding.fragmentNews5.startAnimation(bottomToTop)

    }

}