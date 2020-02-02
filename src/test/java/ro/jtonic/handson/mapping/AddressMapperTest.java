package ro.jtonic.handson.mapping;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddressMapperTest {

  @Test
  void map() {

    AddressMapper mapper = new AddressMapperImpl();
    final AddressDto addressDto = AddressDto.builder().country("Romania").build();
    final Address address = mapper.map(addressDto);

    Assertions.assertEquals(addressDto.getCountry(), address.getCountry());
  }
}