package modules;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import repositories.PersonRepository;
import repositories.impl.PersonRepositoryImpl;

public class Module extends AbstractModule {
    @Override
    protected void configure() {
        bind(PersonRepository.class).annotatedWith(Names.named("xxx")).to(PersonRepositoryImpl.class).asEagerSingleton();
    }
}
