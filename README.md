# Modulo11Validator

This project implements Modulo 11 algorithm and validates input number with the algorithm

# Requirements

Programming Task:

Modulo 11 - Account Number:

Control numbers are used to detect errors when entering, for example an Account number or Social
Service Number. In Norway Modulo 11 is used as the calculation method for the control digit in the
account number.

Valid Account number example is 1234.56.78903

Calculation of Control Numbers with Modulo 11 (rules):

 The last digit of an account number is a control digit
 Each digit in an account number (without control digits) is multiplied by the weight numbers
2, 3, 4, 5, 6, 7, 2, 3, 4, 5 (possibly further, 6, 7, 2, 3 and so on for numbers with more digits)
 Multiples from right to left
 The products from the multiplication are added to a total sum
 The control digit becomes the number that has to be added to the crossover sum to get a
number divisible by 11
 Or
 Deduct from a "balance", which is what must be deducted from the crossover sum to split
the crossover amount to 11. Then draw the residual number from 11 to get control number.

Task:

Create an application in Java that can check if a control number meets the requirement for modulo
11. Use main method to verify (do not need a GUI). Use also tests to verify. Make all the assumptions
that is needed.

Example of calculation of control digits with Modulo11

A possible account number is 1234.56.78903. The last digit in the account number is a check digit. In
this example, the control digit is 3. The account number without control digits (and without a
punctuation mark) is 1234567890.

Each digit in the example above is multiplied by the weight numbers 2,3,4,5,6,7,2,3,4,5 (possibly
further, 6,7,2,3 and so forth for numbers with multiple digits), calculated from right to left.
0 × 2 = 0, 9 × 3 = 27, 8 × 4 = 32, 7 × 5 = 35, 6 × 6 = 36, 5 × 7 = 35, 4 x 2 = 8, 3 x 3 = 9, 2 x 4 = 8
1 x 5 = 5

Total sum is then 0 + 27 + 32 + 35 + 36 + 35 + 8 + 9 + 8 + 5 = 195.

The control digit now becomes the number that has to be added to the cross-sum to get a number
divisible by 11.

The total sum is divided by 11 and we note the "rest" which becomes 8 in this case. This rest is
deducted from 11 and we get 3 that will be the control differential.

11 - 8 = control digit 3

Complete and valid account number in this example is therefore 1234.56.78903.

If the sum is divisible by 11, the remainder is 0 and the control digit is 0. If the "rest" of the division
becomes 1 then the "control digit" has the numeric value 10, instead of a minus sign (or dash)
instead of the control digit. However, for account numbers (and for social security numbers), such
numbers should instead be rejected so that for the types numbers, control digits "-" can never occur

# Tech Stack
Java8,JUNIT4
