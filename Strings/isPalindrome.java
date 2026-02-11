class isPalindrome {
    public static void main(String[] args) {
        String str = "malayalam";
        int low = 0;
        int high = str.length() - 1;
        boolean isPalindrome = false;
        
        while(low <= high){
            if(str.charAt(low) == str.charAt(high)){
                isPalindrome = true;
            }
            low++;
            high--;
        }
        if(isPalindrome){
           System.out.println("It is palindrome"); 
        }
        else{
            System.out.println("It is not a palindrome"); 
        }
    }
}