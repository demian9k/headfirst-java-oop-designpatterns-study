package io.demian._10_Iterator_02_dinerMerger_using_JAVA_Iterator.Iterator;

import java.util.Iterator;

import io.demian._10_Iterator_02_dinerMerger_using_JAVA_Iterator.MenuItem;

import java.util.Calendar;

public class AlternatingDinerMenuIterator implements Iterator<Object> {
	MenuItem[] items;
	int position;

	public AlternatingDinerMenuIterator(MenuItem[] items) {
		this.items = items;
		position = Calendar.DAY_OF_WEEK % 2;
	}
	public Object next() {
		MenuItem menuItem = items[position];
		position = position + 2;
		return menuItem;
	}
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}
	public void remove() {
		throw new UnsupportedOperationException(
			"Alternating Diner Menu Iterator does not support remove()");
	}
}
