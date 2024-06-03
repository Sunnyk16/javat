// package pattern-advanced;

public class hollowrec {
    public static void hollowrecr( int row ,int colu){
        for( int i =1;i<=row ;i++) {
            for(int j=1;j<=colu; j++) {
                if(i==1 || i==row || j==1 || j==colu){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        hollowrecr(4, 5);
          
    }
    
}
