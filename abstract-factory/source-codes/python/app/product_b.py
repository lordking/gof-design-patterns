from abc import ABC, abstractmethod


class ProductB(ABC):
    @abstractmethod
    def display(self):
        pass
