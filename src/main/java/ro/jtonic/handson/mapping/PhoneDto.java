package ro.jtonic.handson.mapping;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PhoneDto {

  private final String number;
}
