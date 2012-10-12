package org.apache.camel.example.fix.simple;

public enum MessageType {

	OrderCancelReject("9"),
	OrderCancelReplaceRequest("G"),
	OrderCancelRequest("F"),
	OrderMassActionReport("BZ"),
	OrderMassActionRequest("CA"),
	OrderMassCancelReport("r"),
	OrderMassCancelRequest("q"),
	OrderMassStatusRequest("AF"),
	OrderStatusRequest("H");
	
	private String code;
	
	MessageType(String code){
		this.code= code;
	}
	
	public String getCode(){
		return this.code;
	}
}
