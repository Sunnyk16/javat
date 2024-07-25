public class arrayy {

    public static void multidarray() {
        int nums[][] = new int[3][4];
        int random = 0;

        // (int)Math.random()*100

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 10);
                // System.out.println(nums[i][j] + "");
            }
            // System.out.println("");

        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + "");
            }
            System.out.println("");

        }

        for( int []n :nums){
            for( int m : n){
                System.out.print(m + "");
            }
            System.out.println("");
        }

    }

    

    public static void main(String[] args) {

        // int nums[] = {1,2,3,4};
        // System.out.println(nums[0]);

        // int nums[] =new int[4];
        // nums[0]=9;
        // nums[1]=8;
        // nums[2]=7;
        // nums[3]=6;

        // // System.out.println(nums[1]);

        // for(int i=0; i<4;i++){
        // System.out.println(nums[i]);
        // }
        multidarray();

    }

}
