package org.badr.kotlin.jsonflatten

import kotlin.test.Test
import kotlin.test.assertEquals

class AnagramsTest {

    val anagrams = Anagrams()

    @Test
    fun `given abba count returns 4`(){
        assertEquals(4, anagrams.count("abba"))
    }

    @Test
    fun `given ifailuhkqq count returns 3`(){
        assertEquals(3, anagrams.count("ifailuhkqq"))
    }
}