package by.epamlab.junit_hometask.calculator_test;

import by.epamlab.junit_hometask.test_condition.CalculatorConditions;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CalculatorPowTest extends CalculatorConditions {

    @Test
    @Parameters({"3.5, 6, 1838.26562"})
    public void checkPowOperation(double firstNumber, double secondNumber, double expectedResult) {
        double delta = 0.0001;
        double actualResult = getCalculator().pow(firstNumber, secondNumber);
        Assert.assertEquals(expectedResult, actualResult, delta);
    }
}
