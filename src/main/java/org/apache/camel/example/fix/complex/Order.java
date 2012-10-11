package org.apache.camel.example.fix.complex;

import java.util.Date;

import org.apache.camel.dataformat.bindy.annotation.KeyValuePairField;
import org.apache.camel.dataformat.bindy.annotation.Link;
import org.apache.camel.dataformat.bindy.annotation.Message;
import org.apache.camel.dataformat.bindy.annotation.Section;
/**
 * Follow readMe for tags and tagnames
 * @author santoshjo
 *
 */
@Message(keyValuePairSeparator = "=", pairSeparator = "\\u0001", type = "FIX", version = "4.1")
@Section(number=2)
public class Order {

	@Link private Header header;

    @Link private Trailer trailer;
    
	@KeyValuePairField(tag = 11)
	private String clOrdID;
	
	@KeyValuePairField(tag = 21)
	private String handlInstId;
	
	@KeyValuePairField(tag = 38)
	private int orderQty;
	
	@KeyValuePairField(tag = 40)
	private String ordType;
	
	@KeyValuePairField(tag = 47)
	private String rule80A;
	
	@KeyValuePairField(tag = 52, pattern="yyyyMMdd-HH:mm:ss" )
	private Date sendingTime;
	
	@KeyValuePairField(tag = 54)
	private String side;
	
	@KeyValuePairField(tag = 55)
	private String symbol;
	
	@KeyValuePairField(tag = 59)
	private String timeInForce;
	
	@KeyValuePairField(tag = 60, pattern="yyyyMMdd-HH:mm:ss")
	private Date transactTime;
	
	@KeyValuePairField(tag = 91)
	private String message;
	
	@KeyValuePairField(tag = 115)
	private String OnBehalfOfCompID;
	
	@KeyValuePairField(tag = 207)
	private String securityExchange;

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public Trailer getTrailer() {
		return trailer;
	}

	public void setTrailer(Trailer trailer) {
		this.trailer = trailer;
	}

	public String getClOrdID() {
		return clOrdID;
	}

	public void setClOrdID(String clOrdID) {
		this.clOrdID = clOrdID;
	}

	public String getHandlInstId() {
		return handlInstId;
	}

	public void setHandlInstId(String handlInstId) {
		this.handlInstId = handlInstId;
	}

	public int getOrderQty() {
		return orderQty;
	}

	public void setOrderQty(int orderQty) {
		this.orderQty = orderQty;
	}

	public String getOrdType() {
		return ordType;
	}

	public void setOrdType(String ordType) {
		this.ordType = ordType;
	}

	public String getRule80A() {
		return rule80A;
	}

	public void setRule80A(String rule80a) {
		rule80A = rule80a;
	}

	public Date getSendingTime() {
		return sendingTime;
	}

	public void setSendingTime(Date sendingTime) {
		this.sendingTime = sendingTime;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getTimeInForce() {
		return timeInForce;
	}

	public void setTimeInForce(String timeInForce) {
		this.timeInForce = timeInForce;
	}

	public Date getTransactTime() {
		return transactTime;
	}

	public void setTransactTime(Date transactTime) {
		this.transactTime = transactTime;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getOnBehalfOfCompID() {
		return OnBehalfOfCompID;
	}

	public void setOnBehalfOfCompID(String onBehalfOfCompID) {
		OnBehalfOfCompID = onBehalfOfCompID;
	}

	public String getSecurityExchange() {
		return securityExchange;
	}

	public void setSecurityExchange(String securityExchange) {
		this.securityExchange = securityExchange;
	}

	@Override
	public String toString() {
		return "Order [header=" + header + ", trailer=" + trailer
				+ ", clOrdID=" + clOrdID + ", handlInstId=" + handlInstId
				+ ", orderQty=" + orderQty + ", ordType=" + ordType
				+ ", rule80A=" + rule80A + ", sendingTime=" + sendingTime
				+ ", side=" + side + ", symbol=" + symbol + ", timeInForce="
				+ timeInForce + ", transactTime=" + transactTime + ", message="
				+ message + ", OnBehalfOfCompID=" + OnBehalfOfCompID
				+ ", securityExchange=" + securityExchange + "]";
	}

}
