package com.horia.decorator;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class InputTest {
	public static void main(String[] args) throws IOException {
		
		InputTest it = new InputTest();
		it.process();
	}

	public void process() {
		int c;
		try {
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(
					getURL("test.txt").openStream()));
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private URL getURL(String filename) {
		URL url = null;
		try {
			url = this.getClass().getResource(filename);
			// url = new java.net.URL(applet.getCodeBase() + filename);
		}
		// catch (MalformedURLException e) { e.printStackTrace(); }
		catch (Exception e) {
		}

		return url;
	}
}