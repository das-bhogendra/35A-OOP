public class ForLoop {
    public static void main(String[] args) {
        for(int index = 0; index <4; index ++){
            System.out.println("Looping" + index);
        }
        
        /*Make the table of the following */
        for(int index = 10; index >=0; index--){
            System.out.println("Looping Decrement"+ index);
        /*Use loop to make multiplication table of 2 */
        /* Nested for loop
         * Loop inside loop */
        for(int outer = 0; outer < 2; outer ++){
            for(int inner = 2; inner >=0; inner--){
                System.out.println("Inner" + inner);
            }
            System.out.println("Ouuter" + outer);
        }
        /*Make a multiplication  table like the example 
         * 1x1 =1
         * 1x2 =2
         * ..
         * 1x10 = 10
         * Multiplication of 5
         * 5 x 1 =5
         * 5 x2 = 10
         * ..
         * 5 x 10 = 50
        */
        }
        for(int index = 1; index<6;index++){

            System.out.println("1*"+ index +"="+1*index);
        }

    }
    
}
