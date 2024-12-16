package pe.ede.cibertec.causasi_ugas_xavier.response;


import pe.ede.cibertec.causasi_ugas_xavier.dto.CarDetailDto;

public record GetCarDetailResponse(String code,
                                   String error,
                                   CarDetailDto carDetailDto) {
}