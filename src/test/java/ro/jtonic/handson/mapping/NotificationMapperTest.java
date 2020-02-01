package ro.jtonic.handson.mapping;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NotificationMapperTest {

  private static final String FIRST_NAME = "Antonel-Ernest";
  public static final String LAST_NAME = "Pazargic";
  public static final String PROFILE_ID = "profileId";

  private static final NotificationMapper notificationMapper = new NotificationMapperImpl();

  @Test
  void map() {
    final NotificationDto notificationDto = NotificationDto.builder()
        .firstName(FIRST_NAME)
        .lastName(LAST_NAME)
        .profileId(PROFILE_ID)
        .build();
    final Notification notification = notificationMapper
        .map(notificationDto);

    assertEquals(notificationDto.getFirstName() + " " + notificationDto.getLastName(), notification.getFullName());
    assertEquals(notificationDto.getProfileId(), notification.getProfileId().getId());
  }
}