class Circle:
    def __init__(self, r):
        self.radius = r

    def getArea(self):
        return 3.14*self.radius*self.radius

if __name__ == "__main__":
    c = Circle(20)
    print c.getArea()
