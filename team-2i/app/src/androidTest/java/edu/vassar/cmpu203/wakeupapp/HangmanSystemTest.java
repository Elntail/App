package edu.vassar.cmpu203.wakeupapp;
import android.os.SystemClock;
import android.view.View;


import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.hamcrest.Matcher;
import org.junit.Test;
import org.junit.runner.RunWith;

import edu.vassar.cmpu203.wakeupapp.controller.MainActivity;

public class HangmanSystemTest {

    @org.junit.Rule
    public ActivityScenarioRule<MainActivity> activityRule
            = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testHangman() {
        // match a view by id
        Matcher<View> matcher = ViewMatchers.withId(R.id.underline);

        // create view interaction object to actually interact with the view we match
        ViewInteraction lineItemsVi = Espresso.onView(matcher);

        // check that line items is empty to begin with
        lineItemsVi.check(ViewAssertions
                .matches(ViewMatchers
                        .withText(R.string.fiveLine)));

        // input item name and qty (qty should receive an error)
        Espresso.onView(ViewMatchers.withId(R.id.editTextTextPersonName))
                .perform(ViewActions.typeText("guacamole"));

        Espresso.closeSoftKeyboard(); // close keyboard to prevent occlusion

        Espresso.onView(ViewMatchers.withId(R.id.editTextTextPersonName))
                .perform(ViewActions.typeText("20"));

        Espresso.closeSoftKeyboard(); // close keyboard to prevent occlusion

        Espresso.onView(ViewMatchers.withId(R.id.button))
                .perform(ViewActions.click());

        SystemClock.sleep(5000); // wait for five seconds, just for fun in this case

        // check that the line item was actually added
        lineItemsVi.check(
                ViewAssertions.matches(
                        ViewMatchers.withSubstring("20 units of guacamole")));

    }

}
