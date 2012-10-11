package org.apache.camel.example.fix.simple;

import java.util.Date;

import org.apache.camel.dataformat.bindy.annotation.KeyValuePairField;
import org.apache.camel.dataformat.bindy.annotation.Message;
/**
 * Follow readMe for tags and tagnames
 * @author santoshjo
 *
 */
@Message(keyValuePairSeparator = "=", pairSeparator = "\\u0001", type = "FIX", version = "4.1")
public class Order {

	@KeyValuePairField(tag = 8)
	private String beginString;
	
	@KeyValuePairField(tag = 9)
	private long bodyLength;
	
	@KeyValuePairField(tag = 10)
	private long checkSum;
	
	@KeyValuePairField(tag = 11)
	private String clOrdID;
	
	@KeyValuePairField(tag = 21)
	private String handlInstId;
	
	@KeyValuePairField(tag = 34)
	private String msgSeqNum;
	
	@KeyValuePairField(tag = 35)
	private String msgType;
	
	@KeyValuePairField(tag = 38)
	private int orderQty;
	
	@KeyValuePairField(tag = 40)
	private String ordType;
	
	@KeyValuePairField(tag = 47)
	private String rule80A;
	
	@KeyValuePairField(tag = 49)
	private String senderCompID;
	
	@KeyValuePairField(tag = 52, pattern="yyyyMMdd-HH:mm:ss" )
	private Date sendingTime;
	
	@KeyValuePairField(tag = 54)
	private String side;
	
	@KeyValuePairField(tag = 55)
	private String symbol;
	
	@KeyValuePairField(tag = 56)
	private String targetCompID;
	
	@KeyValuePairField(tag = 59)
	private String timeInForce;
	
	@KeyValuePairField(tag = 60, pattern="yyyyMMdd-HH:mm:ss")
	private Date transactTime;
	
	@KeyValuePairField(tag = 115)
	private String OnBehalfOfCompID;
	
	@KeyValuePairField(tag = 207)
	private String ecurityExchange;
	
	
	public String getBeginString() {
		return beginString;
	}
	public void setBeginString(String beginString) {
		this.beginString = beginString;
	}
	public long getBodyLength() {
		return bodyLength;
	}
	public void setBodyLength(long bodyLength) {
		this.bodyLength = bodyLength;
	}
	public long getCheckSum() {
		return checkSum;
	}
	public void setCheckSum(long checkSum) {
		this.checkSum = checkSum;
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
	public String getMsgSeqNum() {
		return msgSeqNum;
	}
	public void setMsgSeqNum(String msgSeqNum) {
		this.msgSeqNum = msgSeqNum;
	}
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
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
	public String getSenderCompID() {
		return senderCompID;
	}
	public void setSenderCompID(String senderCompID) {
		this.senderCompID = senderCompID;
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
	public String getTargetCompID() {
		return targetCompID;
	}
	public void setTargetCompID(String targetCompID) {
		this.targetCompID = targetCompID;
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
	public String getOnBehalfOfCompID() {
		return OnBehalfOfCompID;
	}
	public void setOnBehalfOfCompID(String onBehalfOfCompID) {
		OnBehalfOfCompID = onBehalfOfCompID;
	}
	public String getEcurityExchange() {
		return ecurityExchange;
	}
	public void setEcurityExchange(String ecurityExchange) {
		this.ecurityExchange = ecurityExchange;
	}
	@Override
	public String toString() {
		return "Order [beginString=" + beginString + ", bodyLength="
				+ bodyLength + ", checkSum=" + checkSum + ", clOrdID="
				+ clOrdID + ", handlInstId=" + handlInstId + ", msgSeqNum="
				+ msgSeqNum + ", msgType=" + msgType + ", orderQty=" + orderQty
				+ ", ordType=" + ordType + ", rule80A=" + rule80A
				+ ", senderCompID=" + senderCompID + ", sendingTime="
				+ sendingTime + ", side=" + side + ", symbol=" + symbol
				+ ", targetCompID=" + targetCompID + ", timeInForce="
				+ timeInForce + ", transactTime=" + transactTime
				+ ", OnBehalfOfCompID=" + OnBehalfOfCompID
				+ ", ecurityExchange=" + ecurityExchange + "]";
	}
	
}
