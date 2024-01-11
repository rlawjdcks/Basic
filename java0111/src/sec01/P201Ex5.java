package sec01;

public class P201Ex5 {

	public static void main(String[] args) {
		int[][] arr = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}		};
		
		int sum = 0;
		int cnt = 0;
		double avg = 0.0;
		
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr[j].length; i++) {
				System.out.printf("(%d, %d) : " , j,i);
				sum += arr[j][i];
				cnt++;
			}
		}
		
		avg = (double)sum/cnt;
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
	}

}
