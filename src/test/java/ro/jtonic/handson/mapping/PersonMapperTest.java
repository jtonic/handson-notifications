package ro.jtonic.handson.mapping;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonMapperTest {

  @Test
  void map() {

    PersonMapper mapper = new PersonMapperImpl();
    final PersonDto personDto = PersonDto.builder().name("Antonel-Ernest Pazargic").gender("male").build();
    final Person person = mapper.map(personDto);

    Assertions.assertEquals(personDto.getName(), person.getName());
  }
}