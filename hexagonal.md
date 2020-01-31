# Hexagonal architecture

## What's inside the hexagon

- domain model
- domain business
- at boundary
    - driver port (Interface)
    - driver port implementation (Class)
    - driven port (Interface)
    It is used by the hexagon business
    
## What's outside of the hexagon
- Driver adapter. 
    It depends on driver port interface, uses driver port impl (class)
- Driven adapter - it implements the driven port implementation and delegate the feature implementation to the technology/framework    
- the technology (framework, i.e. Spring)
- converters (mappers) between the outside world model and hexagonal business model

## Questions

- what about validation of the hexagonal business model? 
Is it ok to use a java specification for validation (could it be consider a good technology candidate for a hexagon insider)
- what about having cross cutting concerns inside the hexagon?
    - i.e. 
        - tracing the calls inside the hexagon
        - metrics inside the hexagon 
    - for this, proxy based support is needed, and spring offers a good support for this through AOP? 
    How hard is to keep all of this outside the hexagon with having hexagon internal to be bound to a specific library/framework. 
- does the command pattern fit this technology or it brings further complexity through further indirections
- would it be better to have the following structure for the hexagon?

```text
- [d] core
    - [d] boundary
        - [d] api (stands for the driver port interface)
        - [d] spi (stands for the driven port(s) interface(s))
        - api implementation class
    - [d] internal
        - [d] exception
        - [d] model
        - other classes related to business logic such as commands and commands handlers
```
> __Notes:__
> 
> [d] stands for directory 

## Hexagonal architecture online references

- [hexagonal architecture book](https://softwarecampament.wordpress.com/portsadapters/)
- [hexagonal architecture springmvc](https://medium.com/@BertilMuth/implementing-a-hexagonal-architecture-bcfbe0d63622)
- [hexagonal architecture by Alistair Cockburn](http://archive.is/5j2NI#selection-777.0-777.44)

## Java programming best practices

## Code conventions

- always use singular form of a noun for packages:
  - utils -> util, exceptions -> exception
- exception classes
