package com.annesam.sdfs.servers;

public class ByteCache {
	byte[] cache;

	ByteCache(byte[] b) {
		cache = b;
	}

	byte[] getCache() {
		return cache;
	}

}
