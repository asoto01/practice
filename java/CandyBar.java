class CandyBar {

    public static void main(String[] args) {
        int[] candyA = {1, 2};
        int[] candyB = {2, 3};
        System.out.println(fairCandySwap(candyA, candyB));
    }

    public int[] fairCandySwap(int[] A, int[] B) {
        int[] swappedCandy = new int[2];
        
        int totalCandyA  = 0;
        for (int i = 0; i < A.length; i++) {
            totalCandyA += A[i];
        }
        
        int totalCandyB = 0;
        for (int i = 0; i < B.length; i++) {
            totalCandyB += B[i];
        }
        
        for (int i = 0; i  < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int tempTotalA = totalCandyA;
                int tempTotalB = totalCandyB;
                tempTotalA -= A[i];
                tempTotalA += B[j];
                tempTotalB -= B[j];
                tempTotalB += A[i];
                if (tempTotalA == tempTotalB) {
                    swappedCandy[0] = A[i];
                    swappedCandy[1] = B[j];
                }
            }

        }
        
        return swappedCandy;
    }
}