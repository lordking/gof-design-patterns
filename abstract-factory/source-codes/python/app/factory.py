from abc import ABC, abstractmethod

from .product_a import ProductA
from .product_b import ProductB


class Factory(ABC):
    @abstractmethod
    def create_product_a(self) -> ProductA:
        pass

    @abstractmethod
    def create_product_b(self) -> ProductB:
        pass
