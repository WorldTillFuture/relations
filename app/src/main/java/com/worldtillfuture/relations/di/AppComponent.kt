package com.worldtillfuture.relations.di

import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class])
@Singleton
interface AppComponent {

    fun plus(module: ActivityModule): ActivityComponent

}