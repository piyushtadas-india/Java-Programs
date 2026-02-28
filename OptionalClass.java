package com.practicejava8;

import java.util.Optional;

import org.w3c.dom.UserDataHandler;

public class OptionalClass {

	private String email;

    public String getEmail() {
        return email;
    }
	public static void main(String[] args) {
		Optional<String> opt = Optional.of("piyush");
		System.out.println(opt);
		
		
		System.out.println("---------------------------");
		
		Optional<String> ott = Optional.ofNullable("Iphone");
		System.out.println(ott.isPresent());

		
		System.out.println("---------------------------");
		
		Optional<String> email = Optional.ofNullable("no-email@demo.com");
		String mail = email.orElse("no-email@demo.com1");
		System.out.println(mail);
	}

}
