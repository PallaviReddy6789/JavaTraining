public class Variables {

    //must have a name

    public static void main(String[] args) {
        // variables must have a name - person name should have characters
        // should start with character - age,gender,name
        // can have numbers and special characters - age

        // variables must have a type

        boolean isAdult; //person will become adult when he/she crosses 18 years
        isAdult = true;

        char personInitial;
        personInitial = 'A';

        // byte: 8 bit signed integer, range from -128 to 127.

        byte personAge;
        personAge = 50;

        // short: 16-bit signed integer

        short personMonthlySalary;
        personMonthlySalary = 8000;

        //int: A 32-bit signed integer.

        int personYearlySalary;
        personYearlySalary = 150000;

        // long: A 64-bit signed integer.

        long companyMarketCap;
        companyMarketCap = 100000000000L;

        // A 32-bit single-precision floating-point number.
        float personHeight = 5.8f;

        //A 64-bit double-precision floating-point number.

        double personWeight = 167.7;

        System.out.println("Is person Adult = " + isAdult);
        System.out.println(" Person Initial = " + personInitial);
        System.out.println(" Person Age = " + personAge);
        System.out.println("Person Monthly Salary = " + personMonthlySalary);
        System.out.println("Person Yearly Salary = " + personYearlySalary);
        System.out.println("Company Market Cap = " + companyMarketCap);
        System.out.println("Person Height = " + personHeight);
        System.out.println("Person Weight = " + personWeight);



    }
}
