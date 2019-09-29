package com.example.mywallet

import android.app.Application
import com.example.mywallet.di.getMainModule
import com.example.mywallet.di.getViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application(){
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MainApplication)
            modules(listOf(
                getMainModule(),
                getViewModelModule()
            ))
        }
    }

}
