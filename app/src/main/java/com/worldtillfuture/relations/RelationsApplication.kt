package com.worldtillfuture.relations

import android.app.Application
import com.worldtillfuture.relations.di.DaggerAppComponent

class RelationsApplication : Application() {

    companion object {
        val appComponent = DaggerAppComponent.builder()
                .build()
    }


    override fun onCreate() {
        super.onCreate()

    }


}