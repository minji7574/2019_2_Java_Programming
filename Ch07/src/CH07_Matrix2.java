
public class CH07_Matrix2 {
	public static int count = 1;

	public static void makeMatrix2(int[][] a) {
		// TODO Auto-generated method stub
		for (int row = 0 ; row < a.length ; row++)
			for (int column = 0 ; column < a[row].length ; column++) {
				a[row][column]=count;
				count++;
			}
	}

	public static void addition(int[][] a, int[][] b) {
		// TODO Auto-generated method stub
		System.out.println("\nMatrix addition is ..");
		for (int row = 0 ; row < b.length ; row++) {
			for (int column = 0 ; column < b[row].length ; column++) {
				System.out.print((a[row][column]+b[row][column])+" ");
			}
			System.out.println();
		}
	}

	public static void subtraction(int[][] a, int[][] b) {
		// TODO Auto-generated method stub
		System.out.println("\nMatrix subtraction is ..");
		for (int row = 0 ; row < b.length ; row++) {
			for (int column = 0 ; column < b[row].length ; column++) {
				System.out.print((a[row][column]-b[row][column])+" ");
			}
			System.out.println();
		}
	}

	public static void multiplication(int[][] a, int[][] b) {
		// TODO Auto-generated method stub
		System.out.println("\nMatrix multiplication is ..");
		for (int row = 0 ; row < b.length ; row++) {
			for (int column = 0 ; column < b[row].length ; column++) {
				int result = (b[0][column]*a[row][0])
						+(b[1][column]*a[row][1])
						+(b[2][column]*a[row][2]);
				System.out.print(result+" ");
			}
			System.out.println();
		}
	}

}
