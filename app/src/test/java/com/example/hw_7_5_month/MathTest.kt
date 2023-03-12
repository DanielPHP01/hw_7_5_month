package com.example.hw_7_5_month

import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {

    var math:Math ?= null
    @Before
    fun init() {
        math = Math()
    }
    @Test
    fun simpleAddTest() {
        assertEquals("4", math?.add("2","2"))
    }
    @Test
    fun simpleSymbolTest() {
        assertEquals("4", math?.add("2sasasasd","2"))
    }
    @Test
    fun simpleWithPlusTest() {
        assertEquals("4", math?.add("+2","2"))
    }
    @Test
    fun simpleWithEmptyTest() {
        assertEquals("4", math?.add("+2",""))
    }
    @Test
    fun simpleWithNegativeTest() {
        assertEquals("4", math?.add("-2",""))
    }
    @Test
    fun simpleWithDoubleTest() {
        assertEquals("4", math?.add("2","2.0"))
    }
    @Test
    fun simpleDivide() {
        assertEquals("4", math?.divide("2","2.0"))
    }
    @Test
    fun simpleSymbolDivide() {
        assertEquals("вы обязаны ввести числа", math?.divide("2","2.0"))
    }
    @Test
    fun simpleZeroDivide() {
        assertEquals("на ноль делить нельзя", math?.divide("2","2.0"))
    }
    @Test
    fun simpleNotNullNumberSymbolTest(){
        assertEquals("1.25", math?.divide("10", "8"))
    }
    @Test
    fun simpleDivideNegativeTest(){
        assertEquals("-8", math?.divide("-10", "2"))
    }
    @After
    fun detach() {
        math = null
    }
}