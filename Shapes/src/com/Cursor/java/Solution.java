package com.Cursor.java;



import java.util.ArrayList;
;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        List<Shape> theMainShape = new ArrayList<>();

        Vertex2D radius = new Vertex2D(4, 9);
        Rectangle Rectangle = new Rectangle(radius, 2, 4);

        Vertex2D firstVerticesOfTriangle  = new  Vertex2D(1, 3);
        Vertex2D secondVerticesOfTriangle = new  Vertex2D(4, 8);
        Vertex2D thirdVerticesOfTriangle = new  Vertex2D(5, 2);
        Triangle Triangle = new Triangle(firstVerticesOfTriangle, secondVerticesOfTriangle, thirdVerticesOfTriangle);

        Circle getCircle = new Circle(radius, 8);

        Vertex3D main = new  Vertex3D(4, 7, 1);
        Sphere Sphere = new Sphere(main, 5);

        Cuboid Cuboid = new Cuboid(main, 4, 3.5, 8);

        SquarePyramid Pyramid = new SquarePyramid(main, 5, 3);


        theMainShape.add(Rectangle);
        theMainShape.add(Triangle);
        theMainShape.add(Circle);
        theMainShape.add(Sphere);
        theMainShape.add(Cuboid);
        theMainShape.add(Pyramid);

        for (Shape figures : theMainShape) {
            System.out.println(figures);
        }
    }

    }




