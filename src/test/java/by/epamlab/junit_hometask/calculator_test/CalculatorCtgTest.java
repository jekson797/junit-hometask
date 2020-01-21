package by.epamlab.junit_hometask.calculator_test;

import by.epamlab.junit_hometask.test_condition.CalculatorConditions;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CalculatorCtgTest extends CalculatorConditions {

    @Test
    @Parameters({"10, 1.5423510454"})
    public void checkCtgOperation(double number, double expectedResult) {
        double delta = 0.0001;
        double actualResult = getCalculator().ctg(number);
        Assert.assertEquals(expectedResult, actualResult, delta);
    }
}
