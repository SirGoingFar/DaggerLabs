package com.sirgoingfar.daggerlabs.datasources

import com.sirgoingfar.daggerlabs.network.services.LoginService
import javax.inject.Inject

class UserRemoteDataSource @Inject constructor(private val loginService: LoginService)