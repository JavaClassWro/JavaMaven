package it.academy.dao;

public class Oracle implements Database {
    @Override
    public String queryFor(String userName) {
        return userName+"@gmail.com";
    }
}
