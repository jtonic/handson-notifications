package ro.jtonic.handson.mapping;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper
public interface NotificationMapper {

  @Mapping(target = "fullName", ignore = true)
  @Mapping(source = "profileId", target = "profileId.id")
  Notification map(NotificationDto notificationDto);

  @AfterMapping
  default void mapToFullName(@MappingTarget Notification notification, NotificationDto notificationDto) {
    final String fullName = notificationDto.getFirstName() + " " + notificationDto.getLastName();
    notification.setFullName(fullName);
  }
}
