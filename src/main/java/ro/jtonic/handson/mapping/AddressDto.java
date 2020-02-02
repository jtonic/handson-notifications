package ro.jtonic.handson.mapping;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AddressDto {

  private final String country;
}
