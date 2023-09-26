#[derive(Clone)]
struct Prototype {
    name: String,
}

impl Prototype {
    fn new(name: &str) -> Prototype {
        Prototype {
            name: name.to_string(),
        }
    }
}

fn main() {
    // 创建原型对象
    let prototype = Prototype::new("Prototype 1");

    // 克隆原型对象
    let clone1 = prototype.clone();
    let clone2 = prototype.clone();

    // 打印克隆对象的名称
    println!("Clone 1: {}", clone1.name);
    println!("Clone 2: {}", clone2.name);
}