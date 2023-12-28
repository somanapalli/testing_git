package com.techm.filehandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test2 {

	public static void main(String[] args) {
		try {
			// create the object of PrintWriter

			PrintWriter pw = new PrintWriter("rk.txt");

			pw.println("rama");
			pw.println(23.45);
			pw.println(true);
			pw.println('r');

			pw.flush();

			System.out.println("data written successfully");

		} catch (FileNotFoundException fn) {
			System.out.println(fn);
		}

	}

}
