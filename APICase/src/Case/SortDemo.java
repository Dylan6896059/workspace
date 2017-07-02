package Case;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class SortDemo {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		Random ran=new Random();
		for(int i=0;i<10;i++){
			list.add(ran.nextInt(100	));
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		

	}

}
