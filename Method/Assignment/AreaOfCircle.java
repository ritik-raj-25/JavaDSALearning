package Method.Assignment;

import java.util.Scanner;

class Area {
    float circleArea(float r){
        float area = (float)Math.PI * r * r;
        return area;
    }
}

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter radius of the circle:");
        int r = scan.nextInt();
        Area a = new Area();
        float area = a.circleArea(r);
        System.out.println("Area of circle with radius "+r+" is:"+area);
        scan.close();
    }
}
