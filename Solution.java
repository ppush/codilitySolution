class Solution {

    public static int solution(int[] A, int[] B) {        
        int overlapCount = A.length;
        for (int x = 0; x < A.length; x = x + 1) {
            for (int y = x; y < A.length; y = y + 1) {
                if (x == y) {
                    continue;
                }
                int[] i1 = {A[x], B[x]};
                int[] i2 = {A[y], B[y]};
                if (Solution.isOverlapInterval(i1, i2)) {
                    if (y > x) {
                        overlapCount--;
                    }
                }
                if (overlapCount <= 1) {
                    break;
                }
            }
            if (overlapCount <= 1) {
                break;
            }
        }
        return overlapCount;
    }

    private static boolean isOverlapInterval(int[] I1, int[] I2) {
        return (((I1[0] <= I2[0]) && (I1[1] >= I2[1])) || ((I1[0] <= I2[0]) && (I1[1] <= I2[1]) && (I1[1] >= I2[0]))||(I2[0] <= I1[0]) && (I2[1] <= I1[1]) && (I2[1] >= I1[0])) ;
    }
}
