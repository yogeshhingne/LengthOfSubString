package MaxsubString;
import java.util.*;
import java.util.stream.Stream;
public class SubString {
public static void main(String x[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Input : ");
	String s=sc.nextLine();
	String str[]=s.split("");
	ArrayList<String> strList = new ArrayList<String>(
            Arrays.asList(str));
	long ln =strList.stream().distinct().count();
	System.out.println("output: "+ln);
}
}