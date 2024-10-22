package edu.softwaretesting2.dummymavenapp.vaccination_app.service;

import edu.softwaretesting2.dummymavenapp.vaccination_app.model.Paciente;

import java.time.LocalDate;

public class VacunacionService {
    public boolean validarLaEdadDelPaciente(Paciente p) {
        LocalDate fechaLímite = LocalDate.now().minusYears(60);
        boolean esPrioritario = p.getFechaDeNacimiento().isBefore(fechaLímite);

        p.setPrioritario(esPrioritario);
        return esPrioritario;
    }
}
