class Rectangle
{
	// Length of this rectangle.
     static double length;
	// Width of this rectangle.
     static double width;
	

	// Write set methods here.
	public void setLength(double len)
    {
        length = len;
    }
    public void setWidth(double wid)
    {
        width = wid;
    }
    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }
    public double calculateArea() 
    {
        double area = length * width;
        return area;
    }
    public double calculatePerimeter()
    {
        double per = 2*(length + width);
        return per;
    }


	// Write get methods here. 

	

	// Write the calculatePerimeter() and 
	// calculateArea() methods here. 
	
}
