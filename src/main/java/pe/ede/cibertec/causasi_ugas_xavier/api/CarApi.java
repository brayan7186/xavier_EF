package pe.ede.cibertec.causasi_ugas_xavier.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.ede.cibertec.causasi_ugas_xavier.dto.CarCreateDto;
import pe.ede.cibertec.causasi_ugas_xavier.dto.CarDetailDto;
import pe.ede.cibertec.causasi_ugas_xavier.dto.CarDto;
import pe.ede.cibertec.causasi_ugas_xavier.response.*;
import pe.ede.cibertec.causasi_ugas_xavier.service.CarService;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/cars")
public class CarApi {

    @Autowired
    CarService carService;

    @GetMapping("/all")
    public GetAllCarsResponse getAllCars() {
        try {
            List<CarDto> cars = carService.getAllCars();
            if (!cars.isEmpty()) {
                return new GetAllCarsResponse("01", null, cars);
            } else {
                return new GetAllCarsResponse("02", "Cars not found", null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new GetAllCarsResponse("99", "An error occurred, please try again", null);
        }
    }

    @GetMapping("/detail")
    public GetCarDetailResponse getCarDetail(@RequestParam(value = "id", defaultValue = "0") String id) {
        try {
            Optional<CarDetailDto> optional = carService.getCarDetail(Integer.parseInt(id));
            return optional.map(car ->
                    new GetCarDetailResponse("01", null, car)
            ).orElse(
                    new GetCarDetailResponse("02", "Car not found", null)
            );
        } catch (Exception e) {
            e.printStackTrace();
            return new GetCarDetailResponse("99", "An error occurred, please try again", null);
        }
    }

    @PutMapping("/update")
    public UpdateCarResponse updateCar(@RequestBody CarDto carDto) {
        try {
            if (carService.updateCar(carDto)) {
                return new UpdateCarResponse("01", null);
            } else {
                return new UpdateCarResponse("02", "Update failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new UpdateCarResponse("99", "An error occurred, please try again");
        }
    }

    @DeleteMapping("/delete/{id}")
    public DeleteCarResponse deleteCar(@PathVariable String id) {
        try {
            if (carService.deleteCar(Integer.parseInt(id))) {
                return new DeleteCarResponse("01", null);
            } else {
                return new DeleteCarResponse("02", "Delete failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new DeleteCarResponse("99", "An error occurred, please try again");
        }
    }

    @PostMapping("/create")
    public CreateCarResponse createCar(@RequestBody CarCreateDto carCreateDto) {
        try {
            if (carService.createCar(carCreateDto)) {
                return new CreateCarResponse("01", null);
            } else {
                return new CreateCarResponse("02", "Create failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new CreateCarResponse("99", "An error occurred, please try again");
        }
    }
}
