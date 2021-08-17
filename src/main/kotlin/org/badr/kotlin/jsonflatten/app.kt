package org.badr.kotlin.jsonflatten


fun main() {

    val string = readLine()
    val result = string?.let { Anagrams().count(it) }

    println(result)
}

