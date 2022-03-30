
public class strings {
    public static void main(String[] args) {
        //Pring a simple string
        String greeting = "Hello";
        System.out.println(greeting);
        //Getting the length of a string
        String txt = "aahdaskjhdsdlkfdhufhfakjsfddasdljkfsdduf";
        System.out.println("The length of the string is: " + txt.length());
        //Upper and Lower Case methods
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        //Finding a character in a string
        String txts = "Please locate where 'locate' occurs";
        System.out.println(txts.indexOf("locate"));
        //String Concatenation
        String first_name = "John ";
        String last_name = "Doe";
        System.out.println(first_name + "" + last_name);
        // If you add two numbers the result will be a number
        int x = 10;
        int y = 20;
        int z = x + y;
        System.out.println(z);
        //if you add two strings the result will be a concatenation
        String g = "10";
        String h = "20";
        String i = g + h;
        System.out.println(i);
        // if you add a number and a string, the result will be a concatenation
        int r = 10;
        String s = "20";
        String v = r + s;
        System.out.println(v);
        // these are special characters for qoutations and backslash
        String text = "We are so-called \"Vikings\" from the North.";
        System.out.println(text);
        String txt1 = "It\'s alright.";
        System.out.println(txt1);
        String txt2 = "The character is called a backslash.";
        System.out.println(txt2);
        //these are the other 6 special escape characters in java
        
        //new line
        String txt3 = "Hello\nWorld!";
        System.out.println(txt3);
        

        //Carriage return
        String txt4 = "Hello\rWorld!";
        System.out.println(txt4);
        //Tab
        String txt5 = "Hello\tWorld!";
        System.out.println(txt5);
        //form feed
        String txt6 = "Hello\fWorld!";
        System.out.println(txt6);
        //Backspace
        String txt7 = "Hello\bWorld!";
        System.out.println();
        
    }

    
}
