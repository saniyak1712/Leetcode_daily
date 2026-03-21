class Solution {
public:
    vector<vector<int>> reverseSubmatrix(vector<vector<int>>& grid, int x, int y, int k) {
        int startRow  = x;
        int endRow = x+k-1;

        int startColumn = y;
        int endColumn = y+k-1;

        for(int i = startRow; i<= endRow; i++){
            for(int j = startColumn; j<= endColumn; j++){
                swap(grid[i][j],grid[endRow][j]);
            }
            endRow--;
        }
        return grid;



        
    }
};
