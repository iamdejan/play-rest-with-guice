package modules;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;
import com.google.inject.name.Names;
import entities.IMessage;
import entities.impl.EnglishMessage;
import entities.impl.IndonesianMessage;
import repositories.PersonRepository;
import repositories.impl.PersonRepositoryImpl;

public class Module extends AbstractModule {
    @Override
    protected void configure() {
        bind(PersonRepository.class).annotatedWith(Names.named("personRepository")).to(PersonRepositoryImpl.class).asEagerSingleton();

        MapBinder<String, IMessage> mapBinder = MapBinder.newMapBinder(
                binder(),
                String.class,
                IMessage.class,
                Names.named("messageMap")
        );
        mapBinder.addBinding("ENG").to(EnglishMessage.class);
        mapBinder.addBinding("IDN").to(IndonesianMessage.class);
    }
}
