**Immutability**



A String object can never change after creation. Methods like toUpperCase(), replace() and concat() return a new string and leave the original untouched.

Immutability is why strings are safe as HashMap keys, safe to share between threads, and safe to pool.



**The string pool**



String literals are stored in a shared pool inside the heap. If two literals have the same content, they share one object.



**== vs equals**



== compares references (are these the same object?). equals() compares content. For strings, you almost always want equals.



**Methods: pass-by-value**



Java always passes by value. For objects, the value is a copy of the reference. That has different consequences for strings and arrays



**Constructors**



A constructor has the class name, no return type, and runs when you use new. If you write none, the compiler adds a no-arg default constructor. If you write any constructor, the default one disappears.



**Initialization order for new Child():**



The class is loaded: parent static fields and blocks first, then child static ones (once per class).

Parent instance field initializers and instance blocks, then the parent constructor body.

Child instance field initializers and instance blocks, then the child constructor body.

Static blocks run once per class, in inheritance order, before any instance creation.

Instance blocks run every time an object is created, before the constructor.

The parent constructor always runs before the child’s instance blocks.



**Static blocks:** Perfect for one-time setup for the class (e.g., database driver registration).

**Instance blocks:** Great for shared initialization logic across constructors without duplication.



**Static blocks:** One-time setup for the class.

**Instance blocks:** Per-object setup before constructor.



**Calling an overridable method from a constructor:**

When you call an overridable method from a constructor, you might be calling a method that belongs to a subclass — but the subclass’s fields may not yet be initialized!

This can lead to null values, incomplete state, or even runtime errors.



**Inheritance**



Java allows a class to extend only one superclass, but it can implement multiple interfaces.

Even if you don’t write extends Object, every class inherits from java.lang.Object. All classes get methods like toString(), equals(), hashCode() from Object.

Constructors aren’t inherited



**Inheritance:** Child is a type of Parent.

**Composition:** Class contains another class as a field.



**ARRAYDEQUE** is preferred instead of **STACK**. 

STACK is a legacy class from vector which its methods are synchronized so it adds locking overhead. So Deque can be used when its single-threaded.







