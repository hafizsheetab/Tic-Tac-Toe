package SourceCode;

public class DefensiveAI implements AI {
    @Override
    public String makeTurn(GameBoard gameBoard) {
        Integer row = 1;
        Integer column = 1;
        while (true) {
            row = getRandomNumber(1, 4);
            column = getRandomNumber(1, 4);
            if (gameBoard.isBoxEmpty(row, column)) {
                break;
            }

        }
        for(int i=1;i<4;i++){
            for(int j=1;j<4;j++){
              if(gameBoard.isBoxEmpty(i,j)){
                  gameBoard.setBoxElements(i,j,"X");
                  if(GameStatus.checkGameStatusWin(gameBoard)){
                      row = i;
                      column = j;
                  }
                  gameBoard.setBoxElements(i,j,"");
              }
            }
        }
        for(int i=1;i<4;i++){
            for(int j=1;j<4;j++){
                if(gameBoard.isBoxEmpty(i,j)){
                    gameBoard.setBoxElements(i,j,"O");
                    if(GameStatus.checkGameStatusWin(gameBoard)){
                        row = i;
                        column = j;
                    }
                    gameBoard.setBoxElements(i,j,"");
                }
            }
        }


        return row.toString() + column.toString();
    }
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
