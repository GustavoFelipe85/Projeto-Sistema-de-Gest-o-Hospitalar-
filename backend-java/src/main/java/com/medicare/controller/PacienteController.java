package com.medicare.controller;

import com.medicare.model.Paciente;
import com.medicare.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pacientes")
@CrossOrigin(origins = "*")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public List<Paciente> getAllPacientes() {
        return pacienteService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> getPacienteById(@PathVariable Long id) {
        Optional<Paciente> paciente = pacienteService.findById(id);
        return paciente.map(ResponseEntity::ok)
                      .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Paciente createPaciente(@RequestBody Paciente paciente) {
        return pacienteService.save(paciente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Paciente> updatePaciente(@PathVariable Long id, 
                                                  @RequestBody Paciente pacienteDetails) {
        Optional<Paciente> paciente = pacienteService.findById(id);
        if (paciente.isPresent()) {
            Paciente updatedPaciente = paciente.get();
            updatedPaciente.setNome(pacienteDetails.getNome());
            updatedPaciente.setCpf(pacienteDetails.getCpf());
            updatedPaciente.setDataNascimento(pacienteDetails.getDataNascimento());
            updatedPaciente.setTelefone(pacienteDetails.getTelefone());
            updatedPaciente.setEmail(pacienteDetails.getEmail());
            return ResponseEntity.ok(pacienteService.save(updatedPaciente));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePaciente(@PathVariable Long id) {
        if (pacienteService.existsById(id)) {
            pacienteService.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
