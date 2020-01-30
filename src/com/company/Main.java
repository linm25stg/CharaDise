package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("何回サイコロを振りますか？");
        // サイコロを振る回数を代入する
        int dice_rolls = new java.util.Scanner(System.in).nextInt();
        int this_time = 0; // 合計を表すための変数の宣言

        // サイコロを降った回数足し算を行う
        for (int i = 1; i <= dice_rolls; i++)
        {
            this_time = (int)(Math.random() * 100) + 1; // サイコロを振る
            System.out.print(i + "回目：" + this_time + " ,");
        }
    }

}
