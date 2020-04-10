# Calculator.py - This program performs arithmetic, ( +. -, *. / ) on two numbers.
# Input:  Interactive
# Output:  Result of arithmetic operation

# Write performOperation function here

def performOperation(a, b, op):

    """ This function returns value after performing operation op on a and b """

    if op == '+':

        return a + b

    elif op == '-':

        return a - b

    elif op == '*':

        return a * b

    elif op == '/':

        return a / b;

if __name__ == '__main__':

    numberOne = int(input("Enter the first number: "))

    numberTwo = int(input("Enter the second number: "))

    operation = input("Enter an operator (+ - * /): ")

    # Call performOperation method here and store the value in "result"

    result = performOperation(numberOne, numberTwo, operation)

    print(str(numberOne) + " " + operation + " " + str(numberTwo) + " = " + str(result))

