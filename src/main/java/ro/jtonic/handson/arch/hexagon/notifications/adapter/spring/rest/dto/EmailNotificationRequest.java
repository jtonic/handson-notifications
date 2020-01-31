package ro.jtonic.handson.arch.hexagon.notifications.adapter.spring.rest.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class EmailNotificationRequest {

    private String name;
    private String type;
    private String status;
}