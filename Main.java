import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /* 1. Develop a program that takes the weight (in kilograms) and height (in meters)
       as input and calculates the BMI, then prints it.
        Input: Weight (kg) = 70, Height (m) = 1.75
        Expected Output: BMI = 22.86
        */


//
//        System.out.print("please enter weight: ");
//        int Weight = input.nextInt();
//        System.out.println("----------------------------------------");
//
//        System.out.print("please enter Height: ");
//        double Height= input.nextDouble();
//        System.out.println("----------------------------------------");
//
//        double culc = Weight / (Height * Height);
//
//        System.out.println(culc);
//        System.out.println("----------------------------------------");
//        System.out.printf("BMI = %.2f%n", culc);

        /* 2. Write a program that takes the obtained marks and total marks as input and calculates the percentage,
         then prints it.
         Input: Obtained Marks = 85, Total Marks = 100 Expected Output: Percentage = 85.0%
         */

//        System.out.println("Please Enter Obtained Marks: ");
//        int obtained_Marks = input.nextInt();
//        System.out.println("----------------------------------------");
//
//        System.out.println("enter total marks:  ");
//        double total_marks= input.nextDouble();
//        System.out.println("----------------------------------------");
//
//        double percentage = (obtained_Marks / total_marks) * 100;
//        System.out.println("the Percentage is : "+ percentage + "%");

        /* 3. Create a program that takes an amount in one currency and an exchange rate as input,
        then converts and prints the amount in another currency.
        Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
        Expected Output: Amount in EUR = 85.0
         */


//        System.out.print("Please Enter Amount in USD:  ");
//        int  amount_in_usd = input.nextInt();
//        System.out.println("--------------------------------------");
//
//        System.out.print("Please Enter Exchange Rate (USD to EUR): ");
//        double exchange_rate_usd_to_eur = input.nextDouble();
//        System.out.println("----------------------------------------");
//
//        double amount_in_eur =  amount_in_usd * exchange_rate_usd_to_eur;
//        System.out.println("Amount in EUR is: "+amount_in_eur);




        /* 4. Create a program that takes a string as input, calculates its length,
        and then reverses the string using the StringBuilder class, finally printing both the length
        and reversed string
I        input: "Hello, World!"
            Expected Output: Length of the string: 13 And Reversed string: "!dlroW ,olleH"
         */

//        System.out.println("Please Enter a String:  ");
//        String name = input.nextLine();
//        System.out.println("----------------------------------------");
//
//        int length = name.length();
//        StringBuilder reserveString = new StringBuilder(name);
//        reserveString.reverse();
//        System.out.println("The length is: " +length);
//        System.out.println("----------------------------------------");
//        System.out.println("The Reverse String is " +reserveString);
//

        /* 5. Develop a program that takes a sentence as input and extracts a substring from it, then prints the extracted substring.
            Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index = 10, End Index = 20
            Expected Output: "brown fox"
         */

//        System.out.print("Please Enter a sentence: ");
//        String sentence = input.nextLine();
//        System.out.println("--------------------------------------");
//
//        System.out.print("Please Enter end index: ");
//        int  end_index = input.nextInt();
//
//        System.out.print("Please Enter start index: ");
//        int  start_index = input.nextInt();
//
//        String substring = sentence.substring(start_index, end_index);
//
//        System.out.println("-----------------------------------------");
//        System.out.println("Extracted Substring ");
//        System.out.println(">> \"" + substring + "\" <<");
//        System.out.println("-----------------------------------------");











        /* 6. Write a program that takes a sentence and a keyword as input, then check if the keyword is present in the sentence and prints the result.
            Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword = "jumps"
            Expected Output: Keyword "jumps" is present in the sentence.
         */

//
//        System.out.println("Please Enter a sentence:  ");
//        String sentence = input.nextLine();
//
//        System.out.println("Please Enter a keyword:  ");
//        String keyword = input.nextLine();
//
//        boolean isPresent = sentence.contains(keyword);
//
//
//        System.out.println("The keyword is :" + keyword);
//        System.out.println(isPresent);

//





        /* 7. Develop a program that takes a sentence and a word to replace as input, then replace all occurrences of the word with another word and prints the modified sentence.
                Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to Replace = "fox", Replacement Word = "cat"
                Expected Output: "The quick brown cat jumps over the lazy dog"
         */
//        System.out.print("Please enter a sentence: ");
//        String sentence = input.nextLine();
//
//
//        System.out.print("Please enter the word to replace: ");
//        String word_to_replace = input.nextLine();
//
//        System.out.print("Please enter the replacement word: ");
//        String replacement_word = input.nextLine();
//
//
//        String modified_sentence = sentence.replaceAll(word_to_replace, replacement_word);
//
//        System.out.println("---------------------------------------");
//        System.out.println("the Sentence is: " + modified_sentence );
//        System.out.println("---------------------------------------");






         /* 8. Write a program that takes two strings as input and check if they are equal,
                ignoring the case, then prints whether they are equal or not.
                      Input: String 1 = "Hello", String 2 = "hello"
               Expected Output: Strings are equal (ignoring case).
         */
//
//        System.out.print("Please enter the first string: ");
//        String string1 = input.nextLine();
//
//        System.out.print("Please enter the second string: ");
//        String string2 = input.nextLine();
//
//        System.out.println(""+string1.equalsIgnoreCase(string2));












    }
}