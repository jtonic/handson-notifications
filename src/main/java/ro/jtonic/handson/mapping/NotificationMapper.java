package ro.jtonic.handson.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface NotificationMapper {

  @Mapping(target = "fullName", expression = "java(notificationDto.getFirstName() + \" \" + notificationDto.getLastName())")
  @Mapping(source = "profileId", target = "profileId.id")
  Notification map(NotificationDto notificationDto);

}
