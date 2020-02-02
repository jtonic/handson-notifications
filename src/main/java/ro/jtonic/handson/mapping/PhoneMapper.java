package ro.jtonic.handson.mapping;

import org.mapstruct.Mapper;

@Mapper
public interface PhoneMapper {

  Phone map(PhoneDto phoneDto);
}
