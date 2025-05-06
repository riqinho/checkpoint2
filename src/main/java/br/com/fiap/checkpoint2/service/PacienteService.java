package br.com.fiap.checkpoint2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint2.dto.Paciente.PacienteRequestCreate;
import br.com.fiap.checkpoint2.dto.Paciente.PacienteRequestUpdate;
import br.com.fiap.checkpoint2.model.Paciente;
import br.com.fiap.checkpoint2.repository.PacienteRepository;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public Paciente createPaciente(PacienteRequestCreate dto) {
        return pacienteRepository.save(dto.toModel());
    }

    public Optional<Paciente> updatePaciente(Long id, PacienteRequestUpdate dto){
        return pacienteRepository.findById(id)
            .map(p -> pacienteRepository.save(dto.toModel(p)));
    }

    public Optional<Paciente> getPacienteById(Long id) {
        return pacienteRepository.findById(id);
    }

    public List<Paciente> getAllPacientes() {
        return pacienteRepository.findAll();
    }

    public boolean deletePaciente(Long id) {
        if (pacienteRepository.existsById(id)) {
            pacienteRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
