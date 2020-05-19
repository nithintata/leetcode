//  Online Stock Span

class StockSpanner {

    Stack<Integer> st, val;
    
    public StockSpanner() {
        st = new Stack<>();
        val = new Stack<>();
    }
    
    public int next(int price) {
        int x = 1;
        while (!st.isEmpty() && st.peek() <= price) {
            st.pop();
            x += val.pop();
        }
        
        st.push(price);
        val.push(x);
        return x;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
