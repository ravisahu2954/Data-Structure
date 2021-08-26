Is String palindrome
//***************//

int isPlaindrome(String S) {
        
       int j = 0 , l = S.length()-1;
       while(j<l)
       {
           if(S.charAt(j++) != S.charAt(l--))
             return 0;
       }
       return 1; 
}

//************//

