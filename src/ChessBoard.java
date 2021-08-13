import java.util.Scanner;
class ChessBoard {
    public int inputWeight(){
        System.out.println("Input Weight:");
        Scanner scanner = new Scanner(System.in);
        int boardWeight=scanner.nextInt();
        return boardWeight;
    }
    public int inputHeight(){
        System.out.println("Input Height:");
        Scanner scanner = new Scanner(System.in);
        int boardHeight=scanner.nextInt();
        return boardHeight;
    }
    public void printBoard(){
        int height=inputHeight();
        int weight=inputWeight();

        for (int i=1;i<=height;i++){
            for (int j=1;j<=weight;j++){
                if(i%2==0){
                    System.out.print(" ");
                    System.out.print("*");
                }else {
                    System.out.print("*");
                    System.out.print(" ");
                }
                if(j==weight){
                    System.out.println();
                }
            }}
    }
}
