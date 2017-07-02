package Case;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class ToArrayDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("a") ;
		list.add("b");
		list.add("c");
		String [] strAry=list.toArray(new String[] {}	);
		System.out.println(Arrays.toString(strAry));
	}

}
