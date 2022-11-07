package Task4;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Controller {
    private List<Projector> projectores;
    private Stream<Projector> stream;

    public Controller(List<Projector> projectors) {
        this.projectores = projectors;
        this.stream = this.projectores.stream();
    }

    public void PrintAll() {
        stream.forEach(System.out::print);
    }

    public void PrintForMaker(String maker) {
        stream.filter(s -> s.Maker.toUpperCase() == maker.toUpperCase()).forEach(System.out::print);
    }

    public void PrintNowYear() {
        stream.filter(s -> s.Date.getYear() == LocalDate.now().getYear()).forEach(System.out::print);
    }

    public void PrintPrice(float price) {
        stream.filter(s -> s.Price > price).forEach(System.out::print);
    }

    public void SortByPriceIncrease() {
        stream.sorted(Comparator.comparing(Projector::getPrice)).forEach(System.out::print);
    }

    public void SortByPriceDecrese() {
        stream.sorted(Comparator.comparing(Projector::getPrice).reversed()).forEach(System.out::print);
    }

    public void SortByYearIncrease() {
        stream.sorted(Comparator.comparing(Projector::getDate)).forEach(System.out::print);
    }

    public void SortByYearDecrease() {
        stream.sorted(Comparator.comparing(Projector::getDate).reversed()).forEach(System.out::print);
    }
}
