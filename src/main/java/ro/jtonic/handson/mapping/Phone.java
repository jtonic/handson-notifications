package ro.jtonic.handson.mapping;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Phone {

  private final String number;
}
