package com.example.dragger2master.data

import javax.inject.Inject

class Wheels {

    lateinit var rims: Rims
    lateinit var tires: Tires

    constructor(rims: Rims, tires: Tires) {
        this.rims = rims
        this.tires = tires
    }
}