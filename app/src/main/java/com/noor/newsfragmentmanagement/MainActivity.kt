package com.noor.newsfragmentmanagement

import android.os.Bundle
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
    private val detailFragment = DetailFragment.newInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        initFragments()

    }

    override fun onResume() {
        super.onResume()

        uploadClickListeners()

    }

    private fun uploadClickListeners() {
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
            fragmentHeadline.setOnClickListener {
                loadDetail()
            }
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

    fun loadDetail() {
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
            replace(binding.fragmentDetail.id, detailFragment, "detail_fragment")
            commit()
        }

    }

    private fun loadHome() {
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
            remove(detailFragment)
            commit()
        }
    }

}