package controllers;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import entities.IMessage;
import play.mvc.Controller;
import play.mvc.Result;
import repositories.PersonRepository;

import java.util.Map;

public class PersonController extends Controller {
    private PersonRepository personRepository;
    private Map<String, IMessage> messageMap;

    @Inject
    public PersonController(
        @Named("personRepository") PersonRepository personRepository,
        @Named("messageMap") Map<String, IMessage> messageMap
    ) {
        this.personRepository = personRepository;
        this.messageMap = messageMap;
    }

    public Result getPersonName() {
        return ok(personRepository.getPersonName());
    }

    public Result getMessage(String language) {
        IMessage message = messageMap.get(language);
        return ok(message.getMessage());
    }
}
