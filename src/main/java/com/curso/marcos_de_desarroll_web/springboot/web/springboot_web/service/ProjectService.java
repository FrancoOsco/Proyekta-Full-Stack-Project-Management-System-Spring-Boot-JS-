package com.curso.marcos_de_desarroll_web.springboot.web.springboot_web.service;

import com.curso.marcos_de_desarroll_web.springboot.web.springboot_web.model.Project;
import com.curso.marcos_de_desarroll_web.springboot.web.springboot_web.model.Usuario;
import com.curso.marcos_de_desarroll_web.springboot.web.springboot_web.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository repository;

    public ProjectService(ProjectRepository repository) {
        this.repository = repository;
    }

    public List<Project> listAllByOwner(Usuario owner) {
        return repository.findAllByOwner(owner);
    }

    public Project getByIdAndOwner(Long id, Usuario owner) {
        return repository.findAllByOwner(owner)
                .stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Project create(Project project, Usuario owner) {
        project.setOwner(owner);
        return repository.save(project);
    }

    public Project getByCode(String code) {
        return repository.findByCode(code)
                .orElseThrow(() -> new RuntimeException("Proyecto no encontrado"));
    }

    public void delete(Project project) {
        repository.delete(project);
    }
}
