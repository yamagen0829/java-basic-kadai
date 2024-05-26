package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	public String getMyChoice () {
	//Scannerクラスのオブジェクトを生成する
       Scanner scanner = new Scanner(System.in);
       
     while (true) {
	   System.out.println("自分のじゃんけんの手を入力しましょう");
	   System.out.println("グーはrockのrを入力しましょう");
	   System.out.println("チョキはscissorsのsを入力しましょう");
	   System.out.println("パーはpaperのpを入力しましょう");

	   //入力した内容を取得
	   String input = scanner.next();
	 
	 //正しいじゃんけんの手であるか
	  if((input.equals("r")) || (input.equals("s")) || (input.equals("p"))) {
		//Scannerクラスのオブジェクトをクローズする
		   scanner.close();
		   return input;
	  } else {
		System.out.println("r（グー）かs（チョキ）かp（パー）を入力してください。");
	  }
	 }	
	}
	
	public String getRandom () {
	   //配列にじゃんけんの手をセットする
	   String[] opponent = {"r", "s", "p"};
	   
	   //対戦相手のじゃんけんの手を選ぶ
	   int opponentJyanken = (int) Math.floor(Math.random()* opponent.length);
		   return opponent[opponentJyanken];
	 }
	   
	public void playGame (String me,String you) {
	  HashMap<String,String> choice = new HashMap<String,String>();
	  
	   choice.put("r", "グー");
	   choice.put("s", "チョキ");
	   choice.put("p", "パー");
	   
	   System.out.println("自分の手は" + choice.get(me) + ",対戦相手は" + choice.get(you));
	   
	   //あいこ
	   if(me.equals(you)) {
		   System.err.println("あいこです");
	   }
	   
	   //自分が勝った場合
	   else if ((me.equals("r") && you.equals("s")) || (me.equals("s") && you.equals("p")) || (me.equals("p") && you.equals("r"))) {
		   System.out.println("自分の勝ちです");
	   }
	   
	   //自分が負けた場合
	   else {
		   System.out.println("自分の負けです");
	   }
 
	}	
}

