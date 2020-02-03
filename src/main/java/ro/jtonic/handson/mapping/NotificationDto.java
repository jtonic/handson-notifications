package ro.jtonic.handson.mapping;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class NotificationDto {

  private final String firstName;
  private final String lastName;
  private final String profileId;
  private final String locale;
}
