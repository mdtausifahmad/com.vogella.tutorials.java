package com.vogella.java.introduction;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class DowloadWebpageExampleScanner {
	public static void main(String[] args) {
		try (
				InputStream openStream = new URL("http://www.vogella.com").openStream();
				Scanner scanner = new Scanner(openStream, "UTF-8");) {
			String out = scanner.useDelimiter("\\A").next();
			System.out.println(out);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
