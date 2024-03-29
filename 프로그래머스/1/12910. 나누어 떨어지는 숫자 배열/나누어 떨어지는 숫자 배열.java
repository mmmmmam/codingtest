import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<Integer>();
		
        for(int i = 0; i<arr.length; i++) {
        	if(arr[i] % divisor == 0) {
        		list.add(arr[i]);
        	}
        }
        
        if(list.size() == 0) {
        	list.add(-1);
        }
        
        int[] answer = new int[list.size()];
        
        	for(int j = 0; j<list.size(); j++) {
            	answer[j] = list.get(j);
            }

        Arrays.sort(answer);
        
        //System.out.println(Arrays.toString(answer));
        return answer;
    }
}