package com.starter;

import java.util.Scanner;

import com.object.Computer;

public class Starter {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Computer macBook = new Computer();

		System.out.println("Specification of computer:");
		System.out.println();

		macBook.processorIs("1,7 GHz Intel Core i7");
		macBook.ramIs(8);
		macBook.hddIs(512);
		macBook.monitorIs(12);

		String result = macBook.PasswordCheck();

	//	System.out.println(result); // НЕ ПРИДУМАЛ, КАК ВЫВЕСТИ МИГАЮЩИЕ ТОЧКИ ПОСЛЕ Loading... + ЦВЕТОМ!!!

	}

}
