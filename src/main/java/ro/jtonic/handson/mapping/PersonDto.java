package ro.jtonic.handson.mapping;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PersonDto {

  private final String name;
  private final String gender;
  private final AddressDto address;
  private final PhoneDto phone;
}
