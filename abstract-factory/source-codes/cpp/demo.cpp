#include <iostream>

class ProductA {
public:
    virtual void show() = 0;
};

class ProductA1 : public ProductA {
public:
    void show() override {
        std::cout << "Product A1" << std::endl;
    }
};

class ProductA2 : public ProductA {
public:
    void show() override {
        std::cout << "Product A2" << std::endl;
    }
};

class ProductB {
public:
    virtual void display() = 0;
};

class ProductB1 : public ProductB {
public:
    void display() override {
        std::cout << "Product B1" << std::endl;
    }
};

class ProductB2 : public ProductB {
public:
    void display() override {
        std::cout << "Product B2" << std::endl;
    }
};

class AbstractFactory {
public:
    virtual ProductA* createProductA() = 0;
    virtual ProductB* createProductB() = 0;
};

class ConcreteFactory1 : public AbstractFactory {
public:
    ProductA* createProductA() override {
        return new ProductA1();
    }

    ProductB* createProductB() override {
        return new ProductB1();
    }
};

class ConcreteFactory2 : public AbstractFactory {
public:
    ProductA* createProductA() override {
        return new ProductA2();
    }

    ProductB* createProductB() override {
        return new ProductB2();
    }
};