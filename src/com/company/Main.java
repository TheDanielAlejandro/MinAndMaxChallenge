package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);                             // . Accessing to the class scanner to get the input from the user.
        int min = 0;                                                          // . Creating the variables (min = minimum value, max = max value) to use during the exercise.
        int max = 0;
      //boolean firstCycle = true;                                            // . The alternative for the problem of the first input ( if the user inserts only one value the value must be min and max at the same time).

             while(true){                                                     // . Creating an endless loop to retrieve from the user all the numbers, until a non digit number is inserted.
                System.out.println("Enter number:");                          // . Requesting to the user the number to insert
                boolean isAnInt = scanner.hasNextInt();                       // . Creating a variable isAnInt containing the method hasNextInt of the class scanner, the variable is going to check if the next value inserted  by the user is actually a datatype Integer or not.

                if(isAnInt){                                                  // . Creating an if-statement that has "isAnInt" as parameter, so basically if the value inserted is an integer(TRUE) the loop is going to continue, if the value is another datatype (FALSE) then the loop is going to end.

                    int value = scanner.nextInt();                            // . Creating a variable "value" that contains the method "hasNextInt()" of the class Scanner, is going to store in the variable "value" the datatype integer.

                    if(value > 0 && min == 0){                                // . First solution to overcome the problem of the first input, on the first cycle set max and min to the value inserted
                        min = value;                                          // . This happens only the first time.
                        max = value;
                        continue;
                    }

                    /*
                    if(first){                                                // . The Alternative requires the use of another variable "firstCycle" in line 12, type boolean set to true.
                        first = false;                                        // . At the first cycle the variable is going to be set to "FALSE" so the this happens only the first time.
                        min = value;                                          // . Setting all the values to the input.
                        max = value;
                     */

                    if(value > min){                                          // . If-statement that happens every cycle, that allocates the right value (in min or max) depending on the input.
                        max = value;
                    }else{
                        min = value;
                    }

                }else{                                                        // . The break of the loop in case a digit different than a number is inserted.
                    System.out.println("The max value is: " + max + " and the min value is: " + min);
                    break;
                }
                scanner.nextLine();
            }
             scanner.close();
    }
}

