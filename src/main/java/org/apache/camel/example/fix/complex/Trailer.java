package org.apache.camel.example.fix.complex;

import org.apache.camel.dataformat.bindy.annotation.KeyValuePairField;
import org.apache.camel.dataformat.bindy.annotation.Link;
import org.apache.camel.dataformat.bindy.annotation.Section;

@Link
@Section(number=3)
public class Trailer {

    @KeyValuePairField(tag = 10, required = true)
    private int checkSum;

    @KeyValuePairField(tag = 93, required = false)
    private int signatureLength;
    
    @KeyValuePairField(tag = 89, required = false)
    private String signature;

	public int getCheckSum() {
		return checkSum;
	}

	public void setCheckSum(int checkSum) {
		this.checkSum = checkSum;
	}

	public int getSignatureLength() {
		return signatureLength;
	}

	public void setSignatureLength(int signatureLength) {
		this.signatureLength = signatureLength;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	@Override
	public String toString() {
		return "Trailer [checkSum=" + checkSum + ", signatureLength="
				+ signatureLength + ", signature=" + signature + "]";
	}
    
}
