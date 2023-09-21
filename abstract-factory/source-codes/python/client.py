from app import ConcreteFactory1
from app import ConcreteFactory2


def main():
    """Client code that uses the abstract factory.
    """

    factory1 = ConcreteFactory1()
    product_a = factory1.create_product_a()
    product_a.show()
    product_b = factory1.create_product_b()
    product_b.display()

    factory2 = ConcreteFactory2()
    product_a = factory2.create_product_a()
    product_a.show()
    product_b = factory2.create_product_b()
    product_b.display()


if __name__ == "__main__":
    main()
