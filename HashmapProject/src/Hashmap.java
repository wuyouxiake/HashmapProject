import java.util.HashMap;
import java.util.Scanner;
public class Hashmap {
	public static void main(String[] args) {
		int temp=0;
		String tempString;
		Scanner in=new Scanner(System.in);
		String choice="y";
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		while(choice.equalsIgnoreCase("y")){
			//System.out.println("map = " + map);
			//System.out.println("A cat says... " + map.get(1));
			//System.out.println("A dog says... " + map.get(2));
			System.out.println("Enter a number:");
			temp=in.nextInt(); 
			if(map.containsKey(temp)){
				System.out.println("You entered "+map.get(temp));
			}else{
				System.out.println("The number you entered does not exist. ");
				System.out.println("Please spell the number: ");
				tempString=in.next();
				map.put(temp, tempString);
			}
			System.out.println("Continue?(y/n)");
			choice=in.next();
		}
	}
}