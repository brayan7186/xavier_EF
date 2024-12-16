package pe.ede.cibertec.causasi_ugas_xavier.response;


import pe.ede.cibertec.causasi_ugas_xavier.dto.CarDto;

import java.util.List;

public record GetAllCarsResponse(String code,
                                 String error,
                                 List<CarDto> cars) {
}