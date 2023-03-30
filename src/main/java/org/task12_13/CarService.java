package org.task12_13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private final List<Car> cars = new ArrayList<>();
public void add(Car car){
    cars.add(car);
}
public void remove(Car car){
    cars.remove(car);

}
public List<Car> getAll(){
   // return cars; // caly czas operujemy na tej samej liscie aut !!
    //return List.copyOf(cars); // tworzy niemodyfikowalna liste
    return  new ArrayList<>(cars); // tworzy modyfikowlna liste
}
public List<Car> printCarsWithV12Engine(){
    return cars.stream()
            .filter(p->p.getEngineType().equals(EngineType.V12))
            .collect(Collectors.toList());

}
public List<Car> getCarsProdusedBefor1999(){
    return cars.stream()
            .filter(p-> p.getProductionYear() <= 1999)
            .toList();

}
public Car getCarsWithHigherPrice (){
    return cars.stream()
            .max(Comparator.comparingDouble(p->p.getPrice()))
            .get();
}
public Car getCarWithLowerPrice () {
    return cars.stream()
            .min(Comparator.comparingDouble(p->p.getPrice()))
            .get();
}
public List<Car> getCarsWithMoreThenTwoManufacturer(){
    return cars.stream()
            .filter(cars->cars.getManufacturers().size() <= 2)
            .toList();
}

}


