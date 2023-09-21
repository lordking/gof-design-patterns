#include <iostream>
#include <vector>
using namespace std;

class Product {
public:
    void addPart(const string& part) {
        parts.push_back(part);
    }

    void show() {
        cout << "Product parts:" << endl;
        for (const auto& part : parts) {
            cout << "- " << part << endl;
        }
    }

private:
    vector<string> parts;
};

class Builder {
public:
    virtual void buildPartA() = 0;
    virtual void buildPartB() = 0;
    virtual Product getProduct() = 0;
};

class ConcreteBuilder1 : public Builder {
public:
    void buildPartA() override {
        product.addPart("Part A1");
    }

    void buildPartB() override {
        product.addPart("Part B1");
    }

    Product getProduct() override {
        return product;
    }

private:
    Product product;
};

class ConcreteBuilder2 : public Builder {
public:
    void buildPartA() override {
        product.addPart("Part A2");
    }

    void buildPartB() override {
        product.addPart("Part B2");
    }

    Product getProduct() override {
        return product;
    }

private:
    Product product;
};

class Director {
public:
    void setBuilder(Builder* builder) {
        this->builder = builder;
    }

    void construct() {
        builder->buildPartA();
        builder->buildPartB();
    }

    Product getProduct() {
        return builder->getProduct();
    }

private:
    Builder* builder;
};

// 使用范例
int main() {
    ConcreteBuilder1 builder1;
    Director director1;
    director1.setBuilder(&builder1);
    director1.construct();
    Product product1 = director1.getProduct();
    product1.show();

    ConcreteBuilder2 builder2;
    Director director2;
    director2.setBuilder(&builder2);
    director2.construct();
    Product product2 = director2.getProduct();
    product2.show();

    return 0;
}