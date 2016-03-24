/**
 * Created by Akharu on 3/4/2016.
 */
public class ChessArray
{
    public static void main(String[] args)
    {
        String chessDesk[][] = ChessArray.chessDeskCreate();

        //Вывод на экран массива
        for (int j = 0; j < 8; j++) {
            for (int k = 0; k < 8; k++) {
                if (k % 7 == 0 && k != 0)
                    System.out.println(chessDesk[j][k]);
                else
                    System.out.print(chessDesk[j][k] + " ");
            }
        }
    }

    //Метод, создающий массив массивов в виде шахматной доски
    public static String[][] chessDeskCreate()
    {
        String chessLetters[] = {"a", "b", "c", "d", "e", "f", "g", "h"};
        Integer chessNumbers[] = {1, 2, 3, 4, 5, 6, 7, 8};
        String chessDesk[][] = new String[8][8];

        for (int j = 0; j < chessNumbers.length; j++)
        {
            for (int k = 0; k < chessLetters.length; k++)
            {
                chessDesk[j][k] = chessLetters[k] + chessNumbers[j];
            }
        }
        return chessDesk;
    }
}
