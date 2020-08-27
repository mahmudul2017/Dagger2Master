package com.example.dragger2master.data

import android.util.Log
import javax.inject.Inject

class PetrolEngine: Engine {
    var TAG = "PetrolEngine"

    @Inject
    constructor()

    override fun engineStart() {
        Log.d(TAG, "PetrolEngine Started.....")
    }
}