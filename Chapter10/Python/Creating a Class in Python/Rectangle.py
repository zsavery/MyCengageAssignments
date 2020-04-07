# Rectangle.py


class Rectangle(object):

    # Declare public methods here
    def __init__(self, length, width):
        #Set class instance variables here
        self.length = length
        self.width = width

    def calculateArea(self):
        # Write calculateArea here
        area = self.width * self.length
        return (area)


    def calculatePerimeter(self):
        # Write calculatePerimeter here
        per = 2 * (self.width + self.length)
        return (per)
