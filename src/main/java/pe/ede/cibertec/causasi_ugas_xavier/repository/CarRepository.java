package pe.ede.cibertec.causasi_ugas_xavier.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.ede.cibertec.causasi_ugas_xavier.entity.Car;


@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
    // Puedes agregar métodos personalizados si es necesario.
}