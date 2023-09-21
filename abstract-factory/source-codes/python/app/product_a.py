from abc import ABC, abstractmethod


class ProductA(ABC):
    @abstractmethod
    def show(self):
        pass
