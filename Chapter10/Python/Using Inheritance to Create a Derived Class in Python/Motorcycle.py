class Motorcycle(object):
    def __init__(self, maxSpeed, speed, sidecar):
        self.sidecar = sidecar
        self.maxSpeed = maxSpeed
        self.speed = speed

    def accelerate(self, accelerate):
        self.accelerate = accelerate
        if (self.speed + self.accelerate) > self.maxSpeed:
            print("This motorcycle cannot go that fast")
        else:
            self.speed += self.accelerate

