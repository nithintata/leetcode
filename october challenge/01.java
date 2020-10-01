/* Number of Recent Calls
You have a RecentCounter class which counts the number of recent requests within a certain time frame.

Implement the RecentCounter class:

RecentCounter() Initializes the counter with zero recent requests.
int ping(int t) Adds a new request at time t, where t represents some time in milliseconds, and returns the number of requests that has happened in the past 3000 milliseconds (including the new request). Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].
It is guaranteed that every call to ping uses a strictly larger value of t than the previous call. */

class RecentCounter {
    
    Queue<Integer> request_queue;
    int TIME = 3000;

    public RecentCounter() {
        request_queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        request_queue.add(t);
        int start_time = t - TIME;
        //remove all the previous requests which are not in given range
        while (!request_queue.isEmpty()) {
            if (request_queue.peek() >= start_time)
                break;
            request_queue.poll();
        }
        
        return request_queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
