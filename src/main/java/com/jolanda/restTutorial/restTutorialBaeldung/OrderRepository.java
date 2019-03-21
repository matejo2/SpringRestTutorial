package com.jolanda.restTutorial.restTutorialBaeldung;

import org.springframework.data.jpa.repository.JpaRepository;

interface OrderRepository extends JpaRepository<Order, Long> {
}
