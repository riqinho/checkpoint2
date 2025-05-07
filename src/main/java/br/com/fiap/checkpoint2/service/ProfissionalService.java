package br.com.fiap.checkpoint2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint2.dto.Profissional.ProfissionalRequestCreate;
import br.com.fiap.checkpoint2.dto.Profissional.ProfissionalRequestUpdate;
import br.com.fiap.checkpoint2.model.Profissional;
import br.com.fiap.checkpoint2.repository.ProfissionalRepository;

@Service
public class ProfissionalService {

    @Autowired
    private ProfissionalRepository profissionalRepository;

    public Profissional createProfissional(ProfissionalRequestCreate dto) {
        return profissionalRepository.save(dto.toModel());
    }

    public Optional<Profissional> updateProfisional(Long id, ProfissionalRequestUpdate dto){
        return profissionalRepository.findById(id)
            .map(p->profissionalRepository.save(dto.toModel(p)));
    }

    public Optional<Profissional> getProfissionalById(Long id){
        return profissionalRepository.findById(id);
    }

    public List<Profissional> getAllProfissionals(){
        return profissionalRepository.findAll();
    }

    public boolean deleteProfissional(Long id){
        if(profissionalRepository.existsById(id)){
            profissionalRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
