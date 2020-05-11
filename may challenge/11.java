// Flood Fill


class Solution {
    class Pair{
        int x;
        int y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    int[][] dist = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int m = image.length;
        int n = image[0].length;
        boolean[][] vis = new boolean[m][n];
        
        Queue<Pair> qu = new LinkedList<>();
        int color = image[sr][sc];
        qu.add(new Pair(sr, sc));
        image[sr][sc] = newColor;
        
        Pair p = null;
        int i = -1;
        int j = -1;
        while (!qu.isEmpty()) {
            p = qu.poll();
            if (vis[p.x][p.y])
                continue;
            vis[p.x][p.y] = true;
            
            for (int k = 0; k < 4; k++) {
                 i = p.x + dist[k][0];
                 j = p.y + dist[k][1];
                if (isValid(i, j, image) && !vis[i][j] && image[i][j] == color) {
                    image[i][j] = newColor;
                    qu.add(new Pair(i, j));
                }
            }
        }
        
        return image;
    }
    
    private boolean isValid(int i, int j, int[][] image) {
        if (i >= image.length || j >= image[0].length)
            return false;
        return i < 0 || j < 0 ? false : true;
    }
}
