package Week1;

public class OperatorClass {
    public static void main(String[] args) {
        /*Arithemetic Operator */
        int num1 = 10, num2 = 20;
        int sum = num1 + num2;
        System.out.println("num1 + num2 is "+ sum);
        System.out.println("num1 - num2 is "+ (num1 - num2));
        System.out.println("num1*num2 is "+ (num1*num2));
        System.out.println("num1/num2 is "+ (num1/num2));
        System.out.println("num1 modulo num2 is "+ (num1%num2));

        /* Assignment Operator */
        int aNum1;
        aNum1 = 200; //here "=" is assignment to assign value
        System.out.println(aNum1);
        System.out.println("aNum += can be "+ (aNum1+=2 ));
        /*aNum1+=2; is equivalnet to aNum1 = aNum1 + 2; */
        System.out.println("aNum -= can be " + (aNum1-=10));
        System.out.println("aNum = can be " + (aNum1=3));
        System.out.println("aNum /= can be " + (aNum1/=3));
        System.out.println("aNum %= can be " + (aNum1%=2));

        /*Relation Operator */
        int rNum1 = 20, rNum2 = 21;
        boolean rExpression = rNum1 == rNum2;
        System.out.println("Is rNum equals to rNum2 " + rExpression);
        System.out.println("Is rNum greater to rNum2 " + (rNum1 > rNum2));
        System.out.println("Is rNum lesser or equals to rNum2 " + (rNum1 <= rNum2));
        System.out.println("Is rNum not equal to rNum2 " + (rNum1 != rNum2));

        /*Logical Operator */
        boolean rOperator1 = false, rOperator2 = true;
        System.out.println("rOperator1 && rOperator2 " + (rOperator1 && rOperator2));
        System.out.println("rOperator1 || rOperator2 " + (rOperator1 || rOperator2));
        System.out.println("Not using ! " + (!rOperator1));

        /*Unary Operator */
        int uNum1 = 10;
        uNum1++; //equivalent to uNum1 = uNum +1 and changes calue from next line;
        ++uNum1; // equivalent to uNum1 = uNum1 + 1 and changes value in this line;
        System.out.println("Unary for ++ "+ uNum1);
        System.out.println("Unary for operand -- " + uNum1--);
        System.out.println("Unary for --operator " + --uNum1);

        /*Ternary Operator 
         * For Example
         * String Output;
         * int a = 10;
         * int b = 20;
         * if (a > b){
         *  output = "True Statement"}
         * else{
         *  output = "False Statement"
         * }; 
         * We can use ternary for this
        */
            int a = 10, b = 20;
            String output = a > b ? "True Statement" : "False Statement";
        /* Here ternary takes expression ? true statement : false statement
        *  if the expression is true it takes the statement after the "?""
        *  if the express is false it takes the statement after the ":"" 
        */
        int outputNumb = a < b ? 100 : 200;
        System.out.println(output);
        System.out.println(outputNumb);
        /*Write a program to print weather a variable is greater or equal to 18 */
        int tnum1 = 5, tnum2 =18;
        System.out.println("Is num1 is greater than num2"+(tnum1>=tnum2) );
        /*Write a program to print simple interest from variable */
        double amount = 2000, time = 2, rate = 2;
        double si = amount * time * rate / 100;
        System.out.println("si = amount * time * rate/100" + si);
        /*write a program to print the area and perimeter of rectangle */
        int length = 5, breadth =2;
        int area = length*breadth;
        int perimeter = 2 * (length+breadth);
        System.out.println("area of rectangle is" + area);
        System.out.println("preimeter of rectangle is" + perimeter);

    }
}