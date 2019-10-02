package com.example.mywallet

import android.app.Application
import com.example.mywallet.di.getPreferenceModule
import com.example.mywallet.di.getModules
import com.example.mywallet.di.getViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application(){
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MainApplication)
            modules(getModules(this@MainApplication))
        }
    }

}
