public class Exercise_1_Rectangle {
    private double x;
    private double y;
    private double width;
    private double height;

    public Exercise_1_Rectangle() {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }
    public Exercise_1_Rectangle(double width, double height) {
        this.x = 0;
        this.y = 0;
        this.width = width;
        this.height = height;
    }
    public Exercise_1_Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double calculateArea(){
        double sum = this.width * this.height;
        return sum;
    }

    public double calculatePerimeter(){
        return this.width + this.width + this.height + this.height;
    }
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}

