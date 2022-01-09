class Comparison {
 
    public static void main(String args[])
    {
        double n = 10;
        double f1;
        double f2;
        int printPeriodically = 0;

        int stopper = 0;

        System.out.println("Function 1 = 500 * n^2 + 15 * n + 1000.");
        System.out.println("Function 2 = 2 * n^3.");
        
        while (stopper != 1) {
            
            f1 = 500 * Math.pow(n, 2) + 15 * n + 1000;
            f2 = 2 * Math.pow(n, 3);
            
            int F1 = (int) f1;
            int F2 = (int) f2;
            int N = (int) n;
            
            printPeriodically = printPeriodically + 1;
            
            if (printPeriodically % 4 == 0) {
                System.out.println("Where n = " + N + 
                ", function 1 = " + F1 + " and function 2 = " + F2 + 
                ".");
            } else if(F1 < F2) {
            System.out.println("Where n = " + N + 
                ", function 1 = " + F1 + " and function 2 = " + F2 + 
                ".");
                stopper = 1;
            }
            n = n + 10;
        }
        System.out.println("Function 2 has overtaken Function 1.");
    }
}