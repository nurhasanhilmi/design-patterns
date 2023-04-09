# Getting Started and The Essentials

- [Getting Started and The Essentials](#getting-started-and-the-essentials)
  - [1. Introduction](#1-introduction)
  - [2. Getting Started with Java](#2-getting-started-with-java)
  - [3. Classes](#3-classes)
  - [4. Coupling](#4-coupling)
  - [5. Interfaces](#5-interfaces)
  - [6. Encapsulation](#6-encapsulation)
  - [7. Abstraction](#7-abstraction)
  - [8. Inheritance](#8-inheritance)
  - [9. Polymorphism](#9-polymorphism)
  - [10. UML](#10-uml)

## 1. Introduction

Untuk dapat lebih memahami bagaimana pattern-pattern yang ada, contoh-contoh akan dijelaskan dengan menggunakan bahasa pemrograman `Java`. Dan bagian-bagian di bawah ini adalah hal-hal yang penting untuk dipahami terlebih dahulu.

## 2. Getting Started with Java

Perhatikan file `Main.java` berikut:
```java
package com.hilmi;

public class Main {
    public static void main(String[] args) {
        // write your code here
    }
}
```
Setiap java program memiliki satu `file` utama dengan nama `class` yang sama, dalam hal ini adalah `Main`. Di dalam file ini terdapat `method` bernama `main` yang mana akan dieksekusi pertama kali ketika program dijalankan. Berikut kata kunci penting untuk dimengerti:
- `package` menunjukan dimana suatu file atau class didefinisikan.
- `public` menunjukan suatu entitas (class/method/attribute) dapat di akses dari mana pun di dalam codebase kita.
- `static` berarti kita dapat memanggil suatu entitas tanpa harus menginstansiasi sebuah objek dari class.
- `void` menunjukan suatu method tidak mengembalikan nilai apapun.

## 3. Classes
`User.java`:
```java
package com.hilmi;

public class User {
    // Fields (attributes)
    public String name;
    
    // Methods
}
```

`Main.java`:
```java
package com.hilmi;

public class Main {
    public static void main(String[] args) {
        User user = new User();
    }
}
```

## 4. Coupling

## 5. Interfaces

## 6. Encapsulation

## 7. Abstraction

## 8. Inheritance

## 9. Polymorphism

## 10. UML