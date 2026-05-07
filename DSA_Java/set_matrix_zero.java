import java.util.*;


class matrix {


	public static void main(String args[]) {

		int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};

		System.out.println(Arrays.deepToString(matrix));

		int row = matrix.length;
		int cloumn = matrix[0].length;

		HashSet<Integer> ZeroColumn = new HashSet<>();
		HashSet<Integer> ZeroRow = new HashSet<>();


		for (int i = 0; i < row; i++) {

			for (int j = 0; j < cloumn; j++) {

				int value = matrix[i][j];

				if (value == 0) {

					ZeroRow.add(i);
					ZeroColumn.add(j);

				}

			}

		}

		

		for (int c : ZeroRow) {
			for (int i = 0; i < cloumn; i++) {
				matrix[c][i] = 0;
			}
		}

		for (int c : ZeroColumn) {
			for (int i = 0; i < row; i++) {
				matrix[i][c] = 0;
			}
		}

		System.out.println(ZeroRow);
		System.out.println(ZeroColumn);

		System.out.println(Arrays.deepToString(matrix));

	}

}