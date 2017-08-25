# Design Patterns in Java

This repo contains a series of Design Patterns examples written in Java. They are taken from Bryan Hansen's design patterns courses on PluralSight:
https://app.pluralsight.com/library/courses/design-patterns-java-behavioral/table-of-contents
https://app.pluralsight.com/library/courses/design-patterns-java-structural/table-of-contents
https://app.pluralsight.com/library/courses/design-patterns-java-creational/table-of-contents

## Creational

* Builder
    * Handles the construction of objects that may contain a lot of parameters and want to make the object immutable once we’re done constructing it.
* Factory
    * Creational pattern that doesn’t expose instantiation logic -it does this by deferring instantiation logic to a subclass. The client only knows about a common interface that the factory exposes.
* Prototype
    * Used when the type of object to create is determined by a prototypical instance which is cloned to produce a new instance. Often this is used to get a unique instance of the same object.
* Singleton
    * Guarantees one instance of a class will be created; and the control of that resource -can be lazy loaded.

## Structural

* Adapter
    * Concerned with connecting new code to legacy code without having to change the working contract that was produced from the legacy code originally.
* Bridge
    * Similar to adapter, but working with new code instead of legacy code.
* Composite
    * Hierarchical type pattern that deals with tree structures of information.
* Decorator
    * Hierarchical type pattern that builds functionality at each level while using composition from similar data types.
* Flyweight
    * Minimizes memory use by sharing data with similarly typed objects.
* Proxy
    * Acts as an interface to something else.

## Behavioral

* Interpreter
    * Provide navigation without exposing the structure of an object.
* Mediator
    * Used to define how objects interact with one another without having them refer to each other explicitly.
* Memento
    * Used to externalize an object’s state, usually to provide rollback functionality.
* Observer
    * A decoupling pattern when we have a subject that needs to be observed by one or more observers.
* Strategy
    * Used when you want to enable the strategy (or algorithm) to be selected at runtime.
* Template
    * Define an algorithm that allows subclasses to redefine parts of the algorithm without changing its structure.
* Visitor
    * A great way to separate an algorithm from an object structure.
