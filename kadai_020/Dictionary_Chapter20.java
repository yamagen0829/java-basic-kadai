package kadai_020;
import java.util.HashMap;
import java.util.Map;

public class Dictionary_Chapter20 {
    protected HashMap<String, String> dictionary = new HashMap<>();
   
    public Dictionary_Chapter20() {
	    dictionary.put("apple","りんご");
	    dictionary.put("peach","桃");
	    dictionary.put("banana","バナナ");
	    dictionary.put("lemon","レモン");
	    dictionary.put("pear","梨");
	    dictionary.put("kiwi","キウイ");
	    dictionary.put("strawberry","いちご");
	    dictionary.put("grape","ぶどう");
	    dictionary.put("muscat","マスカット");
	    dictionary.put("cherry","さくらんぼ");
    }  
    
    public void printAllEntries () {
	    for (Map.Entry<String, String> entry : dictionary.entrySet()) {
	        System.out.println(entry.getKey() + "の意味は" + entry.getValue());
    }
   }
}
