package com.example.cicdapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class MainActivityTest{

    @get:Rule
    var activityRule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testButton() {
        // Find the button by its ID
        val button = onView(withId(R.id.myButton))

        // Perform a click on the button
        button.perform(click())

        // Find the text view by its ID
        val textView = onView(withId(R.id.resultTextView))

        // Check if the text view has the expected text
        textView.check(matches(withText("Button clicked")))
    }
}