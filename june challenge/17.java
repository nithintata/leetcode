//   Surrounded Regions

class Solution {
    
    class Pair {
        int x;
        int y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    
    public void solve(char[][] board) {
        Queue<Pair> qu = new LinkedList<Pair>();
        int m = board.length;
        if (m == 0)
            return;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O')
                qu.add(new Pair(i, 0));
            if (board[i][n-1] == 'O')
                qu.add(new Pair(i, n - 1));
        }
        
        for (int i = 0; i < n; i++) {
            if (board[0][i] == 'O')
                qu.add(new Pair(0, i));
            if (board[m-1][i] == 'O')
                qu.add(new Pair(m - 1, i));
        }
        
        while (!qu.isEmpty()) {
            Pair p = qu.poll();
            board[p.x][p.y] = '-'; //marking as visited
            
            for (int k = 0; k < 4; k++) {
                int i = p.x + dir[k][0];
                int j = p.y + dir[k][1];
                if (isValid(i, j, board) && board[i][j] == 'O')
                    qu.add(new Pair(i, j));
            }
        }
        
        //Now change all the remaining zeros to X 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O')
                    board[i][j] = 'X';
                if (board[i][j] == '-')
                    board[i][j] = 'O';
            }
        }
    
        
    }
       
    private boolean isValid(int i, int j, char[][] board) {
        if (i >= board.length || j >= board[0].length)
            return false;
        return i < 0 || j < 0 ? false : true;
    }
}
