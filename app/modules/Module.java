package modules;

import com.google.inject.AbstractModule;
import repositories.PersonRepository;
import repositories.impl.PersonRepositoryImpl;

public class Module extends AbstractModule {
    @Override
    protected void configure() {
        bind(PersonRepository.class).to(PersonRepositoryImpl.class).asEagerSingleton();
    }
}
