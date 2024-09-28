package c;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Expressive s=new Expressive();
        String[] words={"hellom", "hi", "helo"};
        int e = s.expressiveWords("hhhhhheeelo",words);
        System.out.println(e);
    }
}