package EC2DavidSotelo.service;

import java.util.List;

import EC2DavidSotelo.model.Bodega;


public interface BodegaService {
	void guardar(Bodega bodega);
	void actualizar(Bodega bodega);
	void eliminar(Integer id);
	List<Bodega> listar();
	Bodega obtener(Integer id);
}
