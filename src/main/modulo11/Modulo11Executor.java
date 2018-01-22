package main.modulo11;

/**
 * Main class to call Modulo 11 validator
 * Used for validating account number/SSN
 */
public class Modulo11Executor {

    /**
     * @param args
     * Main method to call Modulo 11 validation
     */
    public static void main(String[] args) {
        System.out.println("------------------------------------");
        System.out.println("Welcome to Modulo 11 Validator");
        System.out.println("------------------------------------");
        String numberToBeValidated = "12345678903";
        System.out.println("Number to be validated="+numberToBeValidated);
        boolean result = Modulo11Validator.validateModulo11(numberToBeValidated);
        if(result) {
            System.out.println(numberToBeValidated+" is a valid Modulo 11 number..");
        }else {
            System.out.println(numberToBeValidated + " is not a valid Modulo 11 number");
        }
    }
}
