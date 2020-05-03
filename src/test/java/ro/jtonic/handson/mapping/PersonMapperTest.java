package ro.jtonic.handson.mapping;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ro.jtonic.handson.mapping.Person.ID_DEFAULT;
import static ro.jtonic.handson.mapping.Person.STATUS_DEFAULT;

import org.junit.jupiter.api.Test;

class PersonMapperTest {

  private static final AddressMapper addressMapper = new AddressMapperImpl();
  private static final PhoneMapper phoneMapper = new PhoneMapperImpl();
  private static final PersonMapper personMapper = new PersonMapperImpl(addressMapper, phoneMapper);

  @Test
  void map() {
    final PersonDto personDto = PersonDto.builder().name("Antonel-Ernest Pazargic").gender("male").build();
    final Person person = personMapper.map(personDto);
    assertEquals(personDto.getName(), person.getName());
  }

  @Test
  void testDefaults1() {
    final PersonDto personDto = PersonDto.builder()
        .name("Antonel-Ernest Pazargic")
        .gender("male")
        .build();
    final Person person = personMapper.map(personDto);

    assertThat(person.getName()).isEqualTo(personDto.getName());
    assertThat(person.getId()).isEqualTo(ID_DEFAULT);
    assertThat(person.getStatus()).isEqualTo(STATUS_DEFAULT);
  }
}
