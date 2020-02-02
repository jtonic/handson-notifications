package ro.jtonic.handson.mapping;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class NotificationDto {

  private String firstName;
  private String lastName;
  private String profileId;
}
