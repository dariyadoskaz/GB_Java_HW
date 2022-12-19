package corelesson2;

/*
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
    При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
    Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения
    MyArraySizeException и MyArrayDataException и вывести результат расчета.
*/
public class HomeWork2 {
    public static int arraySum(String[][] my2DMatrix) throws MyArraySizeException, MyArrayDataException {
        if (my2DMatrix.length != 4) {
            throw new MyArraySizeException("Array size != 4");
        }

        for (String[] array : my2DMatrix) {
            if (array.length != 4) {
                throw new MyArraySizeException("Incorrect array size: !=4");
            }
        }

        int sum = 0;
        for (int i = 0; i < my2DMatrix.length; i++) {
            for (int j = 0; j < my2DMatrix[i].length; j++) {
                try {
                    sum += Integer.parseInt(my2DMatrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Incorrect element:" + i  + "," + j);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        String[][] myCorrectArray =
                {{"1", "2", "3", "4"},
                        {"5", "6", "7", "8"},
                        {"1", "2", "3", "4", "5"},
                        {"5", "6", "7", "8"}};

        Integer[][] array = new Integer[4][];
        array[0] = new Integer[4];
        array[0] = new Integer[5];
        array[0] = new Integer[4];

        try {
            System.out.println(arraySum(myCorrectArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

        String[][] myIncorrectArray =
                {{"1", "2a", "3", "4"},
                        {"5", "6", "7", "8"},
                        {"1", "2", "3", "4"},
                        {"5", "6", "7", "8"}};

        try {
            System.out.println(arraySum(myIncorrectArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}
