package com.worldtillfuture.relations.ui.login

import com.worldtillfuture.relations.di.PerActivity
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface LoginModule{

    @Binds
    @PerActivity
    fun loginPresenter(presenterImpl: LoginPresenterImpl): LoginPresenter

}