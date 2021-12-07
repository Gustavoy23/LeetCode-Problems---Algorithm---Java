class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        
        int n = plants.length;
        int arr[] = new int[n];
        
        int sum = 0;
        for(int i: plants) sum+=i;
        
        int steps = 0;
        int res = 0;
        int current = 0;
        
        while(current < sum){
           
             int bucket = capacity;
             steps = 0;
             while(current < sum && bucket > 0) {
               int dif = plants[steps]-arr[steps];
               if(dif == 0) {
                    steps++;
               } else if(dif > bucket){
                     steps=steps*2;
                     break; 
                } else{
                   arr[steps]+=dif;
                   current+=dif;
                   bucket-=dif;
                   if(bucket==0 && steps!=n-1) {
                       steps++;
                       steps=steps*2;
                   }else steps++;
               }
          }
             res+=steps;
         
        }
      //  System.out.println();
        return res;
    }
}