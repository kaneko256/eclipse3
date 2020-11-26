package com.github.eclipse3;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter your name: ");
			String name = scanner.nextLine();
			System.out.println("Hello " + name);
		}
	}
}
