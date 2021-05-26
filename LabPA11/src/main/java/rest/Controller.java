package rest;

import entity.Person;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/people")
public class Controller {

    final
    Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Person> getAll() {
        return service.getAll();
    }

    @PostMapping("/")
    private String add(@RequestBody Person person) {
        service.add(person);
        return person.getId();
    }

    @DeleteMapping("/{personID}")
    private void delete(@PathVariable("personID") String id) {
        service.delete(id);
    }

    @PutMapping("/")
    private void update(@RequestBody Person person) {
        service.update(person);
    }

}
