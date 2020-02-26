package com.course.springboot.encoder;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	Encoder ec = new Encoder();
	PrintWriter writer;
	String encodedMsg = "";

	@PostMapping(path = "/api/encode")
	public String customerInformation(@RequestBody Message msg)
			throws FileNotFoundException, UnsupportedEncodingException {
		System.out.println("Message is :" + msg.getMessage());
		System.out.println("Shift is :" + msg.getShift());
		encodedMsg = Encoder.encode(msg.getMessage(), msg.getShift());

		writer = new PrintWriter(ec.randomAlphaNumeric(8) + "-" + msg.getShift(), "UTF-8");
		writer.println(encodedMsg);
		writer.close();
		return "Encoded message is ::" + encodedMsg;

	}

}
