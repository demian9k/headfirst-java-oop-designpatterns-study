package io.demian._10_Iterator_02_dinerMerger_using_JAVA_Iterator.Aggregate;

import java.util.Iterator;

import io.demian._10_Iterator_02_dinerMerger_using_JAVA_Iterator.MenuItem;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
