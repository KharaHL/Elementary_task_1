public class Main {
    static public void main(String [] args){
        Input input=new Input();
        int height=input.inputHeight();
        int weight=input.inputWeight();
        ChessBoard chessBoard=new ChessBoard(height,weight);
        chessBoard.printBoard();
    }
}
