package by.epamlab.junit_hometask.calculator_test;

import by.epamlab.junit_hometask.test_condition.CalculatorConditions;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CalculatorIsNumberNegativeTest extends CalculatorConditions {

    @Test
    @Parameters({"-1"})
    public void checkNegativeCondition(long negativeNumber) {
        Assert.assertTrue(getCalculator().isNegative(negativeNumber));
    }
}
