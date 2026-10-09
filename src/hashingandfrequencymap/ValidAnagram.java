package hashingandfrequencymap;

import java.util.Arrays;

public class ValidAnagram {
	
	public static void main(String[] args) {
		boolean ans1 = isAnagram("nat", "tan");
		System.out.println(ans1);
		boolean ans2 = isAnagram("mat", "bat");
		System.out.println(ans2);
		
		boolean ans3 = isAnagramWithoutSort("nat", "tan");
		System.out.println(ans3);
		boolean ans4 = isAnagramWithoutSort("mat", "bat");
		System.out.println(ans4);
	}
	
	public static boolean isAnagram(String s, String t) {
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        
        Arrays.sort(arrS);
        Arrays.sort(arrT);
        return Arrays.equals(arrS,arrT);
    }

	public static boolean isAnagramWithoutSort(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        if(sl != tl)
            return false;
        int[] count = new int[26];
        for(int i = 0; i < sl; i++){
            count[s.charAt(i) -'a'] += 1;
            count[t.charAt(i) -'a'] -= 1;
        }
        for(int check : count){
            if(check != 0)
                return false;
        }
        return true;      
    }


}
