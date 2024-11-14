package lv.acodemy;

public class Variables {
    public static void main(String[] args) {

        //this is my comment

        /*
        this is 1 line
        this is 2 line
         */

        //int(integer) - whole number / natural number
        int age = 30;
        int currentYear = 2024;
        // current_year = snake case - never do like this!!!
        // current-year = kebab case - never do like this!!!
        //currentYear = camel case (lower camel case) - good

        int inventoryItemCount = 100;

        System.out.println(age);
        System.out.println(currentYear);
        System.out.println(inventoryItemCount);

        //double (fractional numbers)
         double temperature = 36.6;
         double price = 19.99;
         double distance = 38400.0;


        System.out.println(temperature);
        System.out.println(price);
        System.out.println(distance);

        // char (symbols)

        char grade = 'A';
        char myInitial = 'N';
        char currentSymbol = '$';

        // Print them all;

        System.out.println(grade);
        System.out.println(myInitial);
        System.out.println(currentSymbol);

        //boolean (logical type, can keep only two values: true or false)
        //how to name& has or is
        //example: isSummer / if(isSummer) {}; / isLoggedIn;
        // Example: hasAccess / if(hasAccess) {};

        boolean hasAccess = true;
        System.out.println(hasAccess);

        boolean isSummer = false;
        System.out.println(isSummer);


        // long
        long phoneNumber = 21431211;

        // float
        float interestRate = 4.5f;

        // Arithmetic operators

        int a = 10;
        int b = 5;
        int sum = a+b; // add
        System.out.println(sum);

        int c = 20;
        int d = 8;
        int difference = c - d;
        System.out.println(difference);

        int n = 7;
        int m = 3;
        int result = n * m;
        System.out.println(result);

        // Divide

        int num1 = 10;
        int num2 = 3;
        int division = num1/num2;
        System.out.println(division);

        double num3 = 10.0;
        double num4 = 3.0;
        double divResult = num3 / num4;
        System.out.println(divResult);

        // % (reminder of a division)

        int f = 12;
        int g = 5;
        int reminder = f % g;
        System.out.println(reminder);

        int number = 9;
        boolean isEven = (number % 2 ==0); // == comparison operator
        System.out.println(isEven);

        //Increment ++
        //++preIncrement
        //Decrement --
        // --decrement

        number++;
        System.out.println(number);
        number--;
        System.out.println(number);

        int counter = 10;
        counter++;
        int postIncrement = counter++; // postIncrement = 11; counter = 12;
        int preIncrement = ++counter; // preIncrement = 13; counter = 13;
        System.out.println(postIncrement);
        System.out.println(preIncrement);

        String name = "John";
        String lastName = "Doe";

        //Print them separately
        System.out.println(name);
        System.out.println(lastName);

        String fullName = name + " " + lastName;
        System.out.println(fullName);

        //%s - for String
        //%d - for numbers
        System.out.println(String.format("My name is: %s, My surname is: %s", name, lastName));
        System.out.printf("My name is: %s, My surname is: %s\n", name, lastName);
        System.out.printf("My name is: %s, My surname is: %s%n", name, lastName);

        var myCurrentAge = 30;
        var text = "Hello World";

        String myVar;
        myVar = "Hello, World!";
    }
}
