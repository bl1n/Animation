package com.example.animation.home.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.animation.home.domain.HomeInteractor
import com.example.animation.home.presentation.model.HomeUiItem
import com.example.animation.home.presentation.model.HomeUiModel

class HomeViewModel(
    private val homeInteractor: HomeInteractor
) : ViewModel() {
    val uiModel = MutableLiveData<HomeUiModel>()

    init {
        uiModel.value = HomeUiModel(
            list = getHomeUiModel()
        )
    }

    private fun getHomeUiModel(): List<HomeUiItem> {
        return HomeUiItem.values().toList()
    }
}