package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class chara_personality /*性格100個*/
{
    public static void main(String[] args)
    {
        List<String> personality = new ArrayList<>();

        personality.add("01.積極的");
        personality.add("02.消極的");
        personality.add("03.神経質");
        personality.add("04.無神経");
        personality.add("05.感情的");
        personality.add("06.沈着冷静");
        personality.add("07.外向的");
        personality.add("08.内向的");
        personality.add("09.目立ちたがり");
        personality.add("10.控え目・謙虚");
        personality.add("11.強欲");
        personality.add("12.無欲");
        personality.add("13.勇敢");
        personality.add("14.臆病");
        personality.add("15.高飛車");
        personality.add("16.低姿勢");
        personality.add("17.正直者");
        personality.add("18.嘘つき");
        personality.add("19.保守的");
        personality.add("20.革新的");
        personality.add("21.正義");
        personality.add("22.卑劣");
        personality.add("23.勤勉");
        personality.add("24.怠け癖");
        personality.add("25.博識");
        personality.add("26.無知");
        personality.add("27.忍耐強い");
        personality.add("28.意志薄弱");
        personality.add("29.頑固");
        personality.add("30.柔軟");
        personality.add("31.楽観的");
        personality.add("32.悲観的");
        personality.add("33.気長");
        personality.add("34.短気");
        personality.add("35.性善説");
        personality.add("36.性悪説");
        personality.add("37.慈悲深い");
        personality.add("38.利己的");
        personality.add("39.計画的");
        personality.add("40.無計画");
        personality.add("41.慎重");
        personality.add("42.無鉄砲");
        personality.add("43.高貴・教養");
        personality.add("44.野蛮・無教養");
        personality.add("45.自意識過剰");
        personality.add("46.自信喪失");
        personality.add("47.多弁");
        personality.add("48.無口");
        personality.add("49.威圧的");
        personality.add("50.腰が低い");
        personality.add("51.用心深い");
        personality.add("52.お人好し");
        personality.add("53.指導者");
        personality.add("54.追従者");
        personality.add("55.権威的");
        personality.add("56.反権力");
        personality.add("57.博愛");
        personality.add("58.人間不信");
        personality.add("59.口が軽い");
        personality.add("60.口が固い");
        personality.add("61.強引");
        personality.add("62.弱気");
        personality.add("63.堅物");
        personality.add("64.ひょうきん");
        personality.add("65.単純");
        personality.add("66.気分屋");
        personality.add("67.好奇心旺盛");
        personality.add("68.触らぬ神に祟り無し");
        personality.add("69.気が弱い");
        personality.add("70.気が強い");
        personality.add("71.派手好き");
        personality.add("72.地味好き");
        personality.add("73.雄々しい");
        personality.add("74.女々しい");
        personality.add("75.狂信的");
        personality.add("76.信仰心篤い");
        personality.add("77.迷信深い");
        personality.add("78.不信的");
        personality.add("79.不可知論者");
        personality.add("80.無神論者");
        personality.add("81.責任感強い");
        personality.add("82.無責任");
        personality.add("83.人望がある");
        personality.add("84.人望がない");
        personality.add("85.拝金主義");
        personality.add("86.金銭無頓着");
        personality.add("87.浮気性");
        personality.add("88.一途な想い");
        personality.add("89.仕事人");
        personality.add("90.趣味人");
        personality.add("91.好戦的");
        personality.add("92.平和主義者");
        personality.add("93.理性的");
        personality.add("94.直感的");
        personality.add("95.家庭的");
        personality.add("96.自分勝手");
        personality.add("97.照れ屋");
        personality.add("98.内気");
        personality.add("99.ロマンチスト");
        personality.add("100.リアリスト");


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

        List<String> remaining = new ArrayList<>(personality); // 残っている要素のリスト
        Random random = new Random(); // 乱数生成器

        System.out.println("何回サイコロを振りますか？");
        int dice_rolls = new java.util.Scanner(System.in).nextInt(); // 回数入力

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
