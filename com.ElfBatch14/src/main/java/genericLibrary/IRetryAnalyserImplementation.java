package genericLibrary;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyserImplementation implements IRetryAnalyzer{
	
	int count=0;
	int retrycount=2;

	public boolean retry(ITestResult arg0) {
		if(retrycount>count){
			count++;
			return true;
		}
		return false;
	}

}
