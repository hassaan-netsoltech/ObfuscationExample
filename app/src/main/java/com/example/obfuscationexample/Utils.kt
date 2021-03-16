package com.example.obfuscationexample

class Utils {

    val field = "some field"

    val another = "another field"

    fun getData():String = field

    private fun getPrivateData() = another

    fun setData(data: String, data2: String) {
        println("$data, $data2")
    }
}