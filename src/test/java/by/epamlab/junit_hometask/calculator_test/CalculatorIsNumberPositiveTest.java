package by.epamlab.junit_hometask.calculator_test;

import by.epamlab.junit_hometask.test_condition.CalculatorConditions;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CalculatorIsNumberPositiveTest extends CalculatorConditions {

    @Test
    @Parameters({"1"})
    public void checkPositiveCondition(long positiveNumber) {
        Assert.assertTrue(getCalculator().isPositive(positiveNumber));
    }
}
