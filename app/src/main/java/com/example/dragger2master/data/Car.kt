package com.example.dragger2master.data

import android.content.Context
import android.util.Log
import android.widget.Toast
import javax.inject.Inject

class Car {
    private var TAG = "Car"
  //  private var context: Context
    private lateinit var wheels: Wheels
    private lateinit var engine: Engine

    @Inject
    constructor(wheels: Wheels, engine: Engine) {
        this.wheels = wheels
        this.engine = engine
    }

    fun getCar() {
      //  Toast.makeText(context, "This is car...", Toast.LENGTH_LONG).show()
        engine.engineStart()
        Log.d(TAG,"This is car...")
    }
}