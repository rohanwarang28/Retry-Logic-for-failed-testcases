package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class TestAnalyzer implements IRetryAnalyzer{

	int counter=0;
	int max_attempt=3;
	
	public boolean retry(ITestResult result) {
		if(counter<max_attempt)
		{
			counter++;
			return true;
		}
		return false;
	}

}
