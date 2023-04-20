import java.util.Scanner;

class Tic{
    char[][] arr = new char[3][3];
    //intialize with -1
    Tic() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = '1';
            }
        }
        Menu();
    }
    public void Menu(){
        System.out.println("Welcome to Our game");
        printBox(arr);
        for(int i=0;i<=5;i++){
            takeInputX(arr);
            printBox(arr);
            if (cheakWhoWinX(arr)) {
                System.out.println("**************   * is won the game.........*************");
                break;
            }
            if(i == 5) {
                System.out.println("Game Draw!");
                break;
            }
            takeInputY(arr);
            printBox(arr);
            if (cheakWhoWinY(arr)) {
                System.out.println("###########   # is won the game.........#############");
                break;
            }
        }
    }
    //take input
    public void takeInputX(char[][] arr){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the '*' in x,y position");
                int x = sc.nextInt();
                int y = sc.nextInt();
                arr[x][y]='*';
    }
    public void takeInputY(char[][] arr){
                 Scanner sc = new Scanner(System.in);

                System.out.println("Enter the '#' in x,y position");
                int x = sc.nextInt();
                int y = sc.nextInt();
                arr[x][y]='#';
    }
    public void printBox(char[][] arr){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+"-");
            }
            System.out.println("");
        }
    }
     public boolean cheakWhoWinX(char[][] arr){
        //Horizontal cheaking


        if(arr[0][0]=='*' && arr[0][1]=='*' && arr[0][2]=='*'){
            return true;
        }
        else if(arr[1][0]=='*' && arr[1][1]=='*' && arr[1][2]=='*'){
            return true;
        }
        else if(arr[2][0]=='*' && arr[2][1]=='*' && arr[2][2]=='*'){
            return true;
        }


        // verticla cheaking
        else if(arr[0][0]=='*' && arr[1][0]=='*' && arr[2][0]=='*'){
            return true;
        }
        else if (arr[0][1]=='*' && arr[1][1]=='*' && arr[2][1]=='*') {
            return true;
        }
        else if(arr[0][2]=='*' && arr[1][2]=='*' && arr[2][2]=='*'){
            return true;
        }
        //Diagonal cheaking

         else if(arr[0][0]=='*' && arr[1][1] =='*' && arr[2][2]=='*'){
            return true;
        }
         else if (arr[0][2]=='*' && arr[1][1] == '*' && arr[2][0]=='*'){
            return true;
        }
         return false;
     }
    public boolean cheakWhoWinY(char[][] arr){
        //Horizontal cheaking


        if(arr[0][0]=='#' && arr[0][1]=='#' && arr[0][2]=='#'){
            return true;
        }
        else if(arr[1][0]=='#' && arr[1][1]=='#' && arr[1][2]=='#'){
            return true;
        }
        else if(arr[2][0]=='#' && arr[2][1]=='#' && arr[2][2]=='#'){
            return true;
        }


        // verticla cheaking
        else if(arr[0][0]=='#' && arr[1][0]=='#' && arr[2][0]=='#'){
            return true;
        }
        else if (arr[0][1]=='#' && arr[1][1]=='#' && arr[2][1]=='#') {
            return true;
        }
        else if(arr[0][2]=='#' && arr[1][2]=='#' && arr[2][2]=='#'){
            return true;
        }
        //Diagonal cheaking

        else if(arr[0][0]=='#' && arr[1][1] =='#' && arr[2][2]=='#'){
            return true;
        }
        else if (arr[0][2]=='#' && arr[1][1] == '#' && arr[2][0]=='#'){
            return true;
        }
        return false;
    }




}
public class TicTacToe
{
    public static void main(String[] args) {
    Tic obj = new Tic();
    }


}
