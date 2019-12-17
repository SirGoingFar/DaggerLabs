package com.sirgoingfar.daggerlabs.viewmodels

import com.sirgoingfar.daggerlabs.datasources.UserLocalDataSource
import com.sirgoingfar.daggerlabs.datasources.UserRemoteDataSource
import com.sirgoingfar.daggerlabs.network.services.LoginService
import com.sirgoingfar.daggerlabs.repositories.UserRepository
import org.junit.Test

class LoginViewModelTest {

    @Test
    fun instantiation() {

        val fakeUserRepository = UserRepository(
                UserLocalDataSource(),
                UserRemoteDataSource(object : LoginService {
                    override fun loginUser(username: String, password: String) {
                        //Do nothing
                    }

                })
            )

        val loginViewModel = LoginViewModel(fakeUserRepository)

        //Do a test check here; e.g. assertEquals(...)
    }
}