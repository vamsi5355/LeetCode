class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        for (i = 0; i < matrix.length; i++) {
            if (target <= matrix[i][matrix[i].length - 1]) break;
        }
        if (i == matrix.length) return false;

        int l = 0, r = matrix[i].length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (matrix[i][mid] == target) return true;
            else if (matrix[i][mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return false;
    }
}
