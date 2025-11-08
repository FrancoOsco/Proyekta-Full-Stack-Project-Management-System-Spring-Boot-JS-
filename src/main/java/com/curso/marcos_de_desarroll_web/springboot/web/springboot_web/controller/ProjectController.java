package com.curso.marcos_de_desarroll_web.springboot.web.springboot_web.controller;

import com.curso.marcos_de_desarroll_web.springboot.web.springboot_web.model.Project;
import com.curso.marcos_de_desarroll_web.springboot.web.springboot_web.model.Usuario;
import com.curso.marcos_de_desarroll_web.springboot.web.springboot_web.service.ProjectService;
import com.curso.marcos_de_desarroll_web.springboot.web.springboot_web.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    private final ProjectService projectService;
    private final UsuarioService usuarioService;

    public ProjectController(ProjectService projectService, UsuarioService usuarioService) {
        this.projectService = projectService;
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Project> all(Authentication auth) {
        Usuario usuario = usuarioService.buscarPorUsername(auth.getName());
        return projectService.listAllByOwner(usuario);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Project> one(@PathVariable Long id, Authentication auth) {
        Usuario usuario = usuarioService.buscarPorUsername(auth.getName());
        Project p = projectService.getByIdAndOwner(id, usuario);
        if (p == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(p);
    }

    @GetMapping("/code/{code}")
    public ResponseEntity<Project> byCode(@PathVariable String code) {
        Project project = projectService.getByCode(code);
        return ResponseEntity.ok(project);
    }

    @PostMapping
    public ResponseEntity<Project> create(@RequestBody Project project, Authentication auth) {
        Usuario usuario = usuarioService.buscarPorUsername(auth.getName());
        Project saved = projectService.create(project, usuario);
        return ResponseEntity.ok(saved);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id, Authentication auth) {
        Usuario usuario = usuarioService.buscarPorUsername(auth.getName());
        Project project = projectService.getByIdAndOwner(id, usuario);
        if (project != null)
            projectService.delete(project);
        return ResponseEntity.noContent().build();
    }
}
