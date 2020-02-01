package ro.jtonic.handson.mapping;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NotificationMapperTest {

  public static final String PROFILE_ID = "profileId";

  private static final NotificationMapper notificationMapper = new NotificationMapperImpl();

  @Test
  void map() {
    final NotificationDto notificationDto = NotificationDto.builder().profileId(PROFILE_ID).build();
    final Notification notification = notificationMapper
        .map(notificationDto);

    assertEquals(notificationDto.getProfileId(), notification.getProfileId().getId());
  }
}