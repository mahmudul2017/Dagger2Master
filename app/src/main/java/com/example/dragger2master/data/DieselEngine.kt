package com.example.dragger2master.data

import android.util.Log
import javax.inject.Inject

class DieselEngine: Engine {
    var TAG = "DieselEngine"

    @Inject
    constructor()

    override fun engineStart() {
        Log.d(TAG, "DieselEngine Started.....")
    }
}