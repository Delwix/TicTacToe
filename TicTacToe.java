import java.util.Scanner;


public class TicTacToe {
    public static int checkWin(String[] slots,String symbol){
        for(int i=0;i<7;i += 3) {
            if ((slots[i] + slots[i+1] + slots[i + 2]).equals(symbol))
                return 0;
        }
        for(int i=0;i<3;i++) {
            if ((slots[i] + slots[i+3] + slots[i + 6]).equals(symbol))
                return 0;
        }
        if ((slots[0] + slots[4] + slots[8]).equals(symbol))
            return 0;
        if ((slots[2] + slots[4] + slots[6]).equals(symbol))
            return 0;
        return 1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] turn = {"X","O"};
        int player = 1;
        System.out.println("Bienvienue :");
        System.out.println("le joueur \"X\" commence");
        String[] slots = {"1","2","3","4","5","6","7","8","9"};
        System.out.println("---------");
        System.out.println(slots[0]+" | "+slots[1]+" | "+slots[2]);
        System.out.println(slots[3]+" | "+slots[4]+" | "+slots[5]);
        System.out.println(slots[6]+" | "+slots[7]+" | "+slots[8]);
        System.out.println("---------");
        while(checkWin(slots,"XXX") == 1 && checkWin(slots,"OOO") == 1) {
            System.out.println("Choisissez une case");
            String choix = input.nextLine();
            int i = Integer.parseInt(choix) - 1;

            if (player == 1) {
                slots[i] = turn[0];
                player = 0;
            } else {
                slots[i] = turn[1];
                player = 1;
            }
            System.out.println("---------");
            System.out.println(slots[0] + " | " + slots[1] + " | " + slots[2]);
            System.out.println(slots[3] + " | " + slots[4] + " | " + slots[5]);
            System.out.println(slots[6] + " | " + slots[7] + " | " + slots[8]);
            System.out.println("---------");
        }
        if(checkWin(slots,"XXX") == 0){
            System.out.println("Joueur X a gagne");
        }
        else{
            System.out.println("Joueur O a gagne");
        }
    }

}
