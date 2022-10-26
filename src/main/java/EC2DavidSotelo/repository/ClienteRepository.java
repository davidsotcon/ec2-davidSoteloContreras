package EC2DavidSotelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import EC2DavidSotelo.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
