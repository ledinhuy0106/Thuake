package Calculator;

public class Square implements colorable{
    boolean colorable = false;
    int side;


    Square( int side){
        this.side=side;
    }
    Square(boolean colorable){
        this.colorable= colorable;
    }

    Square(boolean color, int side){
        this.colorable=color;
        this.side=side;

    }
    @Override
    public void howToColor() {
        if(this.colorable) System.out.println("Color all four side!");
    }

    public int area(){
        return side*side;
    }

    @Override
    public String toString() {
        return "This Square's area is: "+area()+".";
    }
}
