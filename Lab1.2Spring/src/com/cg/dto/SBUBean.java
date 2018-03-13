package com.cg.dto;

public class SBUBean implements Details
{
	int sbuId;
	String sbuName;
	String sbuHead;

	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}

	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
@Override
public void getAllDetails() {
	// TODO Auto-generated method stub
	
}

}