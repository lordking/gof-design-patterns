trait AbstractFactory {
    fn create_product_a(&self) -> Box<dyn ProductA>;
    fn create_product_b(&self) -> Box<dyn ProductB>;
}

struct ConcreteFactory1;
impl AbstractFactory for ConcreteFactory1 {
    fn create_product_a(&self) -> Box<dyn ProductA> {
        Box::new(ProductA1)
    }

    fn create_product_b(&self) -> Box<dyn ProductB> {
        Box::new(ProductB1)
    }
}

struct ConcreteFactory2;
impl AbstractFactory for ConcreteFactory2 {
    fn create_product_a(&self) -> Box<dyn ProductA> {
        Box::new(ProductA2)
    }

    fn create_product_b(&self) -> Box<dyn ProductB> {
        Box::new(ProductB2)
    }
}

trait ProductA {
    fn show(&self);
}

struct ProductA1;
impl ProductA for ProductA1 {
    fn show(&self) {
        println!("Product A1");
    }
}

struct ProductA2;
impl ProductA for ProductA2 {
    fn show(&self) {
        println!("Product A2");
    }
}

trait ProductB {
    fn display(&self);
}

struct ProductB1;
impl ProductB for ProductB1 {
    fn display(&self) {
        println!("Product B1");
    }
}

struct ProductB2;
impl ProductB for ProductB2 {
    fn display(&self) {
        println!("Product B2");
    }
}