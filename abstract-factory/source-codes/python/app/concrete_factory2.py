from .factory import Factory

from .product_a import ProductA
from .product_b import ProductB

from .product_a2 import ProductA2
from .product_b2 import ProductB2


class ConcreteFactory2(Factory):
    def create_product_a(self) -> ProductA:
        return ProductA2()

    def create_product_b(self) -> ProductB:
        return ProductB2()
