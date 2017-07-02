package Case;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
public class IteratorDemo {

	public static void main(String[] args) {
		Collection<String> c1=new HashSet<String>();
		c1.add("Tom");
		c1.add("Jerry");
		c1.add("Andy");
		c1.add("RoBIN");
		c1.add("Tom");
		System.out.println(c1);
		Iterator<String>ite=c1.iterator();
		while(ite.hasNext()){
			String str=ite.next();
			System.out.println(str);
		}
		ite.remove();
		System.out.println(c1);
	
	for(String str:c1){
		System.out.println(str);
	}
	}
}
