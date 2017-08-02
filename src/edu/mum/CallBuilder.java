package edu.mum;

public interface CallBuilder {
 public void buildAgent();
 public Customer buildCustomer();
 public Request buildRequest();
 public void closeCall();
 public RequestCall getRequestCall();
 public void buildcall();
	
}
