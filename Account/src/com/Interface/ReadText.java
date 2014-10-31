package com.Interface;

import java.io.*;

public class ReadText {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		System.out.println("¿…¶W");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String filename = br.readLine();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				filename)) {
			protected void readStreamHeader() throws IOException {

			}
		};
		try {
			Item item;
			while ((item = (Item) ois.readObject()) != null) {
				System.out.println(item);
			}
		} catch (EOFException e) {

		}
		ois.close();
	}

}
