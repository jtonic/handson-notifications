package ro.jtonic.handson.mapping;

import org.mapstruct.Mapper;

@Mapper
public interface AddressMapper {

  Address map(AddressDto addressDto);
}
