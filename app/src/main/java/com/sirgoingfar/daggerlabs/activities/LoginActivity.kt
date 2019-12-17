package com.sirgoingfar.daggerlabs.activities

import android.os.Bundle
import com.sirgoingfar.daggerlabs.R
import com.sirgoingfar.daggerlabs.di.subcomponents.LoginComponent
import com.sirgoingfar.daggerlabs.viewmodels.LoginViewModel
import javax.inject.Inject

class LoginActivity : BaseActivity() {

    //Reference to the Login graph
    lateinit var loginComponent: LoginComponent

    @Inject
    lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        //Inject Dagger: This has to be done before calling "super.onCreate(savedInstanceState)"

        //If it's a fragment, do it inside "onAttach(context:Context)" before or after calling "super.onAttach(context:Context)"
        loginComponent = appComponent.loginComponent().create()
        loginComponent.inject(this)

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }
}
