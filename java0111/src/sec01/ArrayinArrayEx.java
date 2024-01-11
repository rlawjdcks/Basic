package sec01;


public class ArrayinArrayEx {

	public static void main(String[] args) {
	
		int[][] scores = {{95,80}, 
							{92,96}};//2차원배열
		for (int j = 0; j < scores.length; j++) {
			for (int i = 0; i < scores[j].length; i++) {
				System.out.printf("(%d, %d) : " , j,i);
				System.out.println(scores[j][i]);
			}
		}
	}

}
