# GoF设计模式

用Java、Python、Rust、C++四种编程语言编写的GoF设计模式样例代码。有关每个设计模式的笔记在Notion笔记中，其中包含与DDD设计模式组合使用的工程实践。


## 1 环境准备

### 1.1 开发环境

使用前，请确保本地环境已经安装以下开发环境。如果版本低于如下要求，不保障代码能够正常编译或运行。

Java

- JDK 1.8.0_345
- Maven 3.8.6

Python

- Python 3.11.4
- Conda 23.5.2

Rust开发环境

- Rust 1.64.0
- cargo 1.64.0c

C++开发环境（除Windows外，其他都是操作系统自带）

- 苹果操作系统自带：g++(14.0.3)

### 1.2 开发工具

开发工具：[Visual Studio Code](https://code.visualstudio.com/)

Visual Studio Code插件

- [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
- [Python](https://marketplace.visualstudio.com/items?itemName=ms-python.python)
- [autoDocstring](https://marketplace.visualstudio.com/items?itemName=njpwerner.autodocstring)
- [autopep8](https://marketplace.visualstudio.com/items?itemName=ms-python.autopep8)
- [Python Indent](https://marketplace.visualstudio.com/items?itemName=KevinRose.vsc-python-indent)
- [Rust](https://marketplace.visualstudio.com/items?itemName=rust-lang.rust-analyzer)
- [C/C++ Extension Pack](https://marketplace.visualstudio.com/items?itemName=ms-vscode.cpptools-extension-pack)
- [PlantUML](https://marketplace.visualstudio.com/items?itemName=jebbs.plantuml)
- [Draw.io Integration](https://marketplace.visualstudio.com/items?itemName=hediet.vscode-drawio)
- [Markdown All in One](https://marketplace.visualstudio.com/items?itemName=yzhang.markdown-all-in-one)


## 2 索引

| 设计模式 | Notion笔记   | 源代码   |
| -------- | ------ | ------ |
| 抽象工厂 | [📒点击链接](https://lordking.notion.site/df43fb8290934bb38ee3a0ab737ebc9c?pvs=4) | [🔗点击链接](./abstract-factory/README.md) |
| 生成器   | [📒点击链接](https://lordking.notion.site/db4b53739e974e9aa02d8aa8b276cd60?pvs=4) | [🔗点击链接](./builder/README.md) |
| 工厂方法 | [📒点击链接](https://lordking.notion.site/a12f6fd7a5c8463992280985dccb0dcf?pvs=4) | [🔗点击链接](./factory-method/README.md) |

## 3 参考资料

- [《设计模式：可复用面向对象软件的基础》](https://book.douban.com/subject/1052241/)
- [《Head First设计模式》](https://book.douban.com/subject/2243615/)
- [《领域驱动设计：软件核心复杂性应对之道》](https://book.douban.com/subject/5344973/)
- [iluwatar/java-design-patterns](https://github.com/iluwatar/java-design-patterns)