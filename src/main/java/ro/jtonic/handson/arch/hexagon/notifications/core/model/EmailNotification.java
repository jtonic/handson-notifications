package ro.jtonic.handson.arch.hexagon.notifications.core.model;

import java.util.StringJoiner;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Builder
public class EmailNotification {

    private final String name;
    private final String type;
    private final String status;

    @Override
    @Generated
    public String toString() {
        return new StringJoiner(", ", EmailNotification.class.getSimpleName() + "[", "]")
            .add("name='" + name + "'")
            .toString();
    }
}
