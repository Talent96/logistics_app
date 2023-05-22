package logisticsAppShita.data.repository;

import logisticsAppShita.data.model.Event;

import java.util.List;

public interface EventRepository {
    Event save(Event event);
    void delete(Event event);
    void delete(int id);
    List<Event> events();
    Event findById(int id);

}
