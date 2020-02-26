package com.course.springboot.encoder;

class Encoder {
	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

	public static String encode(String message, int key) {
		String encodedMsg = "";
		for (int i = 0; i < message.length(); i++) {
			char c = message.charAt(i);
			if (c == ' ') {
				encodedMsg = encodedMsg + " ";
			} else {
				encodedMsg = encodedMsg + ((char) (c + key));
			}
		}
		return encodedMsg;
	}

	public static String randomAlphaNumeric(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}
}
