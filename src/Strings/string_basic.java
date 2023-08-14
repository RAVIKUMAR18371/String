package Strings;
/*
Basically in java String--> is an Object
 */

public class string_basic {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony2";
        System.out.println(s1.compareTo(s2));

        //or

        System.out.println(s1 == s2); // this way of writing cause of failing the test
        // case in some of the condition so better use the above way of writing
        // .compareTo

        String s5 = new String("Ravi");
        System.out.println(s5);





        // SUBSTRING:
        String sentence = "BrockLesner";
        String mean = sentence.substring(5,10);// here 10th index not get considered
        System.out.println(mean);

        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());

     //   int n = Integer.parseInt(sentence);
      //  System.out.println(n);
    }
}
