package com.example.magnumhealthapp;

import android.app.Activity;
import android.app.Instrumentation;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity>mainActivityTestRule= new ActivityTestRule<MainActivity>(MainActivity.class);
    private MainActivity mActivity=null;

    Instrumentation.ActivityMonitor monitor= getInstrumentation().addMonitor(SecondActivity.class.getName(),null,false);

    private Instrumentation getInstrumentation() {
        return null;
    }

    public void setUp() throws Exception {
        mActivity= mainActivityTestRule.getActivity();
    }
    @Test
    public void testLaunchOfSecondActivityOnButtonClick()
    {
        assertNotNull(mActivity.findViewById(R.id.Patientbtn));

        onView(withId(R.id.Patientbtn)).perform(click());

        Activity secondActivity= getInstrumentation().waitForMonitorWithTimeout(monitor,5000);
        assertNotNull(secondActivity);
        secondActivity.finish();



    }

    @After
    public void tearDown() throws Exception {
        mActivity= null;
    }
}