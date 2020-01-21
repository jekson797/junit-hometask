package by.epamlab.junit_hometask.calculator_test;

import by.epamlab.junit_hometask.test_condition.CalculatorConditions;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CalculatorCosTest extends CalculatorConditions {

    @Test
    @Parameters({"20, 0.40808206181"})
    public void checkCosOperation(double number, double expectedResult) {
        double delta = 0.0001;
        double actualResult = getCalculator().cos(number);
        Assert.assertEquals(expectedResult, actualResult, delta);
    }
}
