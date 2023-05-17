package Programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(500, "Atul");
		mp.put(501, "sai");
		mp.put(502, "swe");
		mp.put(503, "kumbu");
		mp.put(501, "zam");
		System.out.println(mp);
		mp.remove(503);
		System.out.println(mp);
		mp.replace(502, "kiru");
		System.out.println(mp);
		mp.replaceAll((K, v) -> "baby");
		System.out.println(mp);
	}

}
