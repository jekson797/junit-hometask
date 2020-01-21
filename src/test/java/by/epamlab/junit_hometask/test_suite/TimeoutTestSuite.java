package by.epamlab.junit_hometask.test_suite;

import by.epamlab.junit_hometask.timeout_test.TimeoutSleepTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TimeoutSleepTest.class
})
public class TimeoutTestSuite {
}
