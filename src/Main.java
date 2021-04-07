public class Main {
    public static void main(String[] args) {
        Shape []array = new Shape[3];
        array[0] = new Circle(10);
        array[1] = new Square(10);
        array[2] = new Rectangle(10,20);
        //dien tich ban dau
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Square ){
                Square newSquare = (Square) array[i];
                newSquare.howToColor();
            } else {
                System.out.println("Area is: "+array[i].getArea());
            }
        }
    }
}
