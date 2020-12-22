package it.academy.dao;

public class UserDetailsDAOIml implements UserDetailsDAO {

    private Database database;

    public UserDetailsDAOIml() {
        this.database = new Oracle();
    }

    @Override
    public String getDetails(String userName) {
        return database.queryFor(userName);
    }
}
