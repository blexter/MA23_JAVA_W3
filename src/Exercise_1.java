public class Exercise_1 {
    public static void main(String[] args) {
        Exercise_1_Rectangle rectangle1 = new Exercise_1_Rectangle();
        Exercise_1_Rectangle rectangle2 = new Exercise_1_Rectangle(1,2,3,4);
        Exercise_1_Rectangle rectangle3 = new Exercise_1_Rectangle(4,3);
        rectangle1.setXY(7,8);
        rectangle2.setHeight(10);
        rectangle3.setWidth(20);

        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle3.calculateArea());

        System.out.println(rectangle1.calculatePerimeter());
        System.out.println(rectangle2.calculatePerimeter());
        System.out.println(rectangle3.calculatePerimeter());
    }
}