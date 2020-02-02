package ro.jtonic.handson.mapping;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(uses = { AddressMapper.class, PhoneMapper.class }, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface PersonMapper {

  Person map(PersonDto personDto);
}
