// Rectangle.cpp

#include <iostream>
using namespace std;
class Rectangle
{
public:
    // Declare public methods here
    void setLength(double);
    void setWidth(double);
    double getLength();
    double getWidth();
    double calculateArea();
    double calculatePerimeter();

private:
    // Create length and width here
    double length, width;
};

void Rectangle::setLength(double len)
{
    length = len;
}

void Rectangle::setWidth(double wid)
{
    // write setWidth here
    width = wid;
}

double Rectangle::getLength()
{
    // write getLength here
    double len = 0;
    cout << "Enter length: ";
    cin >> len;
    cout << endl;
    return len;
}

double Rectangle::getWidth()
{
    // write getWidth here
    double wid = 0;
    cout << "Enter width: ";
    cin >> wid;
    cout << endl;
    return wid;
}

double Rectangle::calculateArea()
{
    // write calculateArea here
    return (width * length);
}

double Rectangle::calculatePerimeter()
{
    // write calculatePerimeter here
    return (2 * (width + length));
}
