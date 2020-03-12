package controllers;

import com.google.inject.Inject;
import play.mvc.Controller;
import play.mvc.Result;
import repositories.PersonRepository;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private PersonRepository personRepository;

    @Inject
    public HomeController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Result getPersonName() {
        return ok(personRepository.getPersonName());
    }

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }

}
