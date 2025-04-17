public class Calculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int add = cal.add(10,50);
        System.out.println("addition of 10 and 50 is : " + add);

        int sub = cal.sub(90,40);
        System.out.println("substraction of 90 and 40 is : " + sub);

        int mul = cal.mul(30,10);
        System.out.println("multiplication of 30 and 10 is: " + mul);

        int mod = cal.mod(10, 20);
        System.out.println("modulus of 10 and 20 is: " + mod);
    }
    //addition : sum = a + b

    int add(int a,int b) {
        int sum = a + b;
        return sum;
    }

    //substraction : a - b

    int sub(int a,int b) {
        int sub = a - b;
        return sub;
    }

    //multiplication : a * b

    int mul(int a,int b) {
        int mul = a * b;
        return mul;
    }

    //modulus : a % b

    int mod(int a,int b) {
        int mod = a % b;
        return mod;
    }
}
