package ro.jtonic.handson.mapping;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = TestConfig.class, webEnvironment = WebEnvironment.NONE)
//@ContextConfiguration(classes = {TestConfig.class})
class NotificationMapperSpringTest {

  private static final String FIRST_NAME = "Antonel-Ernest";
  public static final String LAST_NAME = "Pazargic";
  public static final String PROFILE_ID = "profileId";

  @Autowired
  private NotificationMapper notificationMapper;

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