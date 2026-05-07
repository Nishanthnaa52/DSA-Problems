import java.util.*;
class rotate {
    public static void main(String args[]) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Before rotate : \n"+" " + Arrays.deepToString(matrix));

        int m = matrix.length;
        int n = matrix[0].length;

        // int[][] ans = new int[m][n];

        // int column = 0;
        // int row = 0;

        // for (int i = m-1; i >= 0; i--) {
        //     column = 0;
        //     for (int j = 0; j < n; j++) {
        //         ans[column][row] = matrix[i][j];
        //         column++;
        //     }
        //     row++;
        // }

        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //     matrix[i][j] = ans[i][j];
        //     }
        // }

        // System.out.print("After rotate : \n+"+" "+Arrays.deepToString(matrix));

        

        for(int i = 0; i < m; i++) {
            for(int j = i; j < n; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
            reverse(matrix[i]);
        }

        // for (int i = 0; i < m; i++) {
        //     reverse(matrix[i]);
        // }


        System.out.print(Arrays.deepToString(matrix));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;

            start++;
            end--;
        }
    }
}


// 90 degree roate code:

// for(int i = 0; i < n; i++) {
//     for(int j = 0; j < n/2; j++) {
//         int temp = matrix[i][j];
//         matrix[i][j] = matrix[i][n-1-j];
//         matrix[i][n-1-j] = temp;
//     }
// }