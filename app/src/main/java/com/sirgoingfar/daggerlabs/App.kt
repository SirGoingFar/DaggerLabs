package com.sirgoingfar.daggerlabs

import android.app.Application
import com.sirgoingfar.daggerlabs.di.components.ApplicationComponent
import com.sirgoingfar.daggerlabs.di.components.DaggerApplicationComponent

class App : Application() {

    val appComponent: ApplicationComponent = DaggerApplicationComponent.create()

}