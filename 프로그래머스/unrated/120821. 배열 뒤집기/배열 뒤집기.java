import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
		
		for(int i = 0; i<num_list.length;i++) {
			answer[num_list.length-i-1] = num_list[i];
		}
		//System.out.println(Arrays.toString(answer));
		return answer;
    }
}