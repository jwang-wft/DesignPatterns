package com.wang.patterns.iterator;

import java.util.Iterator;

public interface SongIterator {
	
	public Iterator<SongInfo> createIterator();
	
}