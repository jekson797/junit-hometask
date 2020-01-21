package by.epamlab.junit_hometask.timeout_test;

import com.epam.tat.module4.Timeout;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class TimeoutSleepTest {

    @Test(timeout = 4500)
    @Parameters({"4"})
    public void checkSleep(int seconds) {
        Timeout.sleep(seconds);
    }
}
