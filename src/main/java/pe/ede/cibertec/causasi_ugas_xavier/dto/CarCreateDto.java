package pe.ede.cibertec.causasi_ugas_xavier.dto;

import java.util.Date;

public record CarCreateDto(String make,
                           String model,
                           int year,
                           String vin,
                           String licensePlate,
                           String ownerName,
                           String ownerContact,
                           Date purchaseDate,
                           int mileage,
                           String engineType,
                           String color,
                           String insuranceCompany,
                           String insurancePolicyNumber,
                           Date registrationExpirationDate,
                           Date serviceDueDate) {

}
