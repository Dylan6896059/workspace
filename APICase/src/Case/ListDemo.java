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
		//subList�����ڽ�ȡ��List����ԭListռ����ͬ�Ĵ洢�ռ䣬����List�Ĳ�����Ӱ��ԭList
		List<Integer> subList=list.subList(3, 3+5);
		//ûд<Integer>�����*10�ͻ�������
		System.out.println(subList);
		for(int i=0;i<subList.size();i++){
			subList.set(i, subList.get(i)*10);
		}
		System.out.println(subList);
		System.out.println(list);
		subList.clear();
		//����ɾ��������Ԫ��
		System.out.println(list);
	}

}
