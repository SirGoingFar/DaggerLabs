package com.sirgoingfar.daggerlabs.repositories

import com.sirgoingfar.daggerlabs.datasources.UserLocalDataSource
import com.sirgoingfar.daggerlabs.datasources.UserRemoteDataSource
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(
    private val localDataSource: UserLocalDataSource,
    private val remoteDataSource: UserRemoteDataSource
)