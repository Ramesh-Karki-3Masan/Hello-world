package com.helloworld.gitProject;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class PrintName {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		String first_name;
		out.println("Enter your first name:");
		first_name = user_input.next();
		out.println("you entered:" + first_name);

	}

}
