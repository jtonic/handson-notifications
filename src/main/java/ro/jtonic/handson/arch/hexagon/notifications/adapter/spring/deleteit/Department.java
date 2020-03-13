package ro.jtonic.handson.arch.hexagon.notifications.adapter.spring.deleteit;

import java.util.Map;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(Printable.class)
public class Department {

  private Map<String, Printable> printers;

  public Department(
      final Map<String, Printable> printers) {

      this.printers = printers;
  }

  public void printAll() {
    for (Printable printer : printers.values()) {
      printer.print("This is it");
    }
  }
}
