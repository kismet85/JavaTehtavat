class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        super.color = "Green";
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}