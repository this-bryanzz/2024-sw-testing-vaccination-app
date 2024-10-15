package edu.softwaretesting2.dummymavenapp.vaccination_app.service;

import edu.softwaretesting2.dummymavenapp.vaccination_app.model.Persona;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class VacunacionServiceTest {

    Persona persona1;

    @BeforeAll
    void init(){
        persona1 = new Persona("NN", LocalDate.of(1986, 12, 24));
    }

    @BeforeEach
    void setUp() {
    }

    @Test
    public void deberíaAsignarMaximo40PersonasParaUnDía(){
        //GIVEN

        //WHEN

        //THEN

    }
}