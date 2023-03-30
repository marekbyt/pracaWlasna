package org.task12_13;

import java.util.ArrayList;
import java.util.List;

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

}


