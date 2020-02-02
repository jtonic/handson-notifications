package ro.jtonic.handson.mapping;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Person {

  private final String name;
  private final String gender;
  private final Address address;
  private final Phone phone;
}
