package edu.mum;

public class AgentCall implements CallBuilder{
     private RequestCall requestCall=new RequestCall();

	@Override
	public void buildAgent() {
     requestCall.setBuildAgent(new Agent("agent0001",01));
     
	}

	@Override
	public Customer buildCustomer() {
		requestCall.setBuildCustomer(new Customer("customer1",new Address("18900 Glenvile rd","Springfield","Va","20987"),"0923456"));
		return requestCall.getBuildCustomer();
	}

	@Override
	public Request buildRequest() {
		requestCall.setBuildRequest(new Request("R1001",requestCall.getBuildCustomer(),requestCall.getBuildAgent(),"My account has unknown activity"));
	     return requestCall.getBuildRequest();
	
	}

	@Override
	public void closeCall() {
		requestCall.getBuildRequest().setRespContent("The problem is not solved completely");
		requestCall.getBuildRequest().setAnswered(true);
		requestCall.getBuildRequest().setNeedCallBack(true);
	
	}

	@Override
	public RequestCall getRequestCall() {
		
	   return requestCall;
	}
	@Override
	public void buildcall() {
		requestCall.setBuildCall(new Call());
		
	}

}
