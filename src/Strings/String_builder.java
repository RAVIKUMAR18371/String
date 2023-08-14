package Strings;

public class String_builder {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Tony");
        System.out.println(s1);

        s1.insert(3,'n');
        System.out.println(s1);


        s1.setCharAt(1,'c');
        System.out.println(s1);

        s1.insert(2,'s');
        System.out.println(s1);

        s1.reverse();
        System.out.println(s1);

        s1.delete(2,3); // here 3rd index will not be included keep in mind
        System.out.println(s1);

        StringBuilder s2 = new StringBuilder();
        //Append means LAst me jod dena.
        s2.append('f');
        s2.append("e");
        s2.append("l");
        s2.append("l");
        s2.append("o");
        System.out.println(s2);
        System.out.println(s2.length());

        StringBuilder s5 = new StringBuilder("Hello");
        // for reversing the string-->Hello
        for(int i = 0;i<s5.length()/2; i++){
            int front = i;
            int back = s5.length() - 1 - i;

            char frontChar = s5.charAt(front);
            char backChar = s5.charAt(back);

            s5.setCharAt(front,backChar);
            s5.setCharAt(back,frontChar);

        }

        System.out.println(s5);



    }
}
