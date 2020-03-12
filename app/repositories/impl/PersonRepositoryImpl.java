package repositories.impl;

import repositories.PersonRepository;

public class PersonRepositoryImpl implements PersonRepository {

    @Override
    public String getPersonName() {
        return "Giovanni Dejan";
    }
}
