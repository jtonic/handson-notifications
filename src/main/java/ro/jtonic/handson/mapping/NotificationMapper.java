package ro.jtonic.handson.mapping;

import java.util.Locale;
import java.util.Locale.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface NotificationMapper {

  @Mapping(target = "fullName", expression = "java(notificationDto.getFirstName() + \" \" + notificationDto.getLastName())")
  @Mapping(source = "profileId", target = "profileId.id")
  Notification map(NotificationDto notificationDto);

  default Locale map(String locale) {
    if (locale == null) {
      return null;
    }
    final String localeStr = locale.replace('_', '-');
    return new Builder().setLanguageTag(localeStr).build();
  }
}
