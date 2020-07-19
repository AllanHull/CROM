package com.allanhull.crom

public class TrailModel {
    lateinit var name:String
    lateinit var address:String
    lateinit var city:String
    lateinit var state:String
    lateinit var zip:String
    lateinit var length:String
    lateinit var level:String
    lateinit var type:String
    lateinit var latitude:String
    lateinit var longitude:String

    constructor(name:String, address:String,city:String,state:String,zip:String,length:String,level:String,type:String,latitude:String,longitude:String) {
        this.name = name
        this.address = address
        this.city = city
        this.state = state
        this.zip = zip
        this.length = length
        this.level = level
        this.type = type
        this.latitude = latitude
        this.longitude = longitude
    }

    constructor()
}

