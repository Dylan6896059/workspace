package Case;
import java.util.List;
import java.util.ArrayList;
public class ListDemo {

	public static void main(String[] args) {
		List <Integer>list=new ArrayList<Integer>() ;
				for(int i=0;i<10;i++){
					list.add(i);
				}
		System.out.println(list);
		//subList是用于截取子List，和原List占有相同的存储空间，对子List的操作会影响原List
		List<Integer> subList=list.subList(3, 3+5);
		//没写<Integer>下面的*10就会编译错误
		System.out.println(subList);
		for(int i=0;i<subList.size();i++){
			subList.set(i, subList.get(i)*10);
		}
		System.out.println(subList);
		System.out.println(list);
		subList.clear();
		//用于删除连续的元素
		System.out.println(list);
	}

}
