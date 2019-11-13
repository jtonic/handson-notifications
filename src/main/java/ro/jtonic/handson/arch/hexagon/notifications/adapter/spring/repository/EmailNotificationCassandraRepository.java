package ro.jtonic.handson.arch.hexagon.notifications.adapter.spring.repository;

import org.springframework.stereotype.Repository;
import ro.jtonic.handson.arch.hexagon.notifications.core.model.EmailNotification;
import ro.jtonic.handson.arch.hexagon.notifications.core.spi.EmailNotificationRepository;

@Repository
public class EmailNotificationCassandraRepository implements EmailNotificationRepository {

    @Override
    public void save(EmailNotification notification) {
        // TODO save to cassandra
    }
}