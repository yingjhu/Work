package com.Interface;

import java.io.*;
import java.util.Scanner;

public class InputFile {

	public static void main(String[] args) {

		System.out.println("�ɦW");
		Scanner scanner = new Scanner(System.in);
		String filename = scanner.nextLine();
		ObjectOutputStream oos = null;

		String str = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(filename, true)) {
				protected void writeStreamHeader() throws IOException {

				}

			};
			do {
				System.out.println("���: ");
				String d = scanner.nextLine();

				System.out.println("����: ");
				String N = scanner.nextLine();

				System.out.println("��O: ");
				int P = Integer.parseInt(scanner.nextLine());

				System.out.println("�U�@��? (Y/N)");
				str = scanner.nextLine();

				Item item = new Item(N, P, d);
				oos.writeObject(item);// �g�J����
			} while (str.equalsIgnoreCase("Y"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oos.flush();
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			scanner.close();
		}//try

	}//main

}
