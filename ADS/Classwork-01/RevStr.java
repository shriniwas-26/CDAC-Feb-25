import java.util.Scanner;
class RevStr{
	static String revString(String str,int i){
		String newStr = "";
		if(i==0){
			return newStr+str.charAt(i);
		}
		return str.charAt(i)+newStr+revString(str,i-1);
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(revString(str,str.length()-1));
	}
}