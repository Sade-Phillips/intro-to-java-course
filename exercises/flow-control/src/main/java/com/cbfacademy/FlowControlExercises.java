package com.cbfacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.IntPredicate;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        List<String> fizzBuzz = new ArrayList<>();
        for (Integer num : numbers) {
            if (num % 3 == 0 && num % 5 == 0) {
                fizzBuzz.add("FizzBuzz");
            } else if (num % 3 == 0) {
                fizzBuzz.add("Fizz");
            } else if (num % 5 == 0) {
                fizzBuzz.add("Buzz");
            } else {
                fizzBuzz.add(String.valueOf(num));
            }
        }
        return fizzBuzz;
    }
    
    public String whichMonth(Integer number) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
         // - Implement this method such that
         if (number >= 1 && number <= 12) {
            return months[number - 1];
        } else {
            return "Invalid month number";
        }
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"
       
    }
    public Map<String, Integer> sumOfOddsAndSumOfEvens() { 
        // The list sumOfOddsAndSumOfEvens is not used in the calculation, so it can be removed.
        int sumOfEven = 0;
        int sumOfOdd = 0;
        for (int i = 1; i <= 100; i++) { // Change the condition to i <= 100 to include 100
            if (i % 2 == 0) {
                sumOfEven += i;
            } else {
                sumOfOdd += i;
            }
        }
        Map<String, Integer> map = new HashMap<>();
        map.put("SumOfEvens", sumOfEven); // Sum of even numbers
        map.put("SumOfOdds", sumOfOdd);   // Sum of odd numbers
        return map; 
    }
    
    public List<Integer> reverse(ArrayList<Integer> numbers) {
        
        Collections.reverse(numbers);
        
        return numbers;
        
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
    }

    public String getName() {
        return "Flow Control Exercises";
    }

}