package kadai_014;

public class Car_Chapter14 {
        // フィールド
		private int gear = 1;
		private int speed = 10;
		
	// メソッド	
	public void gearChange (int afterGear) {
		 this.gear = afterGear;
		 // ギアの値によって速度を変える
	   switch(this.gear) {
	       case 1 -> this.speed = 10;
	       case 2 -> this.speed = 20;
	       case 3 -> this.speed = 30;
	       case 4 -> this.speed = 40;
	       case 5 -> this.speed = 50;
	    default   -> this.speed = 10;
		   }
		
	}
	// コンソールに表示
	public void run () {
		  System.out.println("ギア1から" + this.gear + "に切り替えました");
		  System.out.println("速度は時速" + this.speed + "です");
	}
	
}
