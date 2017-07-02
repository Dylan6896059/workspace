package Case;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Aslist {

	public static void main(String[] args) {
		String[]str={"a","b","c"};
		List<String>list=Arrays.asList(str);
		System.out.println(list);
		//list.add("d");
		System.out.println(list.getClass().getName());
		List<String>list2=new ArrayList<String>();
		list2.addAll(list);
		list2.add("d");
		System.out.println(list2);
		

	}

}
