use std::sync::{Arc, Mutex};

pub struct Singleton {
    // private field to prevent direct instantiation
    _private: (),
}

impl Singleton {
    pub fn new() -> Arc<Mutex<Self>> {
        static mut INSTANCE: *const Singleton = 0 as *const Singleton;
        static ONCE: std::sync::Once = std::sync::Once::new();

        unsafe {
            ONCE.call_once(|| {
                let singleton = Singleton { _private: () };
                INSTANCE = std::mem::transmute(Box::new(singleton));
            });
            Arc::new(Mutex::new((*INSTANCE).clone()))
        }
    }
}