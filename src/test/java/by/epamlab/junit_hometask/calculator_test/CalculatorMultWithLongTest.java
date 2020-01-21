package by.epamlab.junit_hometask.calculator_test;

import by.epamlab.junit_hometask.test_condition.CalculatorConditions;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CalculatorMultWithLongTest extends CalculatorConditions {

    @Test
    @Parameters({"10, 5, 50"})
    public void checkMultOperationWithLong(long firstNumber, long secondNumber, long expectedResult) {
        long actualResult = getCalculator().mult(firstNumber, secondNumber);
        Assert.assertEquals(expectedResult, actualResult);
    }
}
