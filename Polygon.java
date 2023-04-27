
/**
* Name: Tyler Vilallobos villalot
* Course: CSCI-241 - Computer Science I
* Section: 001
* Assignment: 9
*
* Project/Class Description: Polygon class has 2 constructors, one default and one 
* that takes 2 parameters, a double for the length and an int for the sides.
* There is a counter for how many polygon objects have been created and 
* a counter for the amount of times a polygon has been changed.
* Includes getters for sides, length, amount of polygons made 
* and changes made to the polygon.
* Includes setters for sides and length.
* Includes methods to find the area and perimeter of the polygon
* and a method to compare if 2 polygon objects have the same values
* and includes a toString method.
* 
* Known Bugs: none.
*/
public class Polygon
{
    public static final double DEFAULT_SIDE_LENGTH = 10.0;
    public static final int DEFAULT_SIDE_COUNT = 4;
    private static int count = 0;
    private static int changes = 0;
    private double length;//length of the sides in centimeters
    private int sides;//number of sides in the polygon
    
    //Default constructor for objects of class Polygon
    public Polygon()
    {
        this.length = DEFAULT_SIDE_LENGTH;
        this.sides = DEFAULT_SIDE_COUNT;
        count++;
        
    }
    //Constructor for custom polygons
    public Polygon(double len, int side){
        this.length = len;
        this.sides = side;
        count++;
    }
    
    public static int getCount(){
        return count;
    }
    
    public static int getChanges(){
        return changes;
    }
    
    public double getLength(){
        return length;
    }
    
    public int getSides(){
        return sides;
    }
    
    public void setLength(double length){
        this.length = length;
        changes++;
    }
    
    public void setSides(int sides){
        if(sides >= 3 && sides <= 10){
        this.sides = sides;
        changes++;
        }
        else System.out.println("Error: invalid input. Sides must be between 3 and 10, inclusive");
        
    }
    
    public double findPerimeter(){
        double perimeter = this.length * this.sides;
        return perimeter;
    }
    
    public double findArea(){
        double lengthSqred = this.length * this.length;
        double numerator = this.sides * lengthSqred;
        double denominator = 4 * Math.tan(Math.PI/this.sides);
        double area = numerator / denominator;
        return area;
    }
    
    public String toString(){
        String info = new String();
        switch (this.sides){
            case 3: info = "tetragon with 3 sides of length "; break;
            case 4: info = "square with 4 sides of length ";break;
            case 5: info = "pentagon with 5 sides of length ";break;
            case 6: info = "hexagon with 6 sides of length ";break;
            case 7: info = "heptagon with 7 sides of length ";break;
            case 8: info = "octagon with 8 sides of length ";break;
            case 9: info = "nonagon with 9 sides of length ";break;
            case 10: info = "decagon with 10 sides of length ";break;
        }
        info = String.format("%s" + "%4.2f", info, this.length);
        return info;
    }
    
    public boolean equals(Polygon p){
        if(Math.abs(this.length - p.length) <= 0.01 && p.sides == this.sides)
        return true;
        else return false;
    }
}


