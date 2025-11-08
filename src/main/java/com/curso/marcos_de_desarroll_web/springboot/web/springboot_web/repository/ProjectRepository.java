package com.curso.marcos_de_desarroll_web.springboot.web.springboot_web.repository;

import com.curso.marcos_de_desarroll_web.springboot.web.springboot_web.model.Project;
import com.curso.marcos_de_desarroll_web.springboot.web.springboot_web.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    List<Project> findAllByOwner(Usuario owner);

    Optional<Project> findByCode(String code);
}
