package com.driver;
class A {
  String meth() {
    String str="Invoking method from class A";
    return str;
  }
}

class B extends A {
  String meth() {
    String str="Method is overridden in Extendend class B";
    return str;
  }
}
public class Main {
  public static void main(String[]args) {
    B b1=new B();
    b.meth();
  }
}
