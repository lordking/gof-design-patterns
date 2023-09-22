from abc import ABC, abstractmethod

class Model(ABC):
    @abstractmethod
    def operation(self):
        pass

class ConcreteModel(Model):
    def operation(self):
        print("Executing ConcreteModel operation.")

class AbstractFactory(ABC):
    @abstractmethod
    def create_model(self):
        pass

class ConcreteFactory(AbstractFactory):
    def create_model(self):
        return ConcreteModel()

if __name__ == '__main__':
    factory = ConcreteFactory()
    model = factory.create_model()
    model.operation()
