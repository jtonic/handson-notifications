package ro.jtonic.handson.arch.hexagon.notifications.adapter.spring.rest.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
@AllArgsConstructor
public class EmailNotificationResponse {

    private final String name;
}