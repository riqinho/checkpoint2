package br.com.fiap.checkpoint2.controller.Paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint2.dto.Paciente.PacienteRequestCreate;
import br.com.fiap.checkpoint2.dto.Paciente.PacienteResponse;
import br.com.fiap.checkpoint2.service.PacienteService;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @PatchMapping
    public ResponseEntity<PacienteResponse> create(@RequestBody PacienteRequestCreate dto){
        return ResponseEntity.status(201).body(
            new PacienteResponse().toDto(
                pacienteService.createPaciente(dto)
            )
        );
    }

    

}
