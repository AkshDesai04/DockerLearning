import java.math.BigInteger;

class Sol {
    static BigInteger counter = new BigInteger("0");

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
        counter.add(BigInteger.ONE);
        int col_size = matrix.length;
        counter.add(BigInteger.ONE);
        int row_size = matrix[0].length;
        counter.add(BigInteger.ONE);
        int count = 0;
        counter.add(BigInteger.ONE);

        counter.add(BigInteger.ONE);
        for(int i = 0;i < col_size;i++) {
        counter.add(BigInteger.ONE);
        counter.add(BigInteger.ONE);
        
        counter.add(BigInteger.ONE);
            for(int j = 0;j < row_size;j++) {
        counter.add(BigInteger.ONE);
        counter.add(BigInteger.ONE);

        counter.add(BigInteger.ONE);
                for(int k = i;k < col_size;k++) {
        counter.add(BigInteger.ONE);
        counter.add(BigInteger.ONE);

        counter.add(BigInteger.ONE);
                    for(int l = j;l < row_size;l++) {
        counter.add(BigInteger.ONE);
        counter.add(BigInteger.ONE);

        counter.add(BigInteger.ONE);
        counter.add(BigInteger.ONE);
                        if(sumOfSubMatrix(matrix, i, j, k, l) == target) {
        counter.add(BigInteger.ONE);
                            count++;
                        }
                    }
                }
            }
        }

        counter.add(BigInteger.ONE);
        return count;
    }

    public static int sumOfSubMatrix(int[][] arr, int i, int j, int k, int l) {
        counter.add(BigInteger.ONE);
        counter.add(BigInteger.ONE);
        int sum = 0;
        counter.add(BigInteger.ONE);
        for(;i <= k;i++) {
        counter.add(BigInteger.ONE);
        counter.add(BigInteger.ONE);

        counter.add(BigInteger.ONE);
            for(int x = j;x <= l;x++) {
        counter.add(BigInteger.ONE);
        counter.add(BigInteger.ONE);
                sum += arr[i][x];
        counter.add(BigInteger.ONE);
        counter.add(BigInteger.ONE);
            }
        }

        counter.add(BigInteger.ONE);
        return sum;
    }
}
