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
- [ ] Simple/Multiple 'uses' in the same mapping
- [ ] Works fine with classes generated for avro schema
- [ ] Works fine with different type field mapping
    - [ ] String <-> int
    - [ ] String <-> Integer
    - [ ] String <-> URI
    - [ ] String <-> custom type - Person
    - [ ] String <-> collection
- [ ] ... 

## Useful links

- Reference [documentation](https://mapstruct.org/documentation/stable/reference/html/)
- Baeldung [examples](https://www.baeldung.com/tag/mapstruct/)
