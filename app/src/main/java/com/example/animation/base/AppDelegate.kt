package com.example.animation.base

import android.app.Application
import com.example.animation.home.homeModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class AppDelegate : Application() {

    override fun onCreate() {
        super.onCreate()
        // Start Koin
        startKoin {
            androidContext(this@AppDelegate)
            modules(
                homeModule
            )
        }
    }
}