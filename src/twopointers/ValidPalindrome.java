package twopointers;

public class ValidPalindrome {

	public static void main(String[] args) {
			
		boolean ansWithStringBuilder = isPalindromeUsingStringBuilder("A man, a plan, a canal: Panama");
		System.out.println("ansWithStringBuilder :: "+ansWithStringBuilder);
		
		boolean ansWithLessCode =isPalindromeUsingLessCode("A man, a plan, a canal: Panama");
		System.out.println("ansWithLessCode :: "+ansWithLessCode);
		
		boolean ans = isPalindrome("A man, a plan, a canal: Panama");
		System.out.println("A man, a plan, a canal: Panama :: "+ans);
		
		boolean ans1 = isPalindrome("race a car");
		System.out.println("race a car :: "+ ans1);
	}
	
    public static boolean isPalindromeUsingStringBuilder(String s) {
         s =s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
         System.out.println(s);
         return new StringBuilder(s).reverse().toString().equals(s);   
     }
    
    
    public static boolean isPalindromeUsingLessCode(String s) {
    	s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
    	
    	int first = 0;
    	int last = s.length()-1;

       	
    	while (first <= last) {
    		if(s.charAt(first) !=s.charAt(last))
    			return false;
    	        first++;
    	        last--;
		}
		return true;
    	
    }
    
    
    public static boolean isValidCharacter(char ch){
        return ((ch>='0' && ch<='9') || (ch>='A' && ch<='Z') ||(ch>='a' && ch<='z'));
    }
    public static boolean isPalindrome(String s) {
        int n=s.length();
        int i=0;
        int j=n-1;
        while(i<j){
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);

            if(!isValidCharacter(ch1)){
                i++;
                continue;
            }
            if(!isValidCharacter(ch2)){
                j--;
                continue;
            }

            if(Character.toLowerCase(ch1) !=Character.toLowerCase(ch2)){
                return false;
            }
            
            i++;
            j--;
        }
        return true;
    }
    
    
}
