package test.java.utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
        int count = 1;
        int retryCount = 2;    // этой переменной мы ставим сколько раз перегонять упавший тест


@Override
public boolean retry(ITestResult iTestResult) {
        if (count < retryCount) {
        count++;
        return true;
        }
        return false;  // если true бесконечно будет прогоняться
        //return false; если оставим ничего не поменяется


        }
        }