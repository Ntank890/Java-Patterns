class patternc{
   public static void main(String[]args){
    int n=5;
    for(int i=1;i<=n;i++){
     for(int j=1;j<=n;j++){
       if(j%2!=0)
        System.out.print((char)(j+64));
        else
        System.out.print((char)(j+96));
      }
      System.out.println(" ");
    }
   }
 }