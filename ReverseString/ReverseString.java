import java.util.Collections;
import java.util.Stack;

public class ReverseString {
    private final String stringToRevers;

    ReverseString(){
        stringToRevers="Hello World";
    }
    ReverseString(String s){
        this.stringToRevers=s;
    }
    public void impl1(){
        char[] reverse=stringToRevers.toCharArray();

        for(int i = reverse.length; i> 0; i--){
            System.out.print(reverse[i-1]);
        }
        System.out.println(" ");
    }

    public StringBuilder impl2(){
        StringBuilder rString = new StringBuilder();
        rString.append(stringToRevers);
        rString.reverse();
        return rString;
    }
    public void impl3(){
        StringBuffer s= new StringBuffer();
        s.append(stringToRevers);
        s.reverse();
        System.out.println(s);
    }

    public void impl4(){
        Stack <Character> word= new Stack<Character>();
        for(char c: stringToRevers.toCharArray()){
            word.push(c);
        }
        String reversedString = "";
        while (!word.isEmpty()){
           System.out.print(word.pop());
       }

    }
    public static void main (String[] args){
        ReverseString rv= new ReverseString();
        rv.impl1();

        ReverseString obj = new ReverseString("I'm going to school tomorrow morning");
        obj.impl1();
        
        ReverseString obj2= new ReverseString("She sells sea shells by the seashore");
        System.out.println(obj2.impl2());

        ReverseString obj3= new ReverseString("Humpty Dumpty sat on a wall, Humpty Dumpty had a great fall");
        obj3.impl3();

        ReverseString obj4= new ReverseString("Does this even work?");
        obj4.impl4();


    }
}
