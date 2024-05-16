package kadai_017;

abstract public class Kato_Chapter17 {
    //姓を表すフィールド
	public String familyName;
	//名を表すフィールド
	public String givenName;
	//住所を表すフィールド
	public String address;
	
	//setGivenNameフィールド
	abstract public void setGivenName();
	
    //出力メソッド
	public void commonIntroduce() {
		familyName = "加藤";
		address = "東京都中野区◯x";
		System.out.println("名前は" + familyName + "" + givenName + "です。" );
		System.out.println("住所は" + address);
	}
	
	abstract public void eachIntroduce();
	
	public void execIntroduce() {
		setGivenName();
		commonIntroduce();
		eachIntroduce();
		System.out.println();
	}
}
