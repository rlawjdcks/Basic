package sec04.exam01;

public class Star {

	public static void main(String[] args) {
		int arr[];
		int i= 0;
		arr = new int[10];
		arr[0] = 0;
		arr[1] = 1;
		
		while (i<8) {
			arr[i+2] = arr[i+1] + arr[i];
			i++;
		}
		System.out.println(arr[9]);
		

//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j <= 3-i; j++) {
//				System.out.print("*");
//
//			}
//			System.out.println("");
//		}

	}

}
