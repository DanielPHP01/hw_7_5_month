package com.example.hw_7_5_month

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test

class ActivityTest {
}
@Rule
@JvmField
var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

@Test
fun simpleAdd() {
    runBlocking {
        Espresso.onView(withId(R.id.et_first)).perform(ViewActions.typeText("4"))
        Espresso.onView(withId(R.id.et_first)).perform(ViewActions.closeSoftKeyboard())
        delay(1000)
        Espresso.onView(withId(R.id.et_second)).perform(ViewActions.typeText("5"))
        Espresso.onView(withId(R.id.et_second)).perform(ViewActions.closeSoftKeyboard())
        delay(1000)
        Espresso.onView(withId(R.id.btn_calculate)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.tv_result)).check(ViewAssertions.matches(ViewMatchers.withText("9.0")))
    }
}