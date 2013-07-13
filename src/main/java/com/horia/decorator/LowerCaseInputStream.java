package com.horia.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

	protected LowerCaseInputStream(InputStream arg0) {
		super(arg0);
	}

	@Override
	public int read() throws IOException {
		// TODO Auto-generated method stub
		int c = super.read();
		return (c == -1 ? c : Character.toLowerCase((char) c));
	}

	@Override
	public int read(byte[] b, int offset, int len) throws IOException {
		int result = super.read(b, offset, len);
		for (int i = offset; i < offset + result; i++) {
			b[i] = (byte) Character.toLowerCase((char) b[i]);
		}
		return result;
	}

}
