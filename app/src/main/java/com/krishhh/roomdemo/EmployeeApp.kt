package com.krishhh.roomdemo

import android.app.Application
// Created the application class and initialize the database
class EmployeeApp:Application() {

    val db by lazy {
        EmployeeDatabase.getInstance(this)
    }

}