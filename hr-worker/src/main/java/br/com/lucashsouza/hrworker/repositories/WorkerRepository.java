package br.com.lucashsouza.hrworker.repositories;

import br.com.lucashsouza.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
