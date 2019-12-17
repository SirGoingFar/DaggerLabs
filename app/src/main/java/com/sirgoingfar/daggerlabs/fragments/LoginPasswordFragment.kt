package com.sirgoingfar.daggerlabs.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sirgoingfar.daggerlabs.R
import com.sirgoingfar.daggerlabs.activities.LoginActivity
import com.sirgoingfar.daggerlabs.viewmodels.LoginViewModel
import javax.inject.Inject

class LoginPasswordFragment : Fragment() {

    @Inject
    lateinit var loginViewModel: LoginViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if(activity is LoginActivity)
            (activity as LoginActivity).loginComponent.inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login_password, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = LoginPasswordFragment()
    }
}
