package org.apache.camel.example.fix.complex;

import org.apache.camel.dataformat.bindy.annotation.KeyValuePairField;
import org.apache.camel.dataformat.bindy.annotation.Link;
import org.apache.camel.dataformat.bindy.annotation.Section;

@Link
@Section(number=1)
public class Header {

	@KeyValuePairField(tag = 8, required =  true)
	private String beginString;
	
	@KeyValuePairField(tag = 9, required =  true)
	private long bodyLength;
	
	@KeyValuePairField(tag = 10, required =  true)
	private long checkSum;

	@KeyValuePairField(tag = 34, required =  true)
	private String msgSeqNum;
	
	@KeyValuePairField(tag = 35, required =  true)
	private String msgType;

    @KeyValuePairField(tag = 49, required =  true)
    // Company sender Id
    private String sendCompId;
    
	@KeyValuePairField(tag = 56, required =  true)
	private String targetCompID;

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

	public String getSendCompId() {
		return sendCompId;
	}

	public void setSendCompId(String sendCompId) {
		this.sendCompId = sendCompId;
	}

	public String getTargetCompID() {
		return targetCompID;
	}

	public void setTargetCompID(String targetCompID) {
		this.targetCompID = targetCompID;
	}

	@Override
	public String toString() {
		return "Header [beginString=" + beginString + ", bodyLength="
				+ bodyLength + ", checkSum=" + checkSum + ", msgSeqNum="
				+ msgSeqNum + ", msgType=" + msgType + ", sendCompId="
				+ sendCompId + ", targetCompID=" + targetCompID + "]";
	}
	
	
}
