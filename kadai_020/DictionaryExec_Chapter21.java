package kadai_020;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		//インスタンス化
		Dictionary_Chapter20 myDictionary = new Dictionary_Chapter20();
		 
		//配列
		 String[] searchArray = { "apple", "banana", "grape", "orange"};
		 
		// あるかないかの判定　
		for (String word : searchArray) {
			if ( myDictionary.dictionary.containsKey(word)) {
				System.out.println( word + "の意味は" + myDictionary.dictionary.get(word));
			} else {
				System.out.println( word + "は辞書に存在しません");
			}
		}
	}

}
