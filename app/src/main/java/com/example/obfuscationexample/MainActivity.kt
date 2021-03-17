package com.example.obfuscationexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.Keep
import com.example.obfuscationexample.R

class MainActivity : AppCompatActivity() {

    val something = "something"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doit1()

         val model = Model("name",24,35.0)
        println(model.toString())

        Utils().setData("asdad","asdsad")

        val data = Utils().getData()
        println(data)
        println(data.length.toString())

        supportFragmentManager.beginTransaction().replace(R.id.fragment,BlankFragment()).commit()

    }


//    @Keep
    fun doit1(){
        println(something)
        val list = arrayListOf<String>()

//        for (i in 0 until 2){ println("${list[i]}")}

//        doited2()
    }

    private fun doited2(){
        println(something)
        doited3()
        doited4()
    }

    fun doited3(){
        println(something)
        doited4()
        doited2()
    }

    fun doited4(){
        println(something)
        doited2()
        doit1()
    }
}