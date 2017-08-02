package edu.mum;

public class RequestCall {

	private  Agent buildAgent;
	private Customer buildCustomer;
	private Request buildRequest;
	private Call buildCall;
	public Customer getBuildCustomer() {
		return buildCustomer;
	}
	public void setBuildCustomer(Customer buildCustomer) {
		this.buildCustomer = buildCustomer;
	}
	public Request getBuildRequest() {
		return buildRequest;
	}
	public void setBuildRequest(Request buildRequest) {
		this.buildRequest = buildRequest;
	}
	public Call getBuildCall() {
		buildCall.callPop(buildAgent);
		return buildCall;
	}
	public void setBuildCall(Call buildCall) {
		this.buildCall = buildCall;
	}
	public Agent getBuildAgent() {
		return buildAgent;
	}
	public void setBuildAgent(Agent buildAgent) {
		this.buildAgent = buildAgent;
	}
	//private String closeCall ;
	
}
