public class ColoringPoint extends Point {
    private String color;
    private Point point;
    //first way of initializing it
    ColoringPoint(){
        this.point = new Point();
        this.color = "";
    }
    ColoringPoint(Point pt,String colors){
        this.point = pt;
        this.color = colors;
    }
    ColoringPoint(int x, int y, String colors){
        this.point = new Point(x,y);
        this.color = colors;
    }
    public void setColor(String colors){
        this.color = colors;
    }
    public void setPoint(Point pt){
        this.point = pt;
    }
    public void setLocation(int x, int y){
        this.point.setLocation(x,y);
    }

    public String getColor() {
        return this.color;
    }
    public Point getLocation(){
        return this.point;
    }
    public int getX() {
        return point.getX();
    }
    public int getY(){
        return point.getY();
    }
    public String toString(){
        System.out.println(this.point.toString() + ", color: " +this.color );
        return null;
    }
    public Boolean equals(ColoringPoint cp){
        return this.color.equals(cp.color) && this.point.equals(cp.point);
    }
}
