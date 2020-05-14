package com.example.kotlincodelab

var dirtyLevel = 20
//val waterFilter = {dirty: Int -> dirty/2}
val waterFilter: (Int) -> Int = {dirty -> dirty/2}

//this method takes an integer, dirty, and a lambda operation as parameters
fun updateDirty(dirty: Int, operation: (Int) -> Int) : Int {
    return operation(dirty)
}

fun increaseDirty(start: Int) = start + 1


fun main(args: Array<String>) {
    println(updateDirty(30, waterFilter))
    //when not passing a lambda function into a higher order function, i.e. when passing a normal function
    //into a higher order function, use :: before the function to specify that you're not calling the function
    println(updateDirty(40, ::increaseDirty))

    //this is called last parameter call syntax:
    var dirtyLevel = 43
    dirtyLevel = updateDirty(dirtyLevel){dirtyLevel -> dirtyLevel/2}
    println(dirtyLevel)
}


class GreyEel{}

