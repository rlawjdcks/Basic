package sec01.exam01;

public class ObjEx {

	public static void main(String[] args) {
		String string1  = new String("ad");
		String string2  = new String("ad");
		
		String aaString = "가나";
		String aaString2 = "가나";
		
		System.out.println(string1 == string2);
		System.out.println(aaString == aaString2);
		System.out.println(string1.equals(string2));
		System.out.println(aaString.equals(aaString2));
		
		
		
		Object object1 = new Object();
		Object object2 = new Object();
		
		boolean result1 = object1.equals(object2);
		System.out.println(result1);
		
		
		boolean result2 = (object1==object2);
		System.out.println(result2);
	}

}
