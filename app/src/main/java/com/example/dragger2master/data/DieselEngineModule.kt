package com.example.dragger2master.data

import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule {

    @Provides
    fun providesDieselEngine(dieselEngine: DieselEngine): Engine {
        return dieselEngine
    }
}