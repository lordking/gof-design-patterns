trait Model {
    fn operation(&self);
}

struct ConcreteModel {}

impl Model for ConcreteModel {
    fn operation(&self) {
        println!("Executing ConcreteModel operation.");
    }
}

trait AbstractFactory {
    fn create_model(&self) -> Box<dyn Model>;
}

struct ConcreteFactory {}

impl AbstractFactory for ConcreteFactory {
    fn create_model(&self) -> Box<dyn Model> {
        Box::new(ConcreteModel{})
    }
}

fn main() {
    let factory: Box<dyn AbstractFactory> = Box::new(ConcreteFactory{});
    let model = factory.create_model();
    model.operation();
}