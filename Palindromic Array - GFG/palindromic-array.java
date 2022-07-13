// { Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
        {
                  //add code here.
                  int cnt1=0;
              int cnt2=0;
                 for(int i=0;i<n;i++){
                  int checkpalin=   palin(a[i]);
                     if(checkpalin==1){ cnt1++; }
                     else{ cnt2++;
                     }
                 }
                 if(cnt2>0){
                     return 0;
                 }
                 else{
                 return 1;
                     
                 }
           }   
        public static int palin(int num){
              int remainder;
              int reverseNum=0;
              int original=num;
              while(num!=0){
                  remainder=num%10;
                  reverseNum=reverseNum*10+remainder;
                  num=num/10;
              }
              if(reverseNum==original){return 1;}
              return 0;
          }   
}