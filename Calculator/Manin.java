package Calculator;
public class Manin {
    public static void main(String[] args) {
        Square s1 = new Square(true, 5);
        Square s2 = new Square(true);
        Square s3 = new Square(7);
        System.out.println(s1);
        s1.howToColor();
        System.out.println(s2);
        s2.howToColor();
        System.out.println(s3);
        s3.howToColor();
    }
}
