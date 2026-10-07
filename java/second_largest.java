import java.util.*;

// contraints
//0 < arr[i] < 10^6
//0 < i < 10 ^ 6

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};
        
        int smax = process4(arr);
        System.out.print(smax);
        
    }

    // Approach 1 o(n)
    private static int process1(int[] nums)
    {
        int large= Integer.MIN_VALUE;
        int sec= Integer.MIN_VALUE;

        for (int num : nums) {
            if (num >large) {
                sec= large;
                large= num;
            } else if (num > sec && num != large) {
                sec= num;
            }
        }
        return sec;
    }


    // Approach my style o(n + k) 
    private static int process4(int[] nums)
    {
        int max= 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int[] freq =new int[max + 1];
        for (int num : nums) {
            freq[num]++;
        }
    
        boolean found = false;
        for (int i= max;i >= 0;i--) {
    
            if (freq[i] > 0) {
    
                if (!found) {
                    found = true;
                } else {
                    return i;
                }
            }
        }
    
        return 0;
    }
    
    // Approach 2 o(n log(n))
    private static int process2(int[] nums)
    {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.add(num);

            if (pq.size() > 2) {
                pq.poll();
            }
        }

        return pq.peek();
    }
    
    // Approach 3 o(n log(n))
    private static int process3(int[] nums)
    {

        TreeSet<Integer> set = new TreeSet<>((a, b) -> b - a);;

        for (int num : nums) {
            set.add(num);
        }

        int ctr = 0;
        for(int num : set)
            {
                if(ctr == 0)
                {
                    ctr++;
                    continue;
                }
                return num;
            }
        return 0; 
    }
}