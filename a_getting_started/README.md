# Getting Started and The Essentials

- [Getting Started and The Essentials](#getting-started-and-the-essentials)
  - [1. Apa itu Design Patterns?](#1-apa-itu-design-patterns)
  - [2. Getting Started with Java](#2-getting-started-with-java)
  - [3. Classes](#3-classes)

## 1. Apa itu Design Patterns?

Design patterns adalah solusi-solusi untuk masalah umum atau masalah yang sering muncul dalam pengembangan perangkat lunak. Design patterns membantu kita untuk merancang perangkat lunak berorientasi objek yang dapat digunakan kembali (reusable), dapat diperluas (extensible), dan dapat dipelihara (maintainable). Juga, dapat membantu para developer untuk berkomunikasi pada level abstrak. 

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
- `package` adalah kata kunci yang menunjukan dimana file ini didefinisikan.
- `public` berarti dapat di akses dari mana pun di dalam codebase kita.
- `static` berarti kita dapat memanggil method ini tanpa harus menginstansiasi sebuah objek dari kelas ini.
- `void` berarti method ini tidak mengembalikan nilai apapun.

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
