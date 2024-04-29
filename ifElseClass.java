public class ifElseClass {
    public static void main(String[] args) {
        /* if statement */
        if (true) {
            System.out.println("True statement");

        }
        // The parenthesis take an boolean expression
        int num1 = 10, num2 = 20;
        if (num1 == num2) {
            System.out.println("Equal");
        } else {
            System.out.println("not equal");
        }
        /* Note that the else statement is always optional */

        /* If else if */
        if (num1 == num2) {
            System.out.println("equal");
        } else if (num1 < num2) {
            System.out.println("Greater");
        } else if (num1 != num2) {
            System.out.println("Not equal");
        } else if (num1 > 0) {
            System.out.println("positive");
        } else {
            System.out.println("Default statement");
            /* if else if */
            if (num1 == num2) {
                System.out.println("Equal");
            } else if (num1 < num2) {
                System.out.println("lesser");
            } else {
                System.out.println("greater");
            }
            /* When condition is matched it will skip all the remaining statement */
            /* Nested if else */
            if (num1 > 0) {
                if (num1 > num2) {
                    System.out.println("positive greater");
                } else {
                    System.out.println("positive lesser");
                }
            } else {
                if (num1 > num2) {
                    System.out.println("Negative greater");
                } else {
                    System.out.println("negative lesser");
                }
            }

        }
        /*
         * task
         * consider the following
         * calculate the total and average and save in variable accordingly
         * if average is less than 60.print "third division"
         * if any marking is less than 35,print "fail"
         * if any average is less than 70, print "second div"
         * if any average is less than 80,print "1st division"
         * if average is negative or over 100,print "invalid marking"
         */
        int math = 34, science = 70, english = 50;
        int average = (math + science + english) / 3;

        if (math < 35 || science < 35 || english < 35) {

            System.out.println("fail");
        } else if (average < 60) {
            System.out.println("3rd");
        } else if (average > 70) {
            System.out.println("2nd division");
        } else if (average > 80) {
            System.out.println("first division");
        } else if (average > 100) {
            System.out.println("invalid marking");
        }

    }
}