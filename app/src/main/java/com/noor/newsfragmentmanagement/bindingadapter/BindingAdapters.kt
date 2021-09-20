package com.noor.newsfragmentmanagement.bindingadapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter

object BindingAdapters {

    @JvmStatic
    @BindingAdapter("setImage")
    fun ImageView.setImage(imageRes : Int) {
        setImageResource(imageRes)
    }

}