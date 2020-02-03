# mapstruct 

## Introduction

Mapstruct is used to map java beans.
It is based on annotation processing tool - [APT](https://docs.oracle.com/javase/6/docs/technotes/guides/apt/index.html)

## Things to consider
- [x] Works fine with java 11
- [x] Works fine in combination with lombok
    - [x] maven
    - [x] intellij idea (rebuild the project whenever there is a modification to mapped java beans)
- [x] mapping values on different beans hierarchy depths (same type, same name)
- [x] Works fine with different names same type
- [x] 2 fields as source map in one field as target (firstName, lastName -> fullName)
- [x] 2 fields as source map in one field as target (firstName, lastName -> fullName) - with @AfterMapping
- [x] Running tests in spring containers slicing only the mapper bean
- [x] Favour immutability of the models
    - [x] Simple model example
    - [x] Notification based example   
- [x] dependency injection of many mappers in another mapper
- [ ] JsonNode mapping
- [ ] Works fine with classes generated for avro schema
- [ ] collections mapping
    - [ ] map 
- [ ] Generics collections
- [ ] Works fine with different type field mapping
    - [x] String <-> Locale
    - [ ] String <-> int
    - [ ] String <-> Integer
    - [ ] String <-> URI
    - [ ] String <-> custom type - Person
    - [ ] String <-> collection
- [ ] ... 

## (still) issues

- `@AfterMapping` doesn't work with immutable beans and builders
- Immutable builder based mapping doesn't work when using mapper to update the target
     See the issue [here](https://github.com/mapstruct/mapstruct/issues/1997). In 1.4.0 most probably this issue is gonna be fixed.

## Useful links

- Reference [documentation](https://mapstruct.org/documentation/stable/reference/html/)
- Baeldung [examples](https://www.baeldung.com/tag/mapstruct/)
