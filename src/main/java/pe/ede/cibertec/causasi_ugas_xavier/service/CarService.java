package pe.ede.cibertec.causasi_ugas_xavier.service;



import pe.ede.cibertec.causasi_ugas_xavier.dto.CarCreateDto;
import pe.ede.cibertec.causasi_ugas_xavier.dto.CarDetailDto;
import pe.ede.cibertec.causasi_ugas_xavier.dto.CarDto;

import java.util.List;
import java.util.Optional;

public interface CarService {

    List<CarDto> getAllCars() throws Exception;

    Optional<CarDetailDto> getCarDetail(int id) throws Exception;

    boolean updateCar(CarDto carDto) throws Exception;

    boolean deleteCar(int id) throws Exception;

    boolean createCar(CarCreateDto carCreateDto) throws Exception;

}
