import java.util.Scanner;
public class SafeInput
{
    /**
     *
     *returns a string from the user that has at least one character
     * Returns a string from the user that has at least one character
     * @param pipe scanner to use to read the string
     * @param prompt string that tells the user what to input
     * @return string obtained by the user that is at least length 1
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        boolean done = false;
        String response = " ";
        do {
            // display the prompt
            System.out.print(prompt + ": ");
            // get the input
            response = pipe.nextLine();
            //check if it is valid and end the loop if it is
            if(response.length() > 0)
            {
                done = true;
            }
            else
            {
                System.out.println("\nYou must enter at least on character!\n");
            }
        }while(!done);
        return response;
    }
    /**
     * get an int form the user with no constatints on its range
     * @param pipe scanner to use for input
     * @param prompt msg for user
     * @return
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        String trash = "";
        boolean done = false;
        int val = 0;
        do {
            // display the prompt
            System.out.print(prompt + ": ");
            // get the input
            if(pipe.hasNextInt())
            {
                val = pipe.nextInt();
                pipe.nextLine(); // clear buffer
                done = true;
            }
            else // don't have an int
            {
                trash = pipe.nextLine();
                System.out.println("\nYou entered: " + trash + " you must enter a valid integer!");
            }
        }while(!done);
        return val;
    }
    /**
     * gets an unconstrained double value from the user using scanner
     * @param pipe scanner to use for the input
     * @param prompt msg to user tellin them what to input
     * @return a unconstrained double value
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        String trash = "";
        boolean done = false;
        double val = 0;
        do {
            // display the prompt
            System.out.print(prompt + ": ");
            // get the input
            if(pipe.hasNextInt())
            {
                val = pipe.nextDouble();
                pipe.nextLine(); // clear buffer
                done = true;
            }
            else // don't have an int
            {
                trash = pipe.nextLine();
                System.out.println("\nYou entered: " + trash + " you must enter a valid double!");
            }
        }while(!done);
        return val;
    }
    /**
     *
     * @param pipe
     * @param prompt
     * @param low
     * @param high
     * @return
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        String trash = "";
        boolean done = false;
        int val = 0;
        do {
            // display the prompt
            System.out.print(prompt + "["+ low + " - " + high + "]: ");
            // get the input
            if(pipe.hasNextInt()) {
                val = pipe.nextInt();
                pipe.nextLine(); // clear buffer
                if (val >= low && val <= high)
                {
                    done = true;
                } else
                {
                    System.out.println("" + val + " is not in the range [" + low + " - " + high + "]");
                }
            }
            else // don't have an int
            {
                trash = pipe.nextLine();
                System.out.println("\nYou entered: " + trash + " you must enter a valid inegert!");
            }
        }while(!done);
        return val;
    }
    /**
     *
     * @param pipe scanner for inpuit
     * @param prompt msg for user
     * @param low low boundary for inclusive range
     * @param high high boundary for inclusive range
     * @return
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double result = 0.0;
        boolean done = false;
        String trash = "";
        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()){
                result = pipe.nextDouble();
                pipe.nextLine();
                if(result >= low && result <= high){
                    done = true;
                }
                else {
                    System.out.println("You must enter a valid double in the range [" + low + " - " + high + "] ");
                    done = false;
                }
            }
            else {
                trash = pipe.nextLine();
                System.out.println("You must enter a double [" + low + " - " + high + "]: ");
            }
        }while(!done);
        return result;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String trueFalse = "";
        boolean result = false;
        boolean done = false;
        do {
            System.out.println(prompt + ": ");
            trueFalse = pipe.nextLine();
            if(trueFalse.equalsIgnoreCase("Y"))
            {
                result = true;
                done = true;
            } else if (trueFalse.equalsIgnoreCase("N")) {
                result = false;
                done = true;
            }else {
                System.out.println("You must choose Y or N not " + trueFalse);
                done = false;
            }
        }while(!done);
        return result;
    }
    /**
     *
     * @param pipe Scanner object that you created in main in the usual way i.e. in or console
     * @param prompt message to display as the prompt for the input.
     * @param regEx regEx pattern in java String format to use for matching
     * @return
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String retVal = "";
        boolean done = false;
        do
        {
            System.out.println(prompt + ": ");
            retVal = pipe.nextLine();
            if (retVal.matches(regEx))
            {
                done = true;
            }
            else
            {
                System.out.println("What you entered does not match the pattern " + regEx);
            }
        } while (!done);
        return retVal;
    }

    public static String prettyHeader(Scanner pipe, String msg) {
        int totalWidth = 60;
        int width;
        int msgLength = msg.length();
        int sides = (totalWidth - msgLength - 6) / 2;
        String header = "";

        for (width = 0; width < totalWidth; width++) {
            header += "*";
        }
        header += "\n";

        header += "***";
        for (width = 0; width < sides; width++) {
            header +=" ";
        }
        header += msg;
        for (width = 0; width < sides; width++) {
            header +=" ";
        }
        header +="***\n";

        for (width = 0; width < totalWidth; width++) {
            header +="*";
        }
        header += "\n";
        return header;
    }

}
