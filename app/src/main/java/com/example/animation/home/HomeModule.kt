package com.example.animation.home

import com.example.animation.home.data.HomeRepositoryImpl
import com.example.animation.home.domain.HomeInteractor
import com.example.animation.home.domain.HomeRepository
import com.example.animation.home.presentation.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val homeModule = module {
    single<HomeRepository> { HomeRepositoryImpl() }
    factory { HomeInteractor(get()) }
    viewModel { HomeViewModel(get()) }
}