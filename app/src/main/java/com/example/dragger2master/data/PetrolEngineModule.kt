package com.example.dragger2master.data

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class PetrolEngineModule {

   /* @Provides
    fun providesPetrolEngine(petrolEngine: PetrolEngine): Engine {
        return petrolEngine
    }*/

    @Binds
    abstract fun providesPetrolEngine(petrolEngine: PetrolEngine): Engine
}