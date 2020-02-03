package ro.jtonic.handson.mapping;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Set;
import org.junit.jupiter.api.Test;

class NotificationMapperTest {

  private static final String FIRST_NAME = "Antonel-Ernest";
  public static final String LAST_NAME = "Pazargic";
  public static final String PROFILE_ID = "profileId";
  public static final String LOCALE1 = "en_US";
  public static final String LOCALE2 = "en-US";

  private static final NotificationMapper notificationMapper = new NotificationMapperImpl();

  @Test
  void map() {
    final NotificationDto notificationDto = NotificationDto.builder()
        .firstName(FIRST_NAME)
        .lastName(LAST_NAME)
        .profileId(PROFILE_ID)
        .locale(LOCALE2)
        .build();
    final Notification notification = notificationMapper
        .map(notificationDto);

    assertThat(notificationDto.getFirstName() + " " + notificationDto.getLastName()).isEqualTo(notification.getFullName());
    assertThat(notificationDto.getProfileId()).isEqualTo(notification.getProfileId().getId());
    assertThat(Set.of(LOCALE1, LOCALE2)).contains(notification.getLocale().toString());
  }
}