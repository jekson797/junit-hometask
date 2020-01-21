package by.epamlab.junit_hometask.calculator_test;

import by.epamlab.junit_hometask.test_condition.CalculatorConditions;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CalculatorSinTest extends CalculatorConditions {

    @Test
    @Parameters({"13, 0.42016703682"})
    public void checkSinOperation(double number, double expectedResult) {
        double delta = 0.0001;
        double actualResult = getCalculator().sin(number);
        Assert.assertEquals(expectedResult, actualResult, delta);
    }
}
