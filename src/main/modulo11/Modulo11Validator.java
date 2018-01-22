package main.modulo11;

import org.apache.commons.lang3.StringUtils;

/**
 * Class which implements Modulo11 Algorithm
 */
public class Modulo11Validator {

    private Modulo11Validator(){
        // Private Constructor so that class cannot be initialized
    }

    /**
     * @param numberToBeValidated
     * @return true | false - true means valid Modulo 11 number,false means not a valid Modulo 11 number
     * Method to implement Modulo 11 Algorithm and validate number
     */
    public static boolean validateModulo11(String numberToBeValidated) {
        // Null check for the number to be validated
        if (StringUtils.isEmpty(numberToBeValidated)) {
            return false;
        }
        // Remove whitespaces from the input(if any)
        numberToBeValidated = numberToBeValidated.trim();
        // Remove the delimiters from the number(if any)
        numberToBeValidated = numberToBeValidated.replace(Modulo11Constants.INPUT_DELIMITER, "");

        // input must be 11 character long and only contains numbers
        if (numberToBeValidated.length() != Modulo11Constants.INPUT_MAX_LENGTH || !StringUtils.isNumeric(numberToBeValidated)) {
            return false;
        }
        // Fetch input control digit, the last digit of the input is control number
        int inputControlDigit = Character.getNumericValue(numberToBeValidated.charAt(numberToBeValidated.length() - 1));
        return calculateControlDigit(numberToBeValidated) == inputControlDigit;
    }

    /**
     * @param numberToBeValidated
     * @return calculatedControlDigit
     * This method calculates control digit
     * Total Sum is calculated by multiplying the number in each position of the input with its weight
     * Total Sum is divided by 11 to determine the remainder
     */
    private static int calculateControlDigit(String numberToBeValidated) {
        int totalSum = 0;
        for (int index = 0; index < numberToBeValidated.length() - 1; index++) {
            totalSum += Character.getNumericValue(numberToBeValidated.charAt(index)) * getWeightNumber(index);
        }
        int remainder = totalSum % Modulo11Constants.INPUT_MAX_LENGTH;
        return handleRemainder(remainder);
    }

    /**
     * @param remainder - reminder of total sum and 11
     * @return contolDigit
     * If remainder is 0, then return 0 as control digit.
     * Else, return 11 - remainder as control digit
     */
    private static int handleRemainder(int remainder) {
        switch (remainder) {
            case 0:
                return 0;
            default:
                return Modulo11Constants.INPUT_MAX_LENGTH - remainder;
        }
    }

    /**
     * @param index - index value
     * @return weight based on index
     */
    private static int getWeightNumber(int index) {
        return Modulo11Constants.MAX_WEIGHT - (index + 2) % Modulo11Constants.WEIGHT_DIVISION;
    }
}
