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

    public static void main (String[] args){
        ReverseString rv= new ReverseString();
        rv.impl1();

        ReverseString obj = new ReverseString("I'm going to school tomorrow morning");
        obj.impl1();
    }
}
