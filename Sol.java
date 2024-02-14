class Sol {
    static Long counter = new Long(0);

    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        int[][] arr = new int[size][size];

        for(int i = 0;i < size;i++)
            for(int j = 0;j < size;j++)
                arr[i][j] = 1;

        System.out.println("Array Built");

        int num = numSubmatrixSumTarget(arr, 0);
        System.out.println(counter + " " + num);
    }

    public static int numSubmatrixSumTarget(int[][] matrix, int target) {
        counter++;
        int col_size = matrix.length;
        counter++;
        int row_size = matrix[0].length;
        counter++;
        int count = 0;
        counter++;

        counter++;
        for(int i = 0;i < col_size;i++) {
        counter++;
        counter++;
        
        counter++;
            for(int j = 0;j < row_size;j++) {
        counter++;
        counter++;

        counter++;
                for(int k = i;k < col_size;k++) {
        counter++;
        counter++;

        counter++;
                    for(int l = j;l < row_size;l++) {
        counter++;
        counter++;

        counter++;
        counter++;
                        if(sumOfSubMatrix(matrix, i, j, k, l) == target) {
        counter++;
                            count++;
                        }
                    }
                }
            }
        }

        counter++;
        return count;
    }

    public static int sumOfSubMatrix(int[][] arr, int i, int j, int k, int l) {
        counter++;
        counter++;
        int sum = 0;
        counter++;
        for(;i <= k;i++) {
        counter++;
        counter++;

        counter++;
            for(int x = j;x <= l;x++) {
        counter++;
        counter++;
                sum += arr[i][x];
        counter++;
        counter++;
            }
        }

        counter++;
        return sum;
    }
}
