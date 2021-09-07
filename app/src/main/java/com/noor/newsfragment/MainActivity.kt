package com.noor.newsfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.noor.newsfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val categoryFragment = CategoryFragment.newInstance()
        val detailFragment = DetailFragment.newInstance()
        val headlineFragment = HeadlineFragment.newInstance()
        val newsFragment = NewsFragment.newInstance()
        val toolbarFragment = ToolbarFragment.newInstance()
        val writerFragment = WriterFragment.newInstance()

        val fragmentTransaction = supportFragmentManager.beginTransaction()

        fragmentTransaction.add(binding.fragmentToolbar.id, toolbarFragment,"toolbar_fragment")
        fragmentTransaction.add(binding.fragmentCategory.id, categoryFragment,"category_fragment")
        fragmentTransaction.add(binding.fragmentWriter.id, writerFragment,"writer_fragment")
        fragmentTransaction.add(binding.fragmentHeadline.id, headlineFragment,"headline_fragment")
        fragmentTransaction.add(binding.fragmentNews.id, newsFragment,"news_fragment")
        fragmentTransaction.add(binding.fragmentDetail.id, detailFragment,"detail_fragment")
        fragmentTransaction.commit()

    }

}