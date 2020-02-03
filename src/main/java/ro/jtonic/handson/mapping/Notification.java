package ro.jtonic.handson.mapping;

import java.util.Locale;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Notification {

  private final String fullName;
  private final ProfileId profileId;
  private final Locale locale;
}
