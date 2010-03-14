package com.annesam.sdfs.filestore;

public interface AbstractChunkStoreListener {
	public abstract void chunkMovedEvent(ChunkEvent e);
	public abstract void chunkRemovedEvent(ChunkEvent e);
}
