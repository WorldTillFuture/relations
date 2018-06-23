package com.worldtillfuture.relations.di

import com.worldtillfuture.relations.ui.login.LoginActivity
import com.worldtillfuture.relations.ui.login.LoginModule
import com.worldtillfuture.relations.ui.user.UserListActivity
import dagger.Subcomponent

@Subcomponent(modules = [ActivityModule::class, LoginModule::class])
@PerActivity
interface ActivityComponent {

    fun inject(activity: LoginActivity)

    fun inject(activity: UserListActivity)

}