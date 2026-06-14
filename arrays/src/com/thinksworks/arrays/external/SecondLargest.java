package com.thinksworks.arrays.external;

public class SecondLargest {
    public static void main(String[] args) {
        int [] numbers={34,56,32,12,90};
        int largest= numbers[0];
        int secondLargest= numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>largest){
                secondLargest=largest;
                largest=numbers[i];
            }
            else if(numbers[i]> secondLargest && numbers[i]!= largest){
                secondLargest=numbers[i];
            }
        }
        System.out.println("Largest element:"+largest);
        System.out.println("Second largest element:"+secondLargest);
    }
}
