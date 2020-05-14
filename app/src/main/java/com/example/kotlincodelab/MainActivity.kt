package com.example.kotlincodelab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

fun main(args: Array<String>) {
    println("Hello, world!")
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
