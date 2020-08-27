package com.example.dragger2master

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dragger2master.data.Car
import com.example.dragger2master.data.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

  /*  @Inject
    lateinit var car1: Car*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var carComponent = DaggerCarComponent.create()
        carComponent.inject(this)

        car.getCar()
    //    car1.getCar()
    }
}
