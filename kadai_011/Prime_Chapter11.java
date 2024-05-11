package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		
		boolean [] primeNumber  = new boolean[101];
		
		//配列をtrueで初期化
		for(int h = 1; h < primeNumber.length; h++) {
			primeNumber[h] = true;
		}
		
        //素数かどうかの判定
		for(int i = 2;i < primeNumber.length; i++) {
           for(int j = 2; j * j <= i; j++) {			
		     if ( i % j == 0 ) {
			    primeNumber [i] = false;
		        break;		   
		     }
		   }
		}
	    
		//素数の出力
		for (int k = 2; k < primeNumber.length; k++) {
			if (primeNumber[k]) {
				System.out.println(k);
			}
		}
	}
}
