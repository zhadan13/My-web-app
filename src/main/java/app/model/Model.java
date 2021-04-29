package app.model;

import app.entities.User;

import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

public class Model {
    private static final Model instance = new Model();
    private final List<User> model;

    private Model() {
        model = new ArrayList<>();
    }

    public static Model getInstance() {
        return instance;
    }

    public void add(User user) {
        model.add(user);
    }

    public List<String> list() {
        return model.stream()
                .map(User::getName)
                .collect(Collectors.toList());
    }
}