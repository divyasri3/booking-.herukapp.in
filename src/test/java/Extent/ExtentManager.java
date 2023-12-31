package Extent;

import com.aventstack.extentreports.ExtentTest;

public class ExtentManager {


    private ExtentManager() {
    }

    private static final ThreadLocal<ExtentTest> exTest = new ThreadLocal<>();

    public static ExtentTest getTest() {
        return exTest.get();
    }

    public static void setTest(ExtentTest test) {
        exTest.set(test);
    }
}
