from .factory import Factory

from .product_a import ProductA
from .product_b import ProductB
from .product_a1 import ProductA1
from .product_b1 import ProductB1


class ConcreteFactory1(Factory):
    def create_product_a(self) -> ProductA:
        return ProductA1()

    def create_product_b(self) -> ProductB:
        return ProductB1()
