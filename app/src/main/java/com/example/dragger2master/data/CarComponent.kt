package com.example.dragger2master.data

import com.example.dragger2master.MainActivity
import dagger.Component

@Component(modules = [PetrolEngineModule::class, WheelsModule::class])
interface CarComponent {
    fun getDaggerCar(): Car

    fun inject(mainActivity: MainActivity)
}