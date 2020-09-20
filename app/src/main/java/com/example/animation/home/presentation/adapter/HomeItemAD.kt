package com.example.animation.home.presentation.adapter

import com.example.animation.R
import com.example.animation.home.presentation.model.HomeUiItem
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateLayoutContainer
import kotlinx.android.synthetic.main.home_item.view.*

fun homeItemAD() = adapterDelegateLayoutContainer<HomeUiItem, Any>(
    R.layout.home_item
) {

    bind {
        itemView.vTitle.setText(item.title)
    }
}