package com.jolanda.restTutorial.restTutorialBaeldung;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("could not find employee" + id);
    }
}
