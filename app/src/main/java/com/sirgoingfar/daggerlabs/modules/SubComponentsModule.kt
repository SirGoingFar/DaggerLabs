package com.sirgoingfar.daggerlabs.modules

import com.sirgoingfar.daggerlabs.di.subcomponents.LoginComponent
import dagger.Module

@Module(subcomponents = [LoginComponent::class])
class SubComponentsModule