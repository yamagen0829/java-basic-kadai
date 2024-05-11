package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		
		//年代とサービスを表す変数の宣言
		int userAge = 30; //年代
		String serviceCost = ""; //料金
		
		//年代別の料金
		serviceCost = switch(userAge) {
		   case 10 -> "10代の料金は1000円";
		   case 20 -> "20代の料金は2000円";
		   case 30,40 -> userAge +"代の料金は3000円";
		   case 50,60,70 -> userAge +"代の料金は4000円";
		   case 80 -> "80代の料金は5000円";
		   default -> "500円";
		};
		//30代の料金
		   System.out.println(serviceCost);
	}
}
