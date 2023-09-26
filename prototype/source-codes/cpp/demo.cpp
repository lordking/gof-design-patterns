#include <iostream>
#include <string>
#include <memory>

class Prototype {
public:
    virtual ~Prototype() {}
    virtual std::unique_ptr<Prototype> clone() const = 0;
};

class ConcretePrototype1 : public Prototype {
public:
    std::unique_ptr<Prototype> clone() const override {
        return std::make_unique<ConcretePrototype1>(*this);
    }
};

class ConcretePrototype2 : public Prototype {
public:
    std::unique_ptr<Prototype> clone() const override {
        return std::make_unique<ConcretePrototype2>(*this);
    }
};

int main() {
    std::unique_ptr<Prototype> prototype1 = std::make_unique<ConcretePrototype1>();
    std::unique_ptr<Prototype> copy1 = prototype1->clone();

    std::unique_ptr<Prototype> prototype2 = std::make_unique<ConcretePrototype2>();
    std::unique_ptr<Prototype> copy2 = prototype2->clone();

    return 0;
}
