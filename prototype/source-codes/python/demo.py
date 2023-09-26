import copy

class Prototype:
    def clone(self):
        return copy.deepcopy(self)

class ConcretePrototype1(Prototype):
    pass

class ConcretePrototype2(Prototype):
    pass

if __name__ == '__main__':
    prototype1 = ConcretePrototype1()
    copy1 = prototype1.clone()

    prototype2 = ConcretePrototype2()
    copy2 = prototype2.clone()
