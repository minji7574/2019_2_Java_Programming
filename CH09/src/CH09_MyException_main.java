import java.util.Scanner;
public class CH09_MyException_main {
	public static void main(String[] args) {
		Scanner kb= new Scanner(System.in);
		try{
			String str= kb.nextLine();
			StringTest(str);
		}
		catch(CH09_MyException mae){
			System.out.println(mae);
		}
		kb.close();
		}
	
	static void StringTest(String str) throws CH09_MyException{
		if (str.contains("$"))
			throw new CH09_MyException();
		System.out.println("String: "+str);
	}
}
