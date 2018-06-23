package com.worldtillfuture.relations.ui.user

import com.worldtillfuture.relations.di.PerActivity
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface UserLoginModule {

    @Binds
    @PerActivity
    fun provideUserListPresenter(presenterImpl: UserListPresenterImpl): UserListPresenter
}