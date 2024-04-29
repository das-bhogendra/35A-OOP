public class PrefixPostfix {
    public static void main(String[] args) {
        /*prefix operator */
        int prefixValue = 10;
        System.out.println("Prefix value updates the value in this line"+ ++prefixValue);
        System.out.println("it remains the same in next line" + prefixValue);
        /* postfix operator */
        int postFixValue = 20;
        System.out.println("Postfix value updates the value in next line" + postFixValue++);
        System.out.println("the value change in this line"+ postFixValue);
    }
    
}
