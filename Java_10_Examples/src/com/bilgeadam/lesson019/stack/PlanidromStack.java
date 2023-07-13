package com.bilgeadam.lesson019.stack;

import java.util.Scanner;
import java.util.Stack;

/*
 * Dışarıdan bir kelime alıp bu kelimeyi bir stacke atalım
 * daha sonra bu stack üzerinde çalışıp kelimenin palindrom olup olmadığını bulalım
 * tat, kek, kabak --> tersten okunuşu ve düzden okunuşu aynı olan kelimeler palindromdur.
 */

public class PlanidromStack {
	
	static Stack<Character> stack = new Stack<>();

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen Bir Kelime Giriniz: ");
		String kelime = scanner.nextLine();
		
		stackOlustur(kelime);
		
		System.out.println(stack);
		
		if (isPalindrom()) {
			System.out.println("Kelime Palindromdur.");
		} else {
			System.out.println("Kelime Palindrom Değildir.");
		}
	}

	private static boolean isPalindrom() {
		
		for (int i = 0; i < stack.size() / 2; i++) {
			
			if (stack.pop() != stack.get(i)) {
				return false;
			}
		}
		return true;
	}

	private static void stackOlustur(String kelime) {
		
		 for (int i = 0; i < kelime.length(); i++) {
			 stack.push(kelime.charAt(i));
	        }
	}
}