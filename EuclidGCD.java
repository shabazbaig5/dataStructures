class EuclidGCD{

    public static int findGCD(int a, int b){

        int gcd = 0;

        int quo =  0;

        while(a%b != 0){

            gcd = a%b;
            int temp = b;

            b = gcd;
            a = temp;
        }

        return gcd;

    }
    public static void main(String[] args) {
        
        System.out.println(EuclidGCD.findGCD(15,9));
    }
}