# Design Patterns

- [Design Patterns](#design-patterns)
  - [1. Getting Started](#1-getting-started)
    - [Apa itu Design Patterns?](#apa-itu-design-patterns)
  - [2. The Essentials](#2-the-essentials)
    - [Getting Started with Java](#getting-started-with-java)

## 1. Getting Started

### Apa itu Design Patterns?

Design patterns adalah solusi-solusi untuk masalah umum atau masalah yang sering muncul dalam pengembangan perangkat lunak. Design patterns membantu kita untuk merancang perangkat lunak berorientasi objek yang dapat digunakan kembali (reusable), dapat diperluas (extensible), dan dapat dipelihara (maintainable). Juga, dapat membantu para developer untuk berkomunikasi pada level abstrak.

## 2. The Essentials

### Getting Started with Java

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
