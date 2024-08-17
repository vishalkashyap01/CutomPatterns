package com.vishal.CustomPattern;

public class Number {

    void printNumberPattern(short digit)
    {
        // its switch case by we can call the specific method for same digit method call to invoke it
        switch (digit)
        {
            case 0:
                zeroDigit();
                break;
            case 1:
                oneDigit();
                break;
            case 2:
                twoDigit();
                break;
            case 3:
                threeDigit();
                break;
            case 4:
                fourDigit();
                break;
            case 5:
                fiveDigit();
                break;
            case 6:
                sixDigit();
                break;
            case 7:
                sevenDigit();
                break;
            case 8:
                eightDigit();
                break;
            case 9:
                nineDigit();
                break;
            default:
                System.out.println("It's not a digit check!");
        }
    }

    // Code for 0
    private void zeroDigit() {
        for (int i=0; i<6; i++) {
            for (int j=0; j<5; j++) {
                if (j==0 || j==4 || i==0 || i==5)
                {
                    System.out.print("0 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Code for 1
    private void oneDigit() {
        for (int i=0; i<6; i++) {
            for (int j=0; j<5; j++) {
                if (j==0 || j==4 || i==0 || i==5)
                {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Code for 2
    private void twoDigit() {
        for (int i=0; i<6; i++) {
            for (int j=0; j<5; j++) {
                if (j==0 || j==4 || i==0 || i==5)
                {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Code for 3
    private void threeDigit() {
        for (int i=0; i<6; i++) {
            for (int j=0; j<5; j++) {
                if (j==0 || j==4 || i==0 || i==5)
                {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Code for 4
    private void fourDigit() {
        for (int i=0; i<6; i++) {
            for (int j=0; j<5; j++) {
                if (j==0 || j==4 || i==0 || i==5)
                {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Code for 5
    private void fiveDigit() {
        for (int i=0; i<6; i++) {
            for (int j=0; j<5; j++) {
                if (j==0 || j==4 || i==0 || i==5)
                {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Code for 6
    private void sixDigit() {
        for (int i=0; i<6; i++) {
            for (int j=0; j<5; j++) {
                if (j==0 || j==4 || i==0 || i==5)
                {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Code for 7
    private void sevenDigit() {
        for (int i=0; i<6; i++) {
            for (int j=0; j<5; j++) {
                if (j==0 || j==4 || i==0 || i==5)
                {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Code for 8
    private void eightDigit() {
        for (int i=0; i<6; i++) {
            for (int j=0; j<5; j++) {
                if (j==0 || j==4 || i==0 || i==5)
                {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Code for 9
    private void nineDigit() {
        for (int i=0; i<6; i++) {
            for (int j=0; j<5; j++) {
                if (j==0 || j==4 || i==0 || i==5)
                {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
