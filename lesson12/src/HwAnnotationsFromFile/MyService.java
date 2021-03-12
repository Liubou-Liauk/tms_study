package HwAnnotationsFromFile;

import java.util.Objects;

@MyAnnotation(author = "anonymous", version = 4.2)
public class MyService {

    private String name;
    private String area;

    public MyService(String name, String area) {
        this.name = name;
        this.area = area;
    }

    public MyService() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    void MyServiceInfo() {
        System.out.println(this.name + " with area in  " + this.area);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return Objects.equals(name, myService.name) && Objects.equals(area, myService.area);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, area);
    }
}


//Придумать и написать собственную аннотацию @Version, которая бует хранить информацию о версии класса сервиса
// (поле обязательное) MyService и кодовое название версии (поле не обязательное) - (например номер версии = 7.1,
// а кодовое название версии = Nougat).
//
//Класс MyService должен иметь переменные c private модификаторами, конструктор по умолчанию, get и set методы,
// переопределенные методы equals и hashcode, а так же private метод (private thisClassInfo),
// который будет просто печатать данные о самом классе (данные любые на ваш выбор), в котором он определен.
//
//Написать программу, которая будет анализировать присутствие аннотации над классом MyService и если она присутствует - создавать
// экземпляр этого класса, задавать значения его полям и вызывать метод thisClassInfo (использовать возможности пакета reflection).