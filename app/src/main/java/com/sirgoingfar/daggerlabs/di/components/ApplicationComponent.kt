package com.sirgoingfar.daggerlabs.di.components

import com.sirgoingfar.daggerlabs.di.subcomponents.LoginComponent
import com.sirgoingfar.daggerlabs.modules.NetworkModule
import com.sirgoingfar.daggerlabs.modules.SubComponentsModule
import dagger.Component
import javax.inject.Singleton

//Todo: If any of the dependencies has @Singleton annotation,
//this has to be uncommented too - i.e. the Component class has to be annotated with @Singleton too

@Singleton
@Component(modules = [NetworkModule::class, SubComponentsModule::class])
interface ApplicationComponent {

    //Sub-Components
    fun loginComponent(): LoginComponent.Factory

}