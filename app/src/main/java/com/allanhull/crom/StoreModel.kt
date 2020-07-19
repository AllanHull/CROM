package com.allanhull.crom

public class StoreModel {
    lateinit var name:String
    lateinit var address:String
    lateinit var city:String
    lateinit var state:String
    lateinit var zip:String
    lateinit var phone:String
    lateinit var url:String
    lateinit var email:String
    lateinit var latitude:String
    lateinit var longitude:String

    constructor(name:String, address:String,city:String,state:String,zip:String,phone:String,url:String,email:String,latitude:String,longitude:String) {
        this.name = name
        this.address = address
        this.city = city
        this.state = state
        this.zip = zip
        this.phone = phone
        this.url = url
        this.email = email
        this.latitude = latitude
        this.longitude = longitude
    }

    constructor()
}