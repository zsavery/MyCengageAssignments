// Motorcycle.cpp
#include "Vehicle.cpp"
#include <iostream>
using namespace std;

// Write the Motorcycle class here

class Motorcycle : public Vehicle
{
public:
    void setSideCar(bool);
    bool getSideCar();
    //void accelerate(double);

private:
    bool sideCar;
    //double  maxSpeed;
    //double  fuelCapacity;
    //double  currentSpeed;
};
bool Motorcycle::getSideCar()
{
    return sideCar;
}
void Motorcycle::setSideCar(bool sCar)
{
    sideCar = sCar;
    return;
}

// void Motorcycle::accelerate(double mph)
// {
//     if ((currentSpeed + mph) <= maxSpeed)
//         currentSpeed = currentSpeed + mph;
//     else
//         cout << "This motorcycle cannot go that fast." << endl;
// }
