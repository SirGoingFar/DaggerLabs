package com.sirgoingfar.daggerlabs.modules

import com.sirgoingfar.daggerlabs.network.services.LoginService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

@Module
class NetworkModule @Inject constructor() {

    @Singleton
    @Provides
    fun provideLoginService(): LoginService {
        //Note that parameters (in the form of dependencies) can be passed to this function
        return getRetrofitInstance()
            .create(LoginService::class.java)
    }


    /*
    *
    *

    "okHttpClient" is seen as a dependency to create a LoginService instance.
    In this case, Dagger supplies this dependency (okHttpClient) from the Dependency graph.

    @Provides
    fun provideLoginService(okHttpClient:OkHttpClient): LoginService {
        //Note that parameters (in the form of dependencies) can be passed to this function
        return retrofitHelper.getRetrofitInstance()
            .create(LoginService::class.java)
    }
    *
    *
    * */


    //Todo: Other services can come here; e.g. SignUpService, SavingsService, etc. instead of a cumbersome NetworkService


    private fun getRetrofitInstance(): Retrofit = Retrofit.Builder()
        .baseUrl("https://example.com")
        .build()
}