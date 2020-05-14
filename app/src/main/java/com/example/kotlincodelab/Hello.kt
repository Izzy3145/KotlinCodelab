package com.example.kotlincodelab

import java.util.*


class Hello {}

fun main(args: Array<String>) {
    feedTheFish()
}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish will eat $food")
    println("Should change the water today: ${shouldChangeWater(day)}")
}

fun randomDay():String{
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood(day: String) : String {
    return when(day){
        "Monday" -> "peas"
        "Wednesday" -> "carrots"
        "Thursday" -> "spinach"
        "Friday" -> "eggs"
        "Saturday" -> "pizza"
        "Sunday" -> "chicken"
        else -> "nothing"
    }
}

fun isTooHot(temperature: Int) = temperature > 30
fun isTooDirty(dirty: Int) = dirty > 20
fun isSunday(day: String) = day == "Sunday"

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20) : Boolean {
    return when {
        isTooHot(temperature) -> true
        isTooDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}



