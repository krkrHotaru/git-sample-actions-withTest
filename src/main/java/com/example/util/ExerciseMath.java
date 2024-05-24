package com.example.util;

public class ExerciseMath {
    public static int factional(int num){
        if (num <=0){
            throw new IllegalArgumentException("「渡された値が正しくありません」");
        }
        for (int i = num; i-1 > 0 ; i--) {
            num = num*(i-1);
        }
        return num;
    }

    public int factorial(int i) {
        return 1;
    }
}
