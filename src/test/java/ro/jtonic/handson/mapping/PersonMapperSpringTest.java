package ro.jtonic.handson.mapping;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = MappersTestConfig.class, webEnvironment = WebEnvironment.NONE)
//@ContextConfiguration(classes = {TestConfig.class})
class PersonMapperSpringTest {

  public static final String NAME = "Antonel-Ernest Pazargic";
  public static final String GENDER = "MALE";

  @Autowired
  private PersonMapper personMapper;

  @Test
  void map() {
    final AddressDto address = AddressDto.builder().build();
    final PersonDto personDto = PersonDto.builder()
        .name(NAME)
        .gender(GENDER)
        .address(address)
        .build();

    final Person person = personMapper.map(personDto);
    assertEquals(personDto.getName(), person.getName());
    assertEquals(personDto.getGender(), person.getGender());
    assertEquals(personDto.getAddress().getCountry(), person.getAddress().getCountry());
  }
}
