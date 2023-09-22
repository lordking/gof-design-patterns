#include <iostream>
using namespace std;

// Abstract Product
class Product {
public:
    virtual void operation() = 0;
};

// Concrete Product
class ConcreteProduct : public Product {
public:
    void operation() {
        cout << "Executing ConcreteProduct operation." << endl;
    }
};

// Abstract Factory
class Factory {
public:
    virtual Product* createProduct() = 0;
};

// Concrete Factory
class ConcreteFactory : public Factory {
public:
    Product* createProduct() {
        return new ConcreteProduct();
    }
};

int main() {
    Factory* factory = new ConcreteFactory();
    Product* product = factory->createProduct();
    product->operation();

    delete product;
    delete factory;

    return 0;
}