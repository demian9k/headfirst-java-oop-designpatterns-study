package io.demian._10_Iterator_03_dinerMerger_with_Cafe.Aggregate;

import java.util.Iterator;

import io.demian._10_Iterator_03_dinerMerger_with_Cafe.MenuItem;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
