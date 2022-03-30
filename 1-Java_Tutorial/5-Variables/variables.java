
public class variables {
    public static void main(String[] args) {
        // This is a string variable
        String name = "John";
        System.out.println();
        //This is a int variable
        int num = 25;
        System.out.println(num);

        //This is a non-assigned variable
        int digit;
        digit = 35;
        System.out.println(digit);
        //This is variable that has been overwritten by re-assignment
        int number = 45;
        number = 55;
        System.out.println(number);

        //This is a varible w/ the final keyword to prevent overwriting of the assignment.
        final int figure = 65;
        //figure = 75;
        System.out.println(figure);
        //This is a float variable
        float deci = 10.5f;
        System.out.println(deci);
        //This is a char variable
        char letter = 'z';
        System.out.println(letter);
        //This is a boolean variable
        Boolean check = true;
        System.out.println(check);


    }
    
}
