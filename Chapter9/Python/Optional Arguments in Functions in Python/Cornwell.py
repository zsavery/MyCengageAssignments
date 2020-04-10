# Cornwall.py - This program computes hotel guest rates.
# Input:  Days in stay and meals included
# Output:  Hotel guest rate

# Write computeRate function here

def computeRate(days,code='0'):
    if code=='A':
        return 169*days
    elif code=='C':
        return 112*days
    else:
        return days*99.99
if __name__ == '__main__':
    rate = 0.00
    dayString = input("How many days do you plan to stay?: ")
    days = int(dayString)
    question = input("Do you want a meal plan? Y or N: ")
    if question == 'Y':
        code=input('Enter A for 3 meal per day plan, or C for only breakfast plan: ')
        rate=computeRate(days,code)
    else:
        rate=computeRate(days)
    print('The rate for your stay is: ${:.2f}'.format(rate))

    # Figure out which arguments to pass to the computeRate() function and 
    # then call the computeRate() function
