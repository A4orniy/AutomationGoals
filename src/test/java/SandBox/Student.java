package SandBox;


import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Student{

    int studentBillNumber;
    String name;
    String secondName;
    int yearOfStudying;
    double middleMarkOfMath;
    double middleMarkOfEconomic;
    double middleMarkOfLanduage;

}
class StudentTest {
    public static void main(String[] args) {

//
//        Student Mark = new Student();
//        Student Robe = new Student();
//        Student Andrew = new Student();
//
//        Mark.studentBillNumber = 1;
//        Mark.name = "Mark";
//        Mark.secondName = "Spectr";
//        Mark.yearOfStudying = 2011;
//        Mark.middleMarkOfMath = 71.5;
//        Mark.middleMarkOfEconomic = 58.3;
//        Mark.middleMarkOfLanduage = 88;
//
//
//        Robe.studentBillNumber = 2;
//        Robe.name = "Robe";
//        Robe.secondName = "Truman";
//        Robe.yearOfStudying = 2016;
//        Robe.middleMarkOfMath = 83.2;
//        Robe.middleMarkOfEconomic = 74;
//        Robe.middleMarkOfLanduage = 24;
//
//        Andrew.studentBillNumber = 3;
//        Andrew.name = "Andrew";
//        Andrew.secondName = "Black";
//        Andrew.yearOfStudying = 2010;
//        Andrew.middleMarkOfMath = 53.5;
//        Andrew.middleMarkOfEconomic = 73.7;
//        Andrew.middleMarkOfLanduage = 88;
//
//        System.out.println("Middle mark of things for Andrew is :"
//                + (Andrew.middleMarkOfMath + Andrew.middleMarkOfEconomic + Andrew.middleMarkOfLanduage) / 3);
//        System.out.println("Middle mark of things for Mark is :"
//                + (Mark.middleMarkOfMath + Mark.middleMarkOfEconomic + Mark.middleMarkOfLanduage) / 3);
//        System.out.println("Middle mark of things for Robe is :"
//                + (Robe.middleMarkOfMath + Robe.middleMarkOfEconomic + Robe.middleMarkOfLanduage) / 3);
//
//
//        String str = "String , Functions , Split , Methods , Demo";
//        String [] split_array = str.split(",");
//        for (int i =0; i< split_array.length; i++){
//            System.out.println(split_array[i]);
//        }
//        System.out.println(split_array.length);


        int[] mas = {11, 3, 14, 16, 7}; //1. Сначала мы создали массив mas, который хотим отсортировать.

        boolean isSorted = false; //2. Далее создали переменную isSorted, которая будет таким себе флажком того, отсортирован ли уже массив или нет.

        int buf; //3. На следующей строчке мы создали переменную buf, которая нам пригодится при обмене.

        while (isSorted == false) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                    System.out.println(buf + " buf");
                    System.out.println(mas);
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
    //4. Собственно, далее создали цикл, который будет делать проход за проходом. Так, как мы не знаем, сколько циклов нужно сделать, то использовали
    // цикл while. В худшем случае (элемент с самым маленьким значениеm находится в конце) нам придется сделать столько проходов, сколько элементов в массиве.
    // В лучшем случае, то есть если массив изначально уже отсортирован,
    // мы сделаем один единственный проход для того, чтобы убедиться, что ни одного обмена не было.
    //Первым действием в цикле будет установка значения в true, то есть изначально мы предполагаем, что массив отсортирован. А дальше нам нужно попарно сравнить
    // все элементы массива. Соответственно, нам нужно использовать еще один цикл внутри внешнего. В этом случае мы точно знаем, сколько итераций будет, поэтому
    // используем цикл for. Обратите внимание, что правая граница не на mas.length, а mas.length – 1, поскольку мы сравниваем i-й и i+1-й элементы, и чтобы мы не
    // вышли за пределы массива, делаем на 1 цикл меньше.
    //В цикле for проверяем, больше ли i-й элемент, чем элемент i+1. Если да, то устанавливаем флажек отсортированости в false (есть обмен, поэтому массив все еще
    // не отсортирован). Далее делаем обмен через созданную ранее переменную buf. Собственно, все. Таким образом, цикл while будет работать, пока переменная isSorted
    // будет в положении false на момент окончания попарной проверки. А это возможно только при отсутствии ситуаций, когда mas[i] > mas[i + 1], то есть при отсутствии
    // обменов. Вот так вот.
    //Кстати, если нужно отсортировать массив в обратном порядке, то есть от большего значения к меньшему, достаточно изменить одну единственную строчку (а точнее,
    // поменять знак в ней):




public class someNew {

    public static void main(String[] args) {
        int[] array = {45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8};
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}}



