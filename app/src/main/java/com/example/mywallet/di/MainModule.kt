package com.example.mywallet.di

import android.content.Context
import android.content.SharedPreferences
import com.example.mywallet.database.AppDatabase
import com.example.mywallet.preference.UserPreference
import com.example.mywallet.ui.main.MainViewModel
import org.koin.core.module.Module
import org.koin.dsl.module

fun getModules(context: Context) = listOf(
    getPreferenceModule(),
    getViewModelModule(),
    getDatabaseModule(context)
)

fun getPreferenceModule(context: Context): Module{
    return module {
        single { UserPreference(context.getSharedPreferences(UserPreference.domain, UserPreference.mode)) }
    }
}

fun getDatabaseModule(context: Context): Module{
    return module {
        single { AppDatabase.newInstance(context) }
        single { get<AppDatabase>().getUserDao() }
    }
}

fun getViewModelModule():Module{
    return module{
        single { MainViewModel() }
    }
}