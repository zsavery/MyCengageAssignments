// This program uses the programmer-defined Motorcycle class.
#include "Motorcycle.cpp"
#include <iostream>
using namespace std;
int main()
{
    // Create Motorcycle objects here
    Motorcycle motorcycleOne;
    Motorcycle motorcycleTwo;

    // Create a boolean variable for side car status
    motorcycleOne.setSideCar(true);
    motorcycleTwo.setSideCar(false);

    // Set side car status here
    motorcycleOne.setSideCar(true);
    motorcycleTwo.setSideCar(false);
    // Set maximum speed here
    motorcycleOne.setMaxSpeed(90);
    motorcycleTwo.setMaxSpeed(85);
    // Set current speed here
    motorcycleOne.setSpeed(65);
    motorcycleTwo.setSpeed(60);
    //cout << motorcycleOne.getSpeed() << endl;
    // Accelerate motorcycles here

    motorcycleOne.accelerate(30);
    motorcycleTwo.accelerate(20);
    //cout << motorcycleOne.getSpeed() << endl;
    // Display current speed here
    cout << "The current speed of motorcycleOne is " << motorcycleOne.getSpeed() << endl;
    cout << "The current speed of motorcycleTwo is " << motorcycleTwo.getSpeed() << endl;
    // Determine side car status and display results.
    if (motorcycleOne.getSideCar())
    {
        cout << "This motorcycle has a side car\n";
    }
    else
    {
        cout << "This motorcycle has a side car\n";
    }

    if (motorcycleTwo.getSideCar())
    {
        cout << "This motorcycle does not have a side car\n";
    }
    else
    {
        cout << "This motorcycle does not have a side car\n";
    }
    return 0;
}
