


public class Main {
   public static void main(String[] args) {
		print(8,0,1,0);
        System.out.println(1);
        System.out.println(0);
     }
	private static void print(int i, int j, int k,int s) {
		if(s==i-2)
			return;
		print(i,j+1,k+j ,s+1);	
        System.out.println(k+j);			
	}

}

