package ro.jtonic.handson.mapping;

import org.mapstruct.Mapper;

@Mapper
public interface PersonMapper {

  Person map(PersonDto personDto);
}
