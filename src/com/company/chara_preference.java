package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class chara_preference /*嗜好100個*/
{
    public static void main(String[] args)
    {
        List<String> preference = new ArrayList<>();

        preference.add("01.ロリコン");
        preference.add("02.マザコン");
        preference.add("03.ファザコン");
        preference.add("04.シスコン");
        preference.add("05.ブラコン");
        preference.add("06.異性が苦手");
        preference.add("07.同性が苦手");
        preference.add("08.同性が好き");
        preference.add("09.同年代が苦手");
        preference.add("10.年上が苦手");
        preference.add("11.年下が苦手");
        preference.add("12.酒好き");
        preference.add("13.酒に弱い");
        preference.add("14.酒癖が悪い");
        preference.add("15.笑い上戸");
        preference.add("16.泣き上戸");
        preference.add("17.小食");
        preference.add("18.大食い");
        preference.add("19.菜食主義者");
        preference.add("20.肉食主義者");
        preference.add("21.高所恐怖症");
        preference.add("22.先端恐怖症");
        preference.add("23.流血恐怖症");
        preference.add("24.暗所恐怖症");
        preference.add("25.閉所恐怖症");
        preference.add("26.怪談恐怖症");
        preference.add("27.鏡恐怖症");
        preference.add("28.海恐怖症");
        preference.add("29.潔癖症");
        preference.add("30.動物好き");
        preference.add("31.植物好き");
        preference.add("32.昆虫嫌い");
        preference.add("33.哺乳類嫌い");
        preference.add("34.爬虫類嫌い");
        preference.add("35.魚類嫌い");
        preference.add("36.鳥類嫌い");
        preference.add("37.早寝早起き");
        preference.add("38.遅寝遅起き");
        preference.add("39.寝相が悪い");
        preference.add("40.昼夜逆転");
        preference.add("41.夢遊病");
        preference.add("42.病弱");
        preference.add("43.女装（男装）");
        preference.add("44.変装趣味");
        preference.add("45.演技上手");
        preference.add("46.演技下手");
        preference.add("47.足が悪い");
        preference.add("48.目が悪い");
        preference.add("49.耳が遠い");
        preference.add("50.味覚音痴");
        preference.add("51.嗅覚障害");
        preference.add("52.方向音痴");
        preference.add("53.かなづち");
        preference.add("54.絵が下手");
        preference.add("55.字が汚い");
        preference.add("56.音痴");
        preference.add("57.訛りがひどい");
        preference.add("58.忘れっぽい");
        preference.add("59.数字に弱い");
        preference.add("60.誤読が多い");
        preference.add("61.世話焼き");
        preference.add("62.人付き合いが苦手");
        preference.add("63.うわさ好き");
        preference.add("64.話を聞かない");
        preference.add("65.収集癖");
        preference.add("66.手紙好き");
        preference.add("67.料理好き");
        preference.add("68.書物好き");
        preference.add("69.骨董好き");
        preference.add("70.芸術好き");
        preference.add("71.宝石好き");
        preference.add("72.刃物好き");
        preference.add("73.手芸好き");
        preference.add("74.細工好き");
        preference.add("75.機械好き");
        preference.add("76.手品好き");
        preference.add("77.魔法好き");
        preference.add("78.歌唱好き");
        preference.add("79.演奏好き");
        preference.add("80.舞踏好き");
        preference.add("81.祝祭好き");
        preference.add("82.下着好き");
        preference.add("83.肉体美が好き");
        preference.add("84.淫乱");
        preference.add("85.禁欲的");
        preference.add("86.サディスト");
        preference.add("87.マゾヒスト");
        preference.add("88.特殊性癖");
        preference.add("89.少女趣味");
        preference.add("90.オカルト趣味");
        preference.add("91.霊感・霊話");
        preference.add("92.狂気を纏う");
        preference.add("93.昼と夜で別人格");
        preference.add("94.ナルシスト");
        preference.add("95.センスが壊滅的");
        preference.add("96.インドア派");
        preference.add("97.アウトドア派");
        preference.add("98.冒険家");
        preference.add("99.かつての冒険家");
        preference.add("100.膝に矢を受けたことがある");


        // 拡張for文
//        for(String s : fantasyCharas)
//        {
//            System.out.println(s);
//        }

        // forEachメソッド
//        fantasyCharas.forEach(System.out::println);

        // 2.4。繰り返しのないランダムなアイテムを選択する
//        for (int i = 0; i < 5/*Main.dice_rolls*/; i++) {
//            int randomIndex = Random.nextInt(fantasyCharas.size());
//            String randomElement = fantasyCharas.get(randomIndex);
//            fantasyCharas.remove(randomIndex);
//
//            System.out.println(randomElement);
//        }

        // 100サイコロ
//        System.out.println("何回サイコロを振りますか？");
//        // サイコロを振る回数を代入する
//        int dice_rolls = new java.util.Scanner(System.in).nextInt();
//        int this_time = 0; // 合計を表すための変数の宣言
//
//        // サイコロを降った回数足し算を行う
//        for (int i = 1; i <= dice_rolls; i++)
//        {
//            this_time = (int)(Math.random() * 100) + 1; // サイコロを振る
//            System.out.println(i + "回目：" + this_time + );
//        }

        // そのまま抽出
        List<String> result = new ArrayList<>(); // ランダムに選択された要素を持たせるリスト

        List<String> remaining = new ArrayList<>(preference); // 残っている要素のリスト
        Random random = new Random(); // 乱数生成器

        System.out.println("何回サイコロを振りますか？");
        int dice_rolls = new Scanner(System.in).nextInt(); // 回数入力

        for (int i = 0; i < dice_rolls; i++)
        { // 入力分回繰り返す。
            int remainingCount = remaining.size(); // 残っている要素の数
            int index = random.nextInt(remainingCount); // ランダムに選択されたインデックス

            String element = remaining.get(index); // ランダムに選択された要素
            result.add(element); // ランダムに選択された要素を持たせるリストの末尾に、ランダムに選択された要素を追加する。

            int lastIndex = remainingCount - 1; // 残っている要素のリストの末尾のインデックス
            String lastElement = remaining.remove(lastIndex); // 残っている要素のリストから末尾を削除する。

            if (index < lastIndex)
            { // ランダムに選択された要素が末尾以外なら…
                remaining.set(index, lastElement); // それを末尾の要素で置換する。
            }
        }


        System.out.println(result); // 出力例 > [D, A]


    }
}
