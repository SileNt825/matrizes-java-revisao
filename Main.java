import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

     int[][] matrix = {
        {1, 2, 3, 4, 6 },
        {5, 6, 7, 8, 4},
        {9, 10, 11, 12, 17},
        {13, 14, 15, 16, 19},
        {18, 16, 1, 3, 6},
    
    };

       int n = matrix.length;

       int a = 1;
    do{
        System.out.println("[1 - começar]");    
        System.out.println("[0 - sair]");


        
       
        int k = 0;
        int escolha = sc.nextInt();
        switch(escolha){
            
            case 1:
                System.out.println("quantas voltas voce quer dar?");
                int voltas = sc.nextInt();

                while(k <= voltas){
       for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j || i == j) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j || i == j) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        k++;
        }
        break;

        case 0:
            a = 0;
            break;
    }
    } while(a != 0);

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (i + j == matrix.length - 1) {
//                     System.out.print(matrix[i][j] + " ");
//                 } else {
//                     System.out.print(". ");
//                 }
//             }
//             System.out.println();
//         }

// for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[i].length; j++) {
//                 if (i + j <= matrix.length - 2) {
//                     System.out.print(matrix[i][j] + " ");
//                 } else {
//                     System.out.print(". ");
//                 }
//             }
//             System.out.println();
//         }


//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[i].length; j++) {
//                 if (i + j >= n) {
//                     System.out.print(matrix[i][j] + " ");
//                 } else {
//                     System.out.print(". ");
//                 }
//             }
//             System.out.println();
//         }
        sc.close();
     }
}
        
       
    