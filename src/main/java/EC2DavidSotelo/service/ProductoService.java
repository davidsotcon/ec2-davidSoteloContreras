package EC2DavidSotelo.service;

import java.util.List;



import EC2DavidSotelo.model.Producto;

public interface ProductoService {

	void guardar(Producto producto);
	void actualizar(Producto producto);
	void eliminar(Integer id);
	List<Producto> listar();
	Producto obtener(Integer id);
}
