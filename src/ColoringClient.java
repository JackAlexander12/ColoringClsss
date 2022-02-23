import java.awt.*;

public class ColoringClient{
    public static void main(String[] args){
        ColoringPoint CP_Blue = new ColoringPoint(1,2,"Blue");
        ColoringPoint CP_Orange = new ColoringPoint(1,2,"Orange");
        ColoringPoint CP_true = new ColoringPoint(1,2,"Blue");

        System.out.println(CP_Blue.equals(CP_Orange));
        System.out.println(CP_Blue.getColor());
        System.out.println(CP_Orange.getColor());
        System.out.println(CP_Blue.equals(CP_true));
    }
}
