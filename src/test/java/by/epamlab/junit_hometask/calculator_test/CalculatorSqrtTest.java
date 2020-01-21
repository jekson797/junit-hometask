package by.epamlab.junit_hometask.calculator_test;

import by.epamlab.junit_hometask.test_condition.CalculatorConditions;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CalculatorSqrtTest extends CalculatorConditions {

    @Test
    @Parameters({"15, 3.87298"})
    public void checkSqrtOperation(double number, double expectedResult) {
        double delta = 0.0001;
        double actualResult = getCalculator().sqrt(number);
        Assert.assertEquals(expectedResult, actualResult, delta);
    }
}
