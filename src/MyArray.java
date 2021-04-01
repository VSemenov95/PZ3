public class MyArray {
    public static void main(String[] args) {
        byte [] MyArray = {5, 7, 3, -4, 9};
        int length = MyArray.length;
        byte a = MyArray[0];
        MyArray[0] = MyArray[length-1];
        MyArray[length-1] = a;
        int sum = MyArray[0] + MyArray[length-3];
        System.out.println("Сумма первого и среднего элементов массива = "+ sum);
    }
}
