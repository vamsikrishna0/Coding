import java.util.*;
	
public class Logic {
	public HashMap<Integer, Student> buildMap(Student[] students) {
	 HashMap<Integer, Student> map = new HashMap<Integer, Student>();
		 for (Student s : students) map.put(s.getId(), s);
		 return map;
		}
	
	public static String sort(String s){
	    char[] charArr = s.toCharArray();
		java.util.Arrays.sort(charArr);
		return new String(charArr);
	  }
	  
	  public static boolean isPerm(String s, String t){
	    if(s.length() != t.length()){
		  return false;
		}
		return (sort(s).equals(sort(t)));
	  }
	  public static void main(String args[]){
	  
	    Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		
		
		System.out.println(isPerm(s,t));
	  }
}
