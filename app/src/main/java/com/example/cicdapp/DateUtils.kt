package com.example.cicdapp

import java.text.SimpleDateFormat
import java.util.*

class DateUtils {

    companion object{
        fun epocSecondsToDate(epocSeconds: Long): Date {
            val c: Calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"))
            c.timeInMillis = epocSeconds * 1000
            return c.time
        }
        fun dateToDayDateString(
            date: Date,
            useShortFormat: Boolean
        ): String {
            val DISPLAY = SimpleDateFormat("EEEE, dd MMMM yyyy",
                Locale.getDefault())
            val DISPLAY_SHORT = SimpleDateFormat("EEE",
                Locale.getDefault())
            return if (useShortFormat) {
                DISPLAY_SHORT.format(date).uppercase()
            } else {
                DISPLAY.format(date).uppercase()
            }
        }
    }
}