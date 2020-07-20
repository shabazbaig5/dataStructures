class FactRecursion{

    public static int factorial(int n){

        // int fact = 1;

        if(n == 0){

            return 1;
        }else{

            return n * factorial(n-1);

        }

    }

    public static int factorialIteration(int n){

        int fact = 1;
        while(n>0){
            fact = fact * n;
            n = n-1;
        }

        return fact;
    }

    public static void main(String[] args) {

        int n= 3;

        int fact = FactRecursion.factorial(n);

        System.out.println(fact);

        System.out.println("The recursion problem with the iteration is : " + FactRecursion.factorialIteration(5));
        
    }
}