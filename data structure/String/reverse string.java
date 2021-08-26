 public String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }


//***********//
 public String reverseString(String s) {
        char[] a=s.toCharArray();
        int n=s.length();
        for(int i=0;i<(n/2);i++){
            char temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
        }
        s=new String(a);
        return s;
    }
//**********//
