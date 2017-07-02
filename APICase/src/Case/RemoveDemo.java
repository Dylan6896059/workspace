package Case;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
public class RemoveDemo {

	public static void main(String[] args) {
		Collection<String> c1=new HashSet<String>();
		c1.add("tom");
		c1.add("andy");
		c1.add("jerry");
		c1.add("mac");
		System.out.println(c1);
	  Iterator<String> ite=c1.iterator();
	  while(ite.hasNext()){
		  String str=ite.next();
		  if(str.indexOf("y")!=-1){
			  ite.remove();
		  }
	  }
	  System.out.println(c1);
	  
	  
	}

}
