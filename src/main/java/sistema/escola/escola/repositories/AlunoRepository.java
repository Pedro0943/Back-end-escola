package sistema.escola.escola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sistema.escola.escola.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
