package com.annesam.util;

import java.io.*;
import java.util.Random;

import com.annesam.sdfs.Main;


public class RandomFile {
	public static void writeRandomFile(String fileName, double size) throws IOException {
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(fileName));
		long currentpos = 0;
		Random r = new Random();
		while(currentpos < size) {
			byte [] rndB = new byte[Main.CHUNK_LENGTH];
			r.nextBytes(rndB);
			out.write(rndB);
			currentpos = currentpos + rndB.length;
			out.flush();
		}
		out.flush();
		out.close();
	}
	
	public static void main (String [] args) throws IOException {
		long size = 200*1024L*1024L*1024L;
		writeRandomFile("/home/annesam/rnd.bin",size);
	}

}
