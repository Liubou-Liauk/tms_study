package ex28;


public class AllTypeofData<E extends Number> {
    private E[] arrIndex;

    public E[] getArrIndex() {
        return arrIndex;
    }

    public void setArrIndex(E[] arrIndex) {
        this.arrIndex = arrIndex;
    }

    public E getArrIndex(int index) {
        System.out.println("index = " + index);
        return arrIndex[index];
    }

}
//Написать класс, который умеет хранить в себе массив любых типов данных (int, long
//etc.). Реализовать метод get (int index), который возвращает любой элемент
//массива по индексу.
