package ro.jtonic.handson.mapping;

import static ro.jtonic.handson.mapping.Person.STATUS_DEFAULT;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = { AddressMapper.class, PhoneMapper.class }, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface PersonMapper {

  @Mapping(target = "id", constant = "00001")
  @Mapping(target = "status", constant = STATUS_DEFAULT)
  Person map(PersonDto personDto);
}
