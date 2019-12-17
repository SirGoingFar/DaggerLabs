package com.sirgoingfar.daggerlabs.activities

import androidx.appcompat.app.AppCompatActivity
import com.sirgoingfar.daggerlabs.App
import com.sirgoingfar.daggerlabs.di.components.ApplicationComponent

abstract class BaseActivity : AppCompatActivity() {

    protected val appComponent: ApplicationComponent
        get() {
            return (applicationContext as App).appComponent
        }

}
