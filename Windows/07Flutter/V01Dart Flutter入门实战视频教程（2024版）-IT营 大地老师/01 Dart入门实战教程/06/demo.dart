void main(List<String> args) {
  Dog dog = Dog();
  dog.eat();
}

abstract class Animal {
  eat();
}

class Dog extends Animal {
  @override
  eat() {
    // TODO: implement eat
    throw UnimplementedError();
  }
  
}
