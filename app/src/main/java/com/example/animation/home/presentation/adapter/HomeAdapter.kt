package com.example.animation.home.presentation.adapter

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil
import com.example.animation.home.presentation.model.HomeUiItem
import com.hannesdorfmann.adapterdelegates4.AsyncListDifferDelegationAdapter

class HomeAdapter(
    onItemClick: (model: HomeUiItem) -> Unit
) : AsyncListDifferDelegationAdapter<Any>(DIFF_CALLBACK) {

    init {
        delegatesManager
            .addDelegate(homeItemAD())
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Any>() {
            override fun areItemsTheSame(oldItem: Any, newItem: Any): Boolean {
                return when {
                    oldItem is HomeUiItem && newItem is HomeUiItem -> {
                        oldItem.title == newItem.title
                    }
                    else -> false
                }
            }

            @SuppressLint("DiffUtilEquals")
            override fun areContentsTheSame(oldItem: Any, newItem: Any): Boolean {
                return oldItem == newItem
            }
        }
    }
}