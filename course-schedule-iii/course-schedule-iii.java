class Solution {
    public int scheduleCourse(int[][] courses) {
        
        Arrays.sort(courses, (a,b) -> a[1]==b[1] ? a[0] - b[0] : a[1] - b[1]);
        
        
        System.out.println(" " + Arrays.deepToString(courses));
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b - a);
        
        int time = 0;
        for(int[] course: courses) {
            if(course[0]+time <= course[1]){
                time+=course[0];
                pq.add(course[0]);
            } else {
                if(pq.size() > 0 && course[0] < pq.peek()){
                    time-= pq.poll();
                    time+=course[0];
                    pq.add(course[0]);
                } else {
                    
                }
                    
            }
        }
    return pq.size();
        
    }
}