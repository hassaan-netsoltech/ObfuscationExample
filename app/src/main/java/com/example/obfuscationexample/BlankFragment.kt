package com.example.obfuscationexample

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Keep
import org.jetbrains.annotations.NotNull


class BlankFragment : Fragment() {

    val some = "sometext"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val model = Model("name",24,35.0)
        println(model.toString())

//        val utils = Utils()
//        val someClass: Class<Utils>
        val method = Utils::class.java.getMethod("getData")
        method.isAccessible = true
//
        Log.v("method",method.name)

//        method.invoke(null)

        method.invoke(Utils())

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        doit1()
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

//    @NotNull
    fun doit1(){
        println(some)
//        doit2()
//        doit3()
    }
//
//    fun doit2(){
//        println("do it 2")
//        doit3()
//        doit1()
//        println(BuildConfig.APPLICATION_ID)
//
//    }
//
//    fun doit3(){
//        println("do it 3")
//        doit1()
//        doit2()
//        println(getString(R.string.app_name))
////        doit4()
//    }
//
//    fun doit4(){
//        println("do it 4")
//    }

}