package edu.mum;

public class CallDirector {
 private CallBuilder callBuilder=null;
 public CallDirector(CallBuilder callBuilder)
 {
	 this.callBuilder=callBuilder;
 }
 public void callConstract()
 {
	 callBuilder.buildAgent();
	 callBuilder.buildcall();
	 callBuilder.buildCustomer();
	 callBuilder.buildRequest();
	 callBuilder.closeCall();
	 
 }
 public RequestCall getRequestCall()
 {
	 return callBuilder.getRequestCall();
 }
 
}
