package com.example.cicdapp

import org.junit.Assert.*
import org.junit.Test
import java.util.*

class DateUtilsTest{
    @Test
    @Throws(Exception::class)
    fun dateUtilsFormat_isCorrect() {
        val epoc: Long = 1446885450 //7th Nov 2015
        val date: Date = DateUtils.epocSecondsToDate(epoc)
        assertEquals(
            "Date time in millis is wrong",
            epoc * 1000, date.time
        )
        val day: String = DateUtils.dateToDayDateString(date, true)
        assertEquals("Day is wrong", "SAT", day)
    }
}