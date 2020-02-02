package ro.jtonic.handson.mapping;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Address {

  private final String country;
}
