package Week1;

public class Variable {
    /*Instance variable need object to accessed
     * Value is not shared
     */
    int instanceVariable = 10;
    /*Static variable doesnot need object to access
     * Value is shared among objects
     */
    static int staticVariable = 100;
    public static void main(String[] args) {
        /*Primitive Data Type
         * Already defined in Programming Language(java)
         */
        byte byteValue = 100;
        /*
         * the following cannot be done again
         * byte byteValue = 100;
         */
        byteValue = 100;
        short shortValue = 200;
        int intValue = -199;
        long longValue = 10000;
        float floatValue = 2.15f;
        double doublevalue = -90.223;
        char charvalue = 'l';
        boolean booleanvalue = false;
        /*Non Primitive Data Type
         * Not defined by programming language except(string)
         * Combination of primitive data type
         */
        String stringValue = "This is a string value";
        int[] intArray = new int[5];
        Variable variableObject = new Variable();
        /*Use instance variable with Variable object */
        System.out.println(variableObject.instanceVariable);
        /*Use static variable with Class itself */
        System.out.println(Variable.staticVariable);
        byte defaultByteValue;
        /*Implicit casting, smaller data type to larger */
        int newIntvalue = 10;
        double convertedInt = newIntvalue;
        /*Explicit casting larger data type to smaller */
        double newDoubleValue = 290.99;
        int convertedDoubleValue = (int) newDoubleValue;
        /* Continue all and find the default value of all the
         * primitive datatype
         */
    }
    
}
