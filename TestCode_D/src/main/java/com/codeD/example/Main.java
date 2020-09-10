package com.codeD.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(Array(new Integer[] { 0, 2, 4, -1, -3, -4 }));

    }

    public static Integer Array(Integer[] arr){
        int temp = 0;
        boolean repeat = true;
        while(repeat){
            for (Integer i = 1; i <= arr.length; i++){
                if (temp == arr[i-1]){
                    break;
                } else if (i == arr.length ){
                    if (temp != 0) {
                        return temp;
                    }
                }
            }
            temp--;
        }
        return temp;
    }
}
