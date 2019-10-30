package com.hello

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n1 = scan.nextLine().trim().toInt()

    val ar1 = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = JohnSocks().sockMerchant(n1, ar1)

    println(result)
}