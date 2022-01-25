package com.example.simpleparadox.listycity;
import androidx.test.rule.ActivityTestRule;
import com.robotium.solo.Solo;

import org.junit.Rule;

/**
 * Test class for MainActivity. All the UI tests are written here. Robotium test framework is
 used
 */
public class MainActivityTest {
    private Solo solo;
    @Rule
    public ActivityTestRule<MainActivity> rule =
            new ActivityTestRule<>(MainActivity.class, true, true);
}

