package com.course.springboot.encoder;

public class Message {

	private int Shift;
	private String Message;

	public Message(int Shift, String Message) {
		this.Shift = Shift;
		this.Message = Message;

	}

	public int getShift() {
		return Shift;
	}

	public void setShift(int Shift) {
		this.Shift = Shift;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String Message) {
		this.Message = Message;
	}

}
