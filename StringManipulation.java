public class StringManipulation {
    public static void main(String[] args) {
    
        String str1 = new String("Welcome");
        String str2 = new String("Greetings");
        System.out.println("a. Created strings: str1 = " + str1 + ", str2 = " + str2);
        System.out.println("\n");
        
        int length = str1.length();
        System.out.println("b. Length of str1: " + length);
        System.out.println("\n");
        
        String str3 = str1 + " " + str2;
        String str4 = str1.concat(" ").concat(str2); 
        System.out.println("c. Concatenated string (using +): " + str3);
        System.out.println("c1. Concatenated string (using concat): " + str4);
        System.out.println("\n");
        
        char ch = str1.charAt(1); 
        System.out.println("d. Character at index 1 in str1: " + ch);
        System.out.println("\n");
        
        boolean areEqual = str1.equals(str2);
        boolean areEqualIgnoreCase = str1.equalsIgnoreCase("Welcome");
        System.out.println("e. str1 equals str2? " + areEqual);
        System.out.println("e1. str1 equals 'Welcome' (ignore case)? " + areEqualIgnoreCase);
        System.out.println("\n");
        
        boolean contains = str3.contains("Greetings");
        int index = str3.indexOf("Greetings");
        System.out.println("f. str3 contains 'Greetings'? " + contains);
        System.out.println("f1. Index of 'Greetings' in str3: " + index);
        System.out.println("\n");

        String replaced = str3.replace("Greetings", "Back");
        String upper = str3.toUpperCase();
        String trimmed = "  Hello World  ".trim();
        System.out.println("g. String after replace: " + replaced);
        System.out.println("g1. String in uppercase: " + upper);
        System.out.println("g2. Trimmed string: '" + trimmed + "'");
        System.out.println("\n");

        int num = 100;
        double dbl = 3.14;
        boolean bool = true;
        String strNum = String.valueOf(num);
        String strDbl = String.valueOf(dbl);
        String strBool = String.valueOf(bool);
        System.out.println("h. Converted int to string: " + strNum);
        System.out.println("h1. Converted double to string: " + strDbl);
        System.out.println("h2. Converted boolean to string: " + strBool);
    }
}

