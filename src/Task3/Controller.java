package Task3;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

public class Controller {
    private List<Device> devices;
    private Stream<Device> stream;

    public Controller(List<Device> devices) {
        this.devices = devices;
        stream = this.devices.stream();
    }

    public void PrintAllDevices() {
        stream.forEach(System.out::print);
    }

    public void PrintDeviceColor(String color) {
        stream.filter(s -> s.Color.toUpperCase() == color.toUpperCase()).forEach(System.out::print);
    }

    public void PrintDeviceYear(LocalDate date) {
        stream.filter(s -> s.Date.getYear() == date.getYear()).forEach(System.out::print);
    }

    public void PrintDevicePrice(float price) {
        stream.filter(s -> s.Price == price).forEach(System.out::print);
    }

    public void PrintDeviceType(String type) {
        stream.filter(s -> s.Type.toUpperCase() == type.toUpperCase()).forEach(System.out::print);
    }

    public void PrintDeviceYearInRaneg(int from, int to) {
        stream.filter(s -> s.Date.getYear() > from && s.Date.getYear() < to).forEach(System.out::print);
    }

}
