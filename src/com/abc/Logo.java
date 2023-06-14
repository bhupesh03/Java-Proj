package com.abc;

import java.io.FileInputStream;
import java.io.IOException;

public class Logo {

	public void logo() throws IOException {
		FileInputStream fin = new FileInputStream("C:\\Users\\bhupe\\OneDrive\\Desktop/Files.txt");
		int i = fin.read();
		while ((i = fin.read()) != -1)
			System.out.print((char) i);

		fin.close();

	}
}
