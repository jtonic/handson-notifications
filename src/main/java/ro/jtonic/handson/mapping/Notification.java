package ro.jtonic.handson.mapping;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Notification {

  private final String fullName;
  private final ProfileId profileId;
}
