package controllers;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import play.mvc.Controller;
import play.mvc.Result;
import repositories.PersonRepository;

public class PersonController extends Controller {
    private PersonRepository personRepository;

    @Inject
    public PersonController(@Named("xxx") PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Result getPersonName() {
        return ok(personRepository.getPersonName());
    }
}
