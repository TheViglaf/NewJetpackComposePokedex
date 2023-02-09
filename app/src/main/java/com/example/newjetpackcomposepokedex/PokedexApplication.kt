package com.example.newjetpackcomposepokedex

import android.app.Application
import com.example.newjetpackcomposepokedex.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class PokedexApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@PokedexApplication)
            Timber.plant(Timber.DebugTree())
            modules(appModule)
        }
    }
}