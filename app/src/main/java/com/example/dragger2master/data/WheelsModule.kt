package com.example.dragger2master.data

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {
    var TAG = "WheelsModule"

    @Provides
    fun providesRims(): Rims {
        Log.d(TAG, "rims module.....")
        return Rims()
    }

    @Provides
    fun providesTires(): Tires {
        Log.d(TAG, "tires module.....")
        return Tires()
    }

    @Provides
    fun providesWheelsModule(rims: Rims, tires: Tires): Wheels {
        Log.d(TAG, "wheels module.....")
        return Wheels(rims, tires)
    }
}