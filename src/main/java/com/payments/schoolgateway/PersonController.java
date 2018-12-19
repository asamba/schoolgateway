package com.payments.schoolgateway;

import com.payments.schoolgateway.domain.Person;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {

    @GetMapping("/{id}")
    public Person get (@PathVariable(name="id") long id){

        System.out.println("the id supplied by the user is : =======> " + id );

        Person person = new Person();
        person.setAge(42);
        person.setFirstName("Anand");
        person.setLastName("Sambamoorthy");
        person.setId(1);

        return person;
    }

    @PostMapping
    public void newPerson(@RequestBody Person person){

        System.out.println(person);

    }


}
