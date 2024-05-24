package com.example.util;

public class ExerciseMath {
    public static int factional(int num){
        if (num <=0){
            throw new IllegalArgumentException("「渡された値が正しくありません」");
        }
        if (num >= 13){
            throw new IllegalArgumentException("規格を超える桁数の入力が行われました");
        }
        for (int i = num; i-1 > 0 ; i--) {
            num = num*(i-1);
        }
        return num;
    }

}
