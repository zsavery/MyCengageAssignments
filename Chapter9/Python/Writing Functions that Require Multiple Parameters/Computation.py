#Computation.py - This program calculates sum, difference, and product of two values.


# Call calculateProduct
# Input: Interactive
# Output: Sum, difference, and product of two values.

# Write calculateSum function here
def calculateSum(x,y):
    a = x + y;
    return a
# Write calculateDifference function here
def calculateDifference(x,y):
    b = x - y;
    return b
# Write calculateProduct function here
def calculateProduct(x,y):
    c = x * y;
    return c

value1 = int(input("Enter first numeric value: "))
value2 = int(input("Enter second numeric value: "))
    
# Call calculateSum
print("The Sum of the given values is",calculateSum(value1,value2));
# Call calculateDifference
print("The Difference of the given values is",calculateDifference(value1,value2));
# Call calculateProduct
print("The Product of the given values is",calculateProduct(value1,value2));
