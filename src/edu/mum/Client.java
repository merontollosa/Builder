package edu.mum;

public class Client {
  public static void main(String args[])
  {
	  CallDirector callDirector=new CallDirector(new AgentCall());
	  callDirector.callConstract();
	  RequestCall call=callDirector.getRequestCall();
	System.out.println("Caller name : "+call.getBuildCustomer().getName());
	System.out.println("Reason for calling  : "+call.getBuildRequest().getReqContent());
	System.out.println("Response   : "+call.getBuildRequest().getRespContent());
	System.out.println("Call handled by   : "+call.getBuildAgent().getAgentId());
	System.out.println("Call back   : "+call.getBuildRequest().isNeedCallBack());
	
	
	 
	  
	  
  }
}
