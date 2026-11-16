package com.java.oops;

class Parent {
    static { System.out.println("Parent static block"); }
    { System.out.println("Parent instance block"); }
    public Parent() { System.out.println("Parent constructor"); }
}

class Child extends Parent {
    static { System.out.println("Child static block"); }
    { System.out.println("Child instance block"); }
    public Child() { System.out.println("Child constructor"); }
}

public class Constructors{
    public static void main(String[] args) {
        new Child();
    }
}



//Even If a Child Class has no constructors, the parent call constructor is called !
// Only one explicit constructor call allowed in constructor