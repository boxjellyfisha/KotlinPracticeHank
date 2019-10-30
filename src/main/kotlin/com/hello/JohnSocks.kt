package com.hello

import java.util.*

/**
 * Problem :Sock Merchant
 * (in hacker rank)
 * https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 * use TDD to implement this question.
 */
class JohnSocks {

    /* -- Main code -- */
    fun sockMerchant(n: Int, ar: Array<Int>): Int {
        val most = Math.round(n/2f)
        var result = most
        val tmpIndex = MutableList(n, {it})

        if(result > 0)  {
            for(i in 0 until most) {
                var find = ar[tmpIndex[0]]
                tmpIndex.removeAt(0)
                if(!findSame(find, tmpIndex, ar))
                    result--
            }
        }
        return result
    }

    fun findSame(n: Int, index:MutableList<Int>, ar: Array<Int>): Boolean {
        for (sub in index) {
            if(ar[sub] == n) {
                index.remove(sub)
                return true
            }
        }
        return false
    }
 }