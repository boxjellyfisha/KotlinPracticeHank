package com.hello

import org.junit.jupiter.api.Assertions.assertEquals
import java.util.*

class JohnSocksTest {

    private val johnSocks  = JohnSocks()

    @org.junit.jupiter.api.BeforeEach
    fun setUp() {}

    @org.junit.jupiter.api.Test
    fun sockMerchant() {
        val n = 10
        val ar = arrayOf(1, 1, 3, 1, 2, 1, 3, 3, 3, 3)
        val result = johnSocks.sockMerchant(n, ar)
        assertEquals(4, result)
        println(result)

        val n1 = 0
        val ar1 = arrayOf(0)
        val result1 = johnSocks.sockMerchant(n1, ar1)
        assertEquals(0, result1)
        println(result1)
    }

    @org.junit.jupiter.api.Test
    fun findSame() {
        val n = 1
        val index = MutableList(6, {it})
        val ar = arrayOf(2,1,2,1,3,2)
        val result = johnSocks.findSame(n, index, ar)
        assert(result)
    }
}