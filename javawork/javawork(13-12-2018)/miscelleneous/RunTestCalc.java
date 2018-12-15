package com.lti.miscelleneous;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunTestCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
            		Result result=JUnitCore.runClasses(TestCalc.class);
            		
            		List<Failure> failures=result.getFailures();
            		
            		if(!failures.isEmpty()) {
            			System.out.println(failures);
            		}        
	}

}
