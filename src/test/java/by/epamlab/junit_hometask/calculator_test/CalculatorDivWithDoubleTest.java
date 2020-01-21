package by.epamlab.junit_hometask.calculator_test;

import by.epamlab.junit_hometask.test_condition.CalculatorConditions;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CalculatorDivWithDoubleTest extends CalculatorConditions {

    @Test
    @Parameters({"3.2, 2, 1.6"})
    public void checkDivOperationWithDouble(double firstNumber, double secondNumber, double expectedResult) {
        double delta = 0.0001;
        double actualResult = getCalculator().div(firstNumber, secondNumber);
        Assert.assertEquals(expectedResult, actualResult, delta);
    }
}
