package com.bridgelabz.emailvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationMain {

	public static boolean checkForValidEmailAddress(String emailAddress) {
		boolean isValidEmailAddress;
		String emailRegex = "^[\\u0E00-\\u0E7Fa-zA-Z]{1,}[\\.\\_\\-\\+]?[\\u0E00-\\u0E7Fa-zA-Z]*[@]{1}[\\u0E00-\\u0E7Fa-z0-9-]+[.]{1}[\\u0E00-\\u0E7Fa-z]+[.]?[\\u0E00-\\u0E7Fa-z]{2}$";
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(emailAddress);

		isValidEmailAddress = matcher.matches();
		return isValidEmailAddress;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Email Validator !");
		String inputEmailAddress = "abc-gg@ama.lmao.in";

		if (checkForValidEmailAddress(inputEmailAddress)) {
			System.out.println(inputEmailAddress + " is valid.");
		} else
			System.out.println(inputEmailAddress + " is invalid");
		testThDomain();

	}

	public static void testThDomain(){
		String[] thDomains = new String[4];
		thDomains[0] = "email-test@universal-acceptance-test.international";
		thDomains[1] = "email-test@universal-acceptance-test.icu";
		thDomains[2] = "อีเมลทดสอบ@ยูเอทดสอบ.ไทย";
		thDomains[3] = "อีเมลทดสอบ@ทีเอชนิค.องค์กร.ไทย";
		for(String thDomain : thDomains){
			if (checkForValidEmailAddress(thDomain)) {
				System.out.println(thDomain + " is valid.");
			} else
				System.out.println(thDomain + " is invalid");

		}
	}

}
