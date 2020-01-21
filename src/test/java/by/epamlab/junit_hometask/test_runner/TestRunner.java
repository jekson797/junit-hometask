package by.epamlab.junit_hometask.test_runner;

import by.epamlab.junit_hometask.test_suite.CalculatorTestSuite;
import by.epamlab.junit_hometask.test_suite.TimeoutTestSuite;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result calculatorResult = JUnitCore.runClasses(CalculatorTestSuite.class);
        Result timeoutResult = JUnitCore.runClasses(TimeoutTestSuite.class);
        printResultInConsole("Calculator test", calculatorResult);
        printResultInConsole("Timeout test", timeoutResult);
    }

    private static void printResultInConsole(String testName, Result result) {
        printFailureFromResult(result);
        System.out.println(testName + " was successful? - " + result.wasSuccessful());
    }

    private static void printFailureFromResult(Result result) {
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }
}
