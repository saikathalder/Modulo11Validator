package main.modulo11;


import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for Modulo11Validatot
 */
public class Modulo11ValidatorTest {

    /**
     * Test method for validateModulo11
     * Scenario : Success case
     */
    @Test
    public void validateModulo11() {
        Assert.assertTrue(Modulo11Validator.validateModulo11("12345678903"));
    }

    /**
     * Test method for validateModulo11
     * Scenario : Success case- when control digit is 0
     */
    @Test
    public void validateModulo11WithControlDigitZero() {
        Assert.assertTrue(Modulo11Validator.validateModulo11("52051013670"));
    }

    /**
     * Test method for validateModulo11
     * Scenario : Success case : account number starts with 0
     */
    @Test
    public void validateModulo11WithAccNumberStartsWithZero() {
        Assert.assertTrue(Modulo11Validator.validateModulo11("05393954827"));
    }

    /**
     * Test method for validateModulo11
     * Scenario : Failure case- when input is empty
     */
    @Test
    public void validateModulo11WhenInputEmpty() {
       Assert.assertFalse(Modulo11Validator.validateModulo11(""));
        Assert.assertFalse(Modulo11Validator.validateModulo11(null));
    }

    /**
     * Test method for validateModulo11
     * Scenario : Failure case- when input is empty
     */
    @Test
    public void validateModulo11WhenInputHasWrongDelimiter() {
        Assert.assertFalse(Modulo11Validator.validateModulo11("1234-56-78903"));
    }

    /**
     * Test method for validateModulo11
     * Scenario : Failure case- when input conatins character
     */
    @Test
    public void validateModulo11WhenInputHasCharacter() {
        Assert.assertFalse(Modulo11Validator.validateModulo11("1234567890a"));
    }

    /**
     * Test method for validateModulo11
     * Scenario : Failure case- when input is of invalid length
     */
    @Test
    public void validateModulo11WhenInputLengthIsNotValid() {
        Assert.assertFalse(Modulo11Validator.validateModulo11("123456789033"));
    }
}