package edu.softwaretesting2.dummymavenapp.vaccination_app.service;

import edu.softwaretesting2.dummymavenapp.vaccination_app.model.Paciente;

import java.time.LocalDate;

public class VacunacionService {
    public void validarLaEdadDelPaciente(Paciente p) {
        LocalDate fechaLímite = LocalDate.now().minusYears(60);

        p.setPrioritario(p.getFechaDeNacimiento().isBefore(fechaLímite));
    }
}
