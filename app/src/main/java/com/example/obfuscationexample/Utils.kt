package com.example.obfuscationexample

import androidx.annotation.Keep

//@Keep
class Utils {

    val field = "some field"

    val another = "another field"

//    @Keep
    fun getData():String = field

    private fun getPrivateData() = another

    fun setData(data: String, data2: String) {
        println("$data, $data2")
    }
}