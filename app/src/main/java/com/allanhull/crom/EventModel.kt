package com.allanhull.crom

public class EventlModel {
    lateinit var name:String
    lateinit var address:String
    lateinit var city:String
    lateinit var state:String
    lateinit var zip:String
    lateinit var date:String
    lateinit var category:String
    lateinit var url:String
    lateinit var latitude:String
    lateinit var longitude:String

    constructor(name:String, address:String,city:String,state:String,zip:String,date:String,category:String,url:String,latitude:String,longitude:String) {
        this.name = name
        this.address = address
        this.city = city
        this.state = state
        this.zip = zip
        this.date = date
        this.category = category
        this.url = url
        this.latitude = latitude
        this.longitude = longitude
    }

    constructor()
}

