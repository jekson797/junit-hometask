package by.epamlab.junit_hometask.test_condition;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

public class CalculatorConditions {

    @Rule
    public TestName name= new TestName();

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    protected Calculator getCalculator() {
        return calculator;
    }
}
