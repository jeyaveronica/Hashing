package hashmapdemo;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class dictionarydemo {	

			public static void main(String[] args) {
			Dictionary<String, Integer> dictionary = new Hashtable<>();

			// Adding elements to the dictionary
			dictionary.put("A", 1);
			dictionary.put("B", 2);
			dictionary.put("C", 3);

			// Getting values from the dictionary
			int valueA = dictionary.get("A");
			System.out.println("Value of A: " + valueA);

			// Removing elements from the dictionary
			dictionary.remove("B");

			// Enumerating the elements of the dictionary
			Enumeration<String> keys = dictionary.keys();
			//keys = dictionary.keys();
			while (keys.hasMoreElements()) {
				String key = keys.nextElement();
				System.out.println("Key: " + key + ", Value: " + dictionary.get(key));
			}
		}
	}

