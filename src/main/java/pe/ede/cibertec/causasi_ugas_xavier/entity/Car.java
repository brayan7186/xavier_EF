package pe.ede.cibertec.causasi_ugas_xavier.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Objects;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Car {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer carId;
        private String make;
        private String model;
        private Integer year;
        private String vin;
        private String licensePlate;
        private String ownerName;
        private String ownerContact;
        private Date purchaseDate;
        private Integer mileage;
        private String engineType;
        private String color;
        private String insuranceCompany;
        private String insurancePolicyNumber;
        private Date registrationExpirationDate;
        private Date serviceDueDate;


        // Getters y Setters




    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerContact() {
        return ownerContact;
    }

    public void setOwnerContact(String ownerContact) {
        this.ownerContact = ownerContact;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public Date getRegistrationExpirationDate() {
        return registrationExpirationDate;
    }

    public void setRegistrationExpirationDate(Date registrationExpirationDate) {
        this.registrationExpirationDate = registrationExpirationDate;
    }

    public Date getServiceDueDate() {
        return serviceDueDate;
    }

    public void setServiceDueDate(Date serviceDueDate) {
        this.serviceDueDate = serviceDueDate;
    }



    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", vin='" + vin + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", ownerContact='" + ownerContact + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", mileage=" + mileage +
                ", engineType='" + engineType + '\'' +
                ", color='" + color + '\'' +
                ", insuranceCompany='" + insuranceCompany + '\'' +
                ", insurancePolicyNumber='" + insurancePolicyNumber + '\'' +
                ", registrationExpirationDate=" + registrationExpirationDate +
                ", serviceDueDate=" + serviceDueDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(carId, car.carId) && Objects.equals(make, car.make) && Objects.equals(model, car.model) && Objects.equals(year, car.year) && Objects.equals(vin, car.vin) && Objects.equals(licensePlate, car.licensePlate) && Objects.equals(ownerName, car.ownerName) && Objects.equals(ownerContact, car.ownerContact) && Objects.equals(purchaseDate, car.purchaseDate) && Objects.equals(mileage, car.mileage) && Objects.equals(engineType, car.engineType) && Objects.equals(color, car.color) && Objects.equals(insuranceCompany, car.insuranceCompany) && Objects.equals(insurancePolicyNumber, car.insurancePolicyNumber) && Objects.equals(registrationExpirationDate, car.registrationExpirationDate) && Objects.equals(serviceDueDate, car.serviceDueDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId, make, model, year, vin, licensePlate, ownerName, ownerContact, purchaseDate, mileage, engineType, color, insuranceCompany, insurancePolicyNumber, registrationExpirationDate, serviceDueDate);
    }


    public void setUpdatedAt(Date date) {
    }

    public void setCreatedAt(Date date) {
    }
}


