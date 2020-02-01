package ro.jtonic.handson.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface NotificationMapper {

  @Mapping(source = "name", target = "lastName")
  @Mapping(source = "profileId", target = "profileId.id")
  Notification map(NotificationDto notificationDto);
}
