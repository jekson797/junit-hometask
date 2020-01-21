package by.epamlab.junit_hometask.calculator_test;

import by.epamlab.junit_hometask.test_condition.CalculatorConditions;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CalculatorSumWithDoubleTest extends CalculatorConditions {

    @Test
    @Parameters({"1.5, 4.4, 5.9"})
    public void checkSumOperationWithDouble(double firstNumber, double secondNumber, double expectedResult) {
        double delta = 0.0001;
        double actualResult = getCalculator().sum(firstNumber, secondNumber);
        Assert.assertEquals(expectedResult, actualResult, delta);
    }
}
