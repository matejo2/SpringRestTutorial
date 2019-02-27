package com.jolanda.restTutorial.restTutorialBaeldung;

import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
