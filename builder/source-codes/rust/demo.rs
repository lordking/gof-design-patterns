struct Product {
    parts: Vec<String>,
}

impl Product {
    fn new() -> Self {
        Product { parts: Vec::new() }
    }

    fn add_part(&mut self, part: &str) {
        self.parts.push(part.to_string());
    }

    fn show(&self) {
        println!("Product parts:");
        for part in &self.parts {
            println!("- {}", part);
        }
    }
}

trait Builder {
    fn build_part_a(&mut self)->Builder;
    fn build_part_b(&mut self)->Builder;
		fn build_part_c(&mut self)->Builder;
    fn build(&self) -> Product;
}

struct ConcreteBuilder1 {
    product: Product,
}

impl ConcreteBuilder1 {
    fn new() -> Self {
        ConcreteBuilder1 { product: Product::new() }
    }
}

impl Builder for ConcreteBuilder1 {
    fn build_part_a(&mut self) {
        self.product.add_part("Part A1");
    }

    fn build_part_b(&mut self) {
        self.product.add_part("Part B1");
    }

    fn get_product(&self) -> Product {
        self.product.clone()
    }
}

struct ConcreteBuilder2 {
    product: Product,
}

impl ConcreteBuilder2 {
    fn new() -> Self {
        ConcreteBuilder2 { product: Product::new() }
    }
}

impl Builder for ConcreteBuilder2 {
    fn build_part_a(&mut self) {
        self.product.add_part("Part A2");
    }

    fn build_part_b(&mut self) {
        self.product.add_part("Part B2");
    }

    fn get_product(&self) -> Product {
        self.product.clone()
    }
}

struct Director {
    builder: Box<dyn Builder>,
}

impl Director {
    fn new(builder: Box<dyn Builder>) -> Self {
        Director { builder }