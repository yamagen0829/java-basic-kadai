package kadai_017;

public class KatoExec_Chapter17 {

	public static void main(String[] args) {
		//各子クラスのインスタンスを作成
		 Kato_Chapter17 Taro = new KatoTaro_Chapter17(); 
		 Kato_Chapter17 Ichiro = new KatoIchiro_Chapter17(); 
		 Kato_Chapter17 Hanako = new KatoHanako_Chapter17(); 
		
         Taro.execIntroduce();
         Ichiro.execIntroduce();
         Hanako.execIntroduce();
	}

}
