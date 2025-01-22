public class LTC001{
        public boolean isPalindrome(int x) {
            Integer num = x;
            String strNum = num.toString();
            String rev = "";
    
    
            for(int i = strNum.length()-1; i>-1; i--){
                rev += strNum.substring(i,i+1);
            }
    
            if(rev.equals(strNum)){
                return true;
            }
            return false;
        }
    public static void main(String[] args){
        LTC001 solution = new LTC001();

        // Test cases
        System.out.println("Is 121 a palindrome? " + solution.isPalindrome(121)); // true
        System.out.println("Is -121 a palindrome? " + solution.isPalindrome(-121)); // false
        System.out.println("Is 10 a palindrome? " + solution.isPalindrome(10)); // false
    }
}

    
