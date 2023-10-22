public class CtoFTableDisplay
{
    public static void main(String[] args) {
        double F = 0;

        System.out.print("Celsius");
        for (int i = 0; i <= 1; i++) {
            System.out.print(" ");
        }
        System.out.println("Fahrenheit");

        for (double C = -100; C <= 100; C++) {
            if (String.valueOf(C).contains("-")) {
            } else {
                for (int i = 1; i <= 1; i++) {
                    System.out.print(" ");
                }
            }

            System.out.print(C);

            F = CtoF(C);


            if ((String.valueOf(C)).length() == 6) {
                for (int i = 1; i <= 5; i++) {
                    System.out.print(" ");
                }
            } else if ((String.valueOf(C)).length() == 5) {
                if((String.valueOf(F)).length() <= 4)
                {
                    for (int i = 1; i <= 6; i++) {
                        System.out.print(" ");
                    }
                }
                else if((String.valueOf(F)).length() == 3)
                {
                    for (int i = 1; i <= 7; i++) {
                        System.out.print(" ");
                    }
                }
                else {
                    for (int i = 1; i <= 6; i++) {
                        System.out.print(" ");
                    }
                }
            } else if ((String.valueOf(C)).length() == 4) {

                for (int i = 1; i <= 7; i++) {
                    System.out.print(" ");
                }

            }
            else if ((String.valueOf(C)).length() == 3) {
                if(((String.valueOf(F)).length()) == 4)
                {
                    for (int i = 1; i <= 8; i++) {
                        System.out.print(" ");
                    }
                }
                else {
                    for (int i = 1; i <= 7; i++) {
                        System.out.print(" ");
                    }
                }
            }else
            {
                for (int i = 1; i <= 8; i++) {
                    System.out.print(" ");
                }
            }

            System.out.printf("%.1f", F);
            System.out.println();
        }
    }
    public static double CtoF(double C)
    {
        double F = C * 1.8 + 32;
        return F;
    }
}