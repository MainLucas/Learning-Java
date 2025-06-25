## Polimorfismo.
Polimorfismo em POO é a capacidade de um mesmo método ou ação ter comportamentos diferentes dependendo do objeto que o executa.

## Definição simplificada

> Polimorfismo é quando **um mesmo método funciona de formas diferentes** para objetos diferentes.

```java
class Animal {
    void fazerSom() {
        System.out.println("Som genérico");
    }
}

class Cachorro extends Animal {
    void fazerSom() {
        System.out.println("Au au!");
    }
}

class Gato extends Animal {
    void fazerSom() {
        System.out.println("Miau!");
    }
}
```
# Conhecimento extra.
## O que é `super`?
Na Programação Orientada a Objetos, especialmente em linguagens como Java, a palavra-chave **`super`** é usada para **acessar membros (métodos ou atributos) da classe pai (superclasse)** a partir de uma classe filha (subclasse).