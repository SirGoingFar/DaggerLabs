package com.sirgoingfar.daggerlabs.di.subcomponents

import com.sirgoingfar.daggerlabs.activities.LoginActivity
import com.sirgoingfar.daggerlabs.custom.annotations.ActivityScope
import com.sirgoingfar.daggerlabs.fragments.LoginPasswordFragment
import com.sirgoingfar.daggerlabs.fragments.LoginUsernameFragment
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface LoginComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }


    fun inject(activity: LoginActivity)
    fun inject(fragment: LoginPasswordFragment)
    fun inject(fragment: LoginUsernameFragment)

}