package com.sirgoingfar.daggerlabs.viewmodels

import com.sirgoingfar.daggerlabs.custom.annotations.ActivityScope
import com.sirgoingfar.daggerlabs.repositories.UserRepository
import javax.inject.Inject

@ActivityScope
class LoginViewModel @Inject constructor(userRepository: UserRepository)