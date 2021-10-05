## IOF (Inversion of control)
    Inversion of control- It means giving the control of creating and instantiating the spring beans to the Spring IOC container and the only work the developer does is configuring the beans in the spring xml file

## Dependency of Injection
    Dependency Injection is a fundamental aspect of the Spring framework, through which the Spring container “injects” objects into other objects or “dependencies”. Simply put, this allows for loose coupling of components and moves the responsibility of managing components onto the container.

## Bean scopes
    When you create a bean definition what you are actually creating is a recipe for creating actual instances of the class defined by that bean definition. The idea that a bean definition is a recipe is important, because it means that, just like a class, you can potentially have many object instances created from a single recipe.

   # Singleton 
        Scopes a single bean definition to a single object instance per Spring IoC container.

   # prototype
        Scopes a single bean definition to any number of object instances.

## Bean Life Cycle (Init and Destroy method)
    Spring bean is easy to understand. When a bean is instantiated, it may be required to perform some initialization to get it into a usable state. Similarly, when the bean is no longer required and is removed from the container, some cleanup may be required.