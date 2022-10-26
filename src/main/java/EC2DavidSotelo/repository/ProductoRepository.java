package EC2DavidSotelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EC2DavidSotelo.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
