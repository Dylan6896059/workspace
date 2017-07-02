package homework;

public class TJTest {

	public static void main(String[] args) {
		T t=new T(2,5);
		t.print();
		printwall(t);
		
		
		
		

	}
	public static void printwall(T t){
		for(int i=0;i<20;i++){
			for(int j=0;j<10;j++){
				boolean flag=false;
				for(int k=0;k<t.cells.length;k++){
					if(i==t.cells[k].row&&j==t.cells[k].col){
						flag=true;
						break;
					}
				}
				if(flag){
					System.out.print(" * ");
				}else{
					System.out.print(" - ");
				}
				
				
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
