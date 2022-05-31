package com.nology;

public class StoredCode {

    //    public void firstTurn() {
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        if(random.nextInt(2)==0) {
//            player1_turn=true;
//            textfield.setText("X turn");
//        }
//        else {
//            player1_turn=false;
//            textfield.setText("O turn");
//        }
//    }

//    for (int i = 0; i < 9 ; i++) {
//        if (e.getSource() == buttons[i]) {
//            if(player1_turn) {
//                if(buttons[i].getText()=="") {
//                    buttons[i].setForeground(new Color(255,0,0));
//                    buttons[i].setText("X");
//                    player1_turn=false;
//                    textfield.setText("O turn");
//                    check();
//                }
//            }
//            else {
//                if(buttons[i].getText()=="") {
//                    buttons[i].setForeground(new Color(0,0,255));
//                    buttons[i].setText("O");
//                    player1_turn=true;
//                    textfield.setText("X turn");
//                    check();
//                }
//            }
//        }
//    }





//    public void check() {
//        if(
//                (Objects.equals(buttons[0].getText(), "X")) &&
//                        (Objects.equals(buttons[1].getText(), "X")) &&
//                        (Objects.equals(buttons[2].getText(), "X"))
//        ) {
//            xWins(0,1,2);
//        }
//        if(
//                (Objects.equals(buttons[3].getText(), "X")) &&
//                        (Objects.equals(buttons[4].getText(), "X")) &&
//                        (Objects.equals(buttons[5].getText(), "X"))
//        ) {
//            xWins(3,4,5);
//        }
//        if(
//                (Objects.equals(buttons[6].getText(), "X")) &&
//                        (Objects.equals(buttons[7].getText(), "X")) &&
//                        (Objects.equals(buttons[8].getText(), "X"))
//        ) {
//            xWins(6,7,8);
//        }
//        if(
//                (Objects.equals(buttons[0].getText(), "X")) &&
//                        (Objects.equals(buttons[3].getText(), "X")) &&
//                        (Objects.equals(buttons[6].getText(), "X"))
//        ) {
//            xWins(0,3,6);
//        }
//        if(
//                (Objects.equals(buttons[1].getText(), "X")) &&
//                        (Objects.equals(buttons[4].getText(), "X")) &&
//                        (Objects.equals(buttons[7].getText(), "X"))
//        ) {
//            xWins(1,4,7);
//        }
//        if(
//                (Objects.equals(buttons[2].getText(), "X")) &&
//                        (Objects.equals(buttons[5].getText(), "X")) &&
//                        (Objects.equals(buttons[8].getText(), "X"))
//        ) {
//            xWins(2,5,8);
//        }
//        if(
//                (Objects.equals(buttons[0].getText(), "X")) &&
//                        (Objects.equals(buttons[4].getText(), "X")) &&
//                        (Objects.equals(buttons[8].getText(), "X"))
//        ) {
//            xWins(0,4,8);
//        }
//        if(
//                (Objects.equals(buttons[2].getText(), "X")) &&
//                        (Objects.equals(buttons[4].getText(), "X")) &&
//                        (Objects.equals(buttons[6].getText(), "X"))
//        ) {
//            xWins(2,4,6);
//        }
//        if(
//                (Objects.equals(buttons[0].getText(), "O")) &&
//                        (Objects.equals(buttons[1].getText(), "O")) &&
//                        (Objects.equals(buttons[2].getText(), "O"))
//        ) {
//            oWins(0,1,2);
//        }
//        if(
//                (Objects.equals(buttons[3].getText(), "O")) &&
//                        (Objects.equals(buttons[4].getText(), "O")) &&
//                        (Objects.equals(buttons[5].getText(), "O"))
//        ) {
//            oWins(3,4,5);
//        }
//        if(
//                (Objects.equals(buttons[6].getText(), "O")) &&
//                        (Objects.equals(buttons[7].getText(), "O")) &&
//                        (Objects.equals(buttons[8].getText(), "O"))
//        ) {
//            oWins(6,7,8);
//        }
//        if(
//                (Objects.equals(buttons[0].getText(), "O")) &&
//                        (Objects.equals(buttons[3].getText(), "O")) &&
//                        (Objects.equals(buttons[6].getText(), "O"))
//        ) {
//            oWins(0,3,6);
//        }
//        if(
//                (Objects.equals(buttons[1].getText(), "O")) &&
//                        (Objects.equals(buttons[4].getText(), "O")) &&
//                        (Objects.equals(buttons[7].getText(), "O"))
//        ) {
//            oWins(1,4,7);
//        }
//        if(
//                (Objects.equals(buttons[2].getText(), "O")) &&
//                        (Objects.equals(buttons[5].getText(), "O")) &&
//                        (Objects.equals(buttons[8].getText(), "O"))
//        ) {
//            oWins(2,5,8);
//        }
//        if(
//                (Objects.equals(buttons[0].getText(), "O")) &&
//                        (Objects.equals(buttons[4].getText(), "O")) &&
//                        (Objects.equals(buttons[8].getText(), "O"))
//        ) {
//            oWins(0,4,8);
//        }
//        if(
//                (Objects.equals(buttons[2].getText(), "O")) &&
//                        (Objects.equals(buttons[4].getText(), "O")) &&
//                        (Objects.equals(buttons[6].getText(), "O"))
//        ) {
//            oWins(2,4,6);
//        }
//    }


//    public void xWins(int a,int b,int c) {
//        buttons[a].setBackground(Color.GREEN);
//        buttons[b].setBackground(Color.GREEN);
//        buttons[c].setBackground(Color.GREEN);
//
//        for(int i=0;i<9;i++) {
//            buttons[i].setEnabled(false);
//        }
//        textfield.setText("X wins");
//    }
}

