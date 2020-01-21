package by.epamlab.junit_hometask.calculator_test;

import by.epamlab.junit_hometask.test_condition.CalculatorConditions;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CalculatorSubWithDoubleTest extends CalculatorConditions {

    @Test
    @Parameters({"1.5, 0.6, 0.9"})
    public void checkSubOperationWithDouble(double firstNumber, double secondNumber, double expectedResult) {
        double delta = 0.0001;
        double actualResult = getCalculator().sub(firstNumber, secondNumber);
        Assert.assertEquals(expectedResult, actualResult, delta);
    }
}
