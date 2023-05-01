package java8.unit_999.Example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@Builder
@AllArgsConstructor

public class UtilObjects {
    private  List<Car> carsList;

    public UtilObjects(){
        carsList = Arrays.asList(Car.builder().model("Audi").price(1000000).build(), Car.builder().model("Bmw").price(2000000).build(),
                Car.builder().model("Jeep").price(3000000).build());
    }

}

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
class Car {
    private String model;
    private Integer price;
}
