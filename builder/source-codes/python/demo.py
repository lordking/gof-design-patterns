class Product:
    def __init__(self):
        self.parts = []

    def add_part(self, part):
        self.parts.append(part)

    def show(self):
        print("Product parts:")
        for part in self.parts:
            print("- {}".format(part))


class Builder:
    def build_part_a(self)->None:
        pass

    def build_part_b(self)->None:
        pass
		
		def build_part_c(self)->None:
        pass

    def build(self)->Builder:
        pass


class ConcreteBuilder1(Builder):
    def __init__(self):
        self.product = Product()

    def build_part_a(self):
        self.product.add_part("Part A1")

    def build_part_b(self):
        self.product.add_part("Part B1")

		def build_part_c(self):
        self.product.add_part("Part C1")

    def build(self):
        return self.product


class ConcreteBuilder2(Builder):
    def __init__(self):
        self.product = Product()

    def build_part_a(self):
        self.product.add_part("Part A2")

    def build_part_b(self):
        self.product.add_part("Part B2")

		def build_part_c(self):
        self.product.add_part("Part C2")

    def build(self):
        return self.product


class Director:
    def __init__(self, builder):
        self.builder = builder

    def construct(self):
        self.builder.build_part_a()
        self.builder.build_part_b()

    def get_product(self):
        return self.builder.get_product()


# 使用范例
builder1 = ConcreteBuilder1()
director1 = Director(builder1)
director1.construct()
product1 = director1.build()
product1.show()

builder2 = ConcreteBuilder2()
director2 = Director(builder2)
director2.construct()
product2 = director2.build()
product2.show()