"""
SumAndProduct.py - This program computes sums and products.
Input:  Interactive.
Output:  Computed sum and product.
"""


# Write sums() function here.
def sums(n):
    result = 0
    for i in range(1, n+1):
        result += i
    return result

# Write products() function here.
def products(n):
    result = 1
    for i in range(1, n + 1):
        result *= i
    return result

numberString = input("Enter a positive integer or 0 to quit: ")
number = int(numberString)

while number != 0:
    # Call sums() function here.
    print(sums(number))
    # Call products() function here.
    print(products(number))

    numberString = input("Enter a positive integer or 0 to quit: ")
    number = int(numberString)
