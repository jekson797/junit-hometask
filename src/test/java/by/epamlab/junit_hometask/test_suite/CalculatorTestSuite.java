package by.epamlab.junit_hometask.test_suite;

import by.epamlab.junit_hometask.calculator_test.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculatorSumWithDoubleTest.class,
        CalculatorSumWithLongTest.class,
        CalculatorSubWithLongTest.class,
        CalculatorSubWithDoubleTest.class,
        CalculatorMultWithLongTest.class,
        CalculatorMultWithDoubleTest.class,
        CalculatorDivWithLongTest.class,
        CalculatorDivWithDoubleTest.class,
        CalculatorPowTest.class,
        CalculatorSqrtTest.class,
        CalculatorTgTest.class,
        CalculatorCtgTest.class,
        CalculatorCosTest.class,
        CalculatorSinTest.class,
        CalculatorIsNumberPositiveTest.class,
        CalculatorIsNumberNegativeTest.class
})
public class CalculatorTestSuite {
}
