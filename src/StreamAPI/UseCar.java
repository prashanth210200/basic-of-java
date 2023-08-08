package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.util.Optional;
import java.util.stream.Collectors;

public class UseCar {

	public static void main(String[] args) {
		List<Car> car=new ArrayList<Car>();
		car.add(new Car("Audi",10000000,2021,"block",1200,"petrol"));
		car.add(new Car("Ford",230000000,2023,"white",1100,"diesel"));
		car.add(new Car("BMW",110000000,2021,"yellow",1000,"petrol"));
		car.add(new Car("Mahendra",34000000,2019,"white",1200,"diesel"));
		car.add(new Car("Audi",45000000,2018,"yellow",1100,"petrol"));
		car.add(new Car("Ford",20000000,2017,"block",1000,"diesel"));
		car.add(new Car("BMW",320000000,2018,"white",1100,"petrol"));
		car.add(new Car("Mahendra",43000000,2020,"yellow",1200,"petrol"));
		car.add(new Car("BMW",56000000,2020,"block",1000,"diesel"));
		car.add(new Car("Audi",56000000,2021,"white",1200,"petrol"));
		
		List<Car> audi=car.stream().filter(s->s.getBrand().equalsIgnoreCase("Audi")).collect(Collectors.toList());
		System.out.println(audi);
		List<Car> price=car.stream().filter(s->s.getPrice()>42300000).collect(Collectors.toList());
		System.out.println(price);
		
		long l=car.stream().filter(s->s.getPrice()>20000000).count();
		System.out.println(l);
		
		long c=car.stream().filter(s->s.getColour()=="white").count();
		System.out.println(c);
		
		long w=car.stream().filter(s->s.getCc()==1200).map(d->d.getFiel().equalsIgnoreCase("petrol")).count();
		System.out.println(w);
		
		Optional<Car> d=car.stream().max(Comparator.comparing(Car::getPrice));
		
		System.out.println(d);
		
		Optional <Car> d1=car.stream().min(Comparator.comparing(Car::getPrice));
		System.out.println(d1);
		
				
	
		
	}

}
