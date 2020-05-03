package ro.jtonic.handson.mapping;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Person {

  public static final String STATUS_DEFAULT = "F..ED...1";
  public static final String ID_DEFAULT = "00001";

  private final String id;
  private final String name;
  private final String gender;
  private final Address address;
  private final Phone phone;
  private final String status;
}
