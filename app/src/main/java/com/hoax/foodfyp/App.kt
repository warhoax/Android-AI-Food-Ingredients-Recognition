package com.hoax.foodfyp

import android.app.Application
import com.hoax.foodfyp.dependencies.appModule
import com.hoax.foodfyp.dependencies.networkModule
import com.hoax.foodfyp.dependencies.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * Custom application class to initialize Koin.
 */
class App: Application(){
    override fun onCreate() {
        super.onCreate()
      /*  startKoin {
            androidContext(this@App)
            //modules(appModule, networkModule, viewModelModule)
            modules(appModule, networkModule, viewModelModule)
        }*/
      //  startKoin(this, listOf(applicationModule))
        startKoin {
            androidContext(this@App)
            modules(appModule)
            modules(networkModule)
            modules(viewModelModule)
        }
    }
}