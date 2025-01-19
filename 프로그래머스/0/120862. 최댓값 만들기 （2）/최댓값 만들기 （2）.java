class Solution {
    public int solution(int[] numbers) {
        int answer = numbers[0]*numbers[1];
        
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                int max = numbers[i]*numbers[j];
                if(max > answer) answer = max; 
            }
        }

        /**
        numbers[0]*numbers[1] vs numbers[numbers.length-1] * numbers[numbers.length-2];

        int min_num = Integer.MIN_VALUE;
        System.out.println(min_num); // -2147483648(정수형의 최소값)
        **/
        
        return answer;
    }
}
