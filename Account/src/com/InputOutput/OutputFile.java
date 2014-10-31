package com.InputOutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OutputFile {

	public static void main(String[] args) {
		
		
		
		try{
		    FileOutputStream fos = new FileOutputStream("Accountbooks.dat");
		    ObjectOutputStream oos = new ObjectOutputStream(fos);
		    oos.writeObject(fos);
		    oos.flush();
		    oos.close();
		}catch (IOException e){
		    e.printStackTrace();
		}

	}

}
