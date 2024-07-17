package dp4;

import java.util.ArrayList;
import java.util.Iterator;


public class Sale {
	private ArrayList<Item> items = new ArrayList<Item>();
	private HD108ReceiptPrinter printer = new HD108ReceiptPrinter();
	
	public void printReceipt() {
		Iterator<Item> itr = items.iterator();
		StringBuffer buf = new StringBuffer();
		while (itr.hasNext()) {
			Item item = itr.next();
			buf.append(item.getName());
			buf.append(item.getPrice());
		}
		
		printer.print(buf);
		
	}
	
	public void add(Item item) {
		items.add(item);
	}
}
