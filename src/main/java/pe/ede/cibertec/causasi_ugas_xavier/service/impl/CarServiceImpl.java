package pe.ede.cibertec.causasi_ugas_xavier.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.ede.cibertec.causasi_ugas_xavier.dto.CarCreateDto;
import pe.ede.cibertec.causasi_ugas_xavier.dto.CarDetailDto;
import pe.ede.cibertec.causasi_ugas_xavier.dto.CarDto;
import pe.ede.cibertec.causasi_ugas_xavier.entity.Car;
import pe.ede.cibertec.causasi_ugas_xavier.repository.CarRepository;
import pe.ede.cibertec.causasi_ugas_xavier.service.CarService;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<CarDto> getAllCars() throws Exception {
        List<CarDto> cars = new ArrayList<>();
        Iterable<Car> carEntities = carRepository.findAll();
        carEntities.forEach(car -> cars.add(new CarDto(
                car.getCarId(),
                car.getMake(),
                car.getModel(),
                car.getYear(),
                car.getColor()
        )));
        return cars;
    }

    @Override
    public Optional<CarDetailDto> getCarDetail(int id) throws Exception {
        Optional<Car> optionalCar = carRepository.findById(id);
        return optionalCar.map(car -> new CarDetailDto(
                car.getCarId(),
                car.getMake(),
                car.getModel(),
                car.getYear(),
                car.getVin(),
                car.getLicensePlate(),
                car.getOwnerName(),
                car.getOwnerContact(),
                car.getPurchaseDate(),
                car.getMileage(),
                car.getEngineType(),
                car.getColor(),
                car.getInsuranceCompany(),
                car.getInsurancePolicyNumber(),
                car.getRegistrationExpirationDate(),
                car.getServiceDueDate()
        ));
    }

    @Override
    public boolean updateCar(CarDto carDto) throws Exception {
        Optional<Car> optionalCar = carRepository.findById(carDto.carId());
        return optionalCar.map(car -> {
            car.setMake(carDto.make());
            car.setModel(carDto.model());
            car.setYear(carDto.year());
            car.setVin(carDto.vin()); // Si este campo también es parte del DTO y la entidad
            car.setUpdatedAt(new Date()); // Asegúrate de que `updatedAt` exista en la entidad `Car`

            carRepository.save(car);
            return true;
        }).orElse(false);
    }

    @Override
    public boolean deleteCar(int id) throws Exception {
        Optional<Car> optionalCar = carRepository.findById(id);
        return optionalCar.map(car -> {
            carRepository.delete(car);
            return true;
        }).orElse(false);
    }

    @Override
    public boolean createCar(CarCreateDto carCreateDto) throws Exception {
        Car car = new Car();

        car.setMake(carCreateDto.make());
        car.setModel(carCreateDto.model());
        car.setYear(carCreateDto.year());
        car.setVin(carCreateDto.vin());
        car.setLicensePlate(carCreateDto.licensePlate());
        car.setOwnerName(carCreateDto.ownerName());
        car.setOwnerContact(carCreateDto.ownerContact());
        car.setPurchaseDate(carCreateDto.purchaseDate());
        car.setMileage(carCreateDto.mileage());
        car.setEngineType(carCreateDto.engineType());
        car.setColor(carCreateDto.color());
        car.setInsuranceCompany(carCreateDto.insuranceCompany());
        car.setInsurancePolicyNumber(carCreateDto.insurancePolicyNumber());
        car.setRegistrationExpirationDate(carCreateDto.registrationExpirationDate());
        car.setServiceDueDate(carCreateDto.serviceDueDate());
        car.setCreatedAt(new Date());

        carRepository.save(car);
        return true;
    }

}
