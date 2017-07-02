package month5day27;
import java.util.Scanner;
public class Case01 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char[] chs=generate();
		System.out.println(chs);
		System.out.println("游戏开始");
		do{
			String str=scan.next().toUpperCase();
			char[]input=str.toCharArray();
			int []result=check(chs,input);
			if(result[1]==input.length){
				System.out.println("猜对了");
				break;
			}else{
				System.out.println("猜对的字母有"+result[0]+"猜对的位置有" +result[1]);
			}
			
			
		}while(true);
		
		
		
		
	}
	public static int []check(char[] chs,char[]input){
		int []result=new int[2];
		for(int i=0;i<chs.length;i++){
			for(int j=0;j<input.length;j++){
				if(chs[i]==input[j]){
					result[0]++;
					if(i==j){
						result[1]++;
					}
				}
				
				
			}
		}
		
		
		
		return result;
	}
	public static char[] generate(){
		char[] chs=new char[5];
		char[] letters={
				'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'
		};
		boolean[] flags=new boolean[26];
		for(int i=0;i<5;i++){
			int index;
			do{
				index=(int)(Math.random()*26);
			}while(flags[index]);
			chs[i]=letters[index];
			flags[index]=true;
		}
		
		
		
		
		
		
		return chs;
	}
}
