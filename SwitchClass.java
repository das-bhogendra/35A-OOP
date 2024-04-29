public class SwitchClass {
    public static void main(String[] args) {
        char charValue = 'b';
        int intValue = 10;
        switch(charValue){
            case'a':
                System.out.println("apple");
                break;
            case 'b':
            switch(intValue){
                case 10:
                    System.out.println("Ten");
                    break;
                case 20:
                    System.out.println("twenty");
                    break;
            }
                System.out.println("ball");
                break;
            case 'c':
                System.out.println("cat");
                break;
            case 'd':
                System.out.println("Dog");
                break;
            default:
                System.out.println("No word found");
                break;

        }
        /*task
         * switch case
         * 0-sunday
         * 1-monday
         * 2-tuesday
         * 3-wednesday
         * 4-thrusday
         * 5-friday
         * 6-saturday
         * any other - invalid day
         */
    
        int intValue2 = 2;
        switch( intValue2){
            case 0:
                System.out.println("sunday");
                break;
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thrusday");
                break;
            default:
                System.out.println("invalid day is found");
                break;
        }
    }
    
}
