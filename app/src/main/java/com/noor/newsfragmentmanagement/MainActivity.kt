package com.noor.newsfragmentmanagement

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.noor.newsfragmentmanagement.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val toolbarFragment = ToolbarFragment.newInstance()
    private val categoryFragment = CategoryFragment.newInstance()
    private val writerFragment1 = WriterFragment.newInstance()
    private val writerFragment2 = WriterFragment.newInstance()
    private val writerFragment3 = WriterFragment.newInstance()
    private val writerFragment4 = WriterFragment.newInstance()
    private val writerFragment5 = WriterFragment.newInstance()
    private val headlineFragment = HeadlineFragment.newInstance()
    private val newsFragment1 = NewsFragment.newInstance()
    private val newsFragment2 = NewsFragment.newInstance()
    private val newsFragment3 = NewsFragment.newInstance()
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
        fragmentTransaction.add(binding.fragmentHeadline.id, headlineFragment, "headline_fragment")
        fragmentTransaction.add(binding.fragmentNews1.id, newsFragment1, "news_fragment1")
        fragmentTransaction.add(binding.fragmentNews2.id, newsFragment2, "news_fragment2")
        fragmentTransaction.add(binding.fragmentNews3.id, newsFragment3, "news_fragment3")
        fragmentTransaction.addToBackStack("home_bs")
        fragmentTransaction.commit()
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
        fragmentTransaction.remove(supportFragmentManager.findFragmentByTag("headline_fragment")!!)
        fragmentTransaction.remove(supportFragmentManager.findFragmentByTag("news_fragment1")!!)
        fragmentTransaction.remove(supportFragmentManager.findFragmentByTag("news_fragment2")!!)
        fragmentTransaction.remove(supportFragmentManager.findFragmentByTag("news_fragment3")!!)
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
        fragmentTransaction.replace(binding.fragmentHeadline.id, headlineFragment, "headline_fragment")
        fragmentTransaction.replace(binding.fragmentNews1.id, newsFragment1, "news_fragment1")
        fragmentTransaction.replace(binding.fragmentNews2.id, newsFragment2, "news_fragment2")
        fragmentTransaction.replace(binding.fragmentNews3.id, newsFragment3, "news_fragment3")
        fragmentTransaction.remove(detailFragment)
        fragmentTransaction.commit()
    }


}