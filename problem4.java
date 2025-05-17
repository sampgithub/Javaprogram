package tendemloop;

import java.util.HashMap;
import java.util.Map;

public class problem4 {
	    public static Map<Integer, Integer> countMultiples(int[] numbers) {
	        Map<Integer, Integer> result = new HashMap<>();

	        for (int i = 1; i <= 9; i++) {
	            int count = 0;
	            for (int num : numbers) {
	                if (num % i == 0) {
	                    count++;
	                }
	            }
	            result.put(i, count);
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

	        Map<Integer, Integer> output = countMultiples(input);

	        System.out.println(output);
	    }
	}
