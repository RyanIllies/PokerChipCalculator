package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Controller {


    //these will be the color textfields for initial color selection by user

    @FXML TextField color1tb;
    @FXML TextField color2tb;
    @FXML TextField color3tb;
    @FXML TextField color4tb;
    @FXML TextField color5tb;

    //these will be the color labels saying what is "color" worth

    @FXML Label whatiscolor1lbl;
    @FXML Label whatiscolor2lbl;
    @FXML Label whatiscolor3lbl;
    @FXML Label whatiscolor4lbl;
    @FXML Label whatiscolor5lbl;
    @FXML Label instructionslbl;

    //these will be the amount textfields for the chip colors monetary value

    @FXML TextField color1amt;
    @FXML TextField color2amt;
    @FXML TextField color3amt;
    @FXML TextField color4amt;
    @FXML TextField color5amt;


    //misc labels and txtfeilds

    @FXML Label numPlayers;
    @FXML Label buyAmount;
    @FXML TextField numPlayersBox;
    @FXML TextField buyAmountBox;
    @FXML Button btnsubmitvalue;
    @FXML Button btnSubmitQty;
    @FXML Label calcLabel;

    @FXML Label c1Label;
    @FXML Label c2Label;
    @FXML Label c3Label;
    @FXML Label c4Label;
    @FXML Label c5Label;

    //This is the button to submit the colors.

    @FXML Button btnsubmitcolors;

    //random circle thing for the chip button at the end

    @FXML Circle chipCircle;

    @FXML ImageView outputanchor;
    @FXML Label recLabel;
    @FXML Label chip1Label;
    @FXML Label chip2Label;
    @FXML Label chip3Label;
    @FXML Label chip4Label;
    @FXML Label chip5Label;

    //This is where the actual button on action events will happen
    String color1;
    String color2;
    String color3;
    String color4;
    String color5;

    Float color1Val;
    Float color2Val;
    Float color3Val;
    Float color4Val;
    Float color5Val;

    int color1Amt;
    int color2Amt;
    int color3Amt;
    int color4Amt;
    int color5Amt;

    Float buyIn;
    int playerNum;


    //this button click locks colors in and asks the user to enter amounts.
    @FXML
    public void btnSubmitColorsClick()
    {

        // in the future add an if statement to make sure there are no repeat colors.

        instructionslbl.setText("Next, enter each color's monetary value");
        whatiscolor1lbl.setVisible(true);
        whatiscolor2lbl.setVisible(true);
        whatiscolor3lbl.setVisible(true);
        whatiscolor4lbl.setVisible(true);
        whatiscolor5lbl.setVisible(true);

        color1amt.setVisible(true);
        color2amt.setVisible(true);
        color3amt.setVisible(true);
        color4amt.setVisible(true);
        color5amt.setVisible(true);


        btnsubmitcolors.setVisible(false);
        btnsubmitvalue.setVisible(true);

        whatiscolor1lbl.setText("What is "+color1tb.getText()+" worth?");
        whatiscolor2lbl.setText("What is "+color2tb.getText()+" worth?");
        whatiscolor3lbl.setText("What is "+color3tb.getText()+" worth?");
        whatiscolor4lbl.setText("What is "+color4tb.getText()+" worth?");
        whatiscolor5lbl.setText("What is "+color5tb.getText()+" worth?");

        color1tb.setEditable(false);
        color2tb.setEditable(false);
        color3tb.setEditable(false);
        color4tb.setEditable(false);
        color5tb.setEditable(false);

        color1 = color1tb.getText();
        color2 = color2tb.getText();
        color3 = color3tb.getText();
        color4 = color4tb.getText();
        color5 = color5tb.getText();



    }
    @FXML
    public void btnSubmitValueCLick()
    {

        //declare variables needed for calculations

        instructionslbl.setText("Next, Enter the quantity of each chip color you have in your set");

        btnsubmitvalue.setVisible(false);

        color1Val = Float.parseFloat(color1amt.getText());
        color2Val = Float.parseFloat(color2amt.getText());
        color3Val = Float.parseFloat(color3amt.getText());
        color4Val = Float.parseFloat(color4amt.getText());
        color5Val = Float.parseFloat(color5amt.getText());

        whatiscolor1lbl.setText("Quantity of "+color1+"'s");
        whatiscolor2lbl.setText("Quantity of "+color2+"'s");
        whatiscolor3lbl.setText("Quantity of "+color3+"'s");
        whatiscolor4lbl.setText("Quantity of "+color4+"'s");
        whatiscolor5lbl.setText("Quantity of "+color5+"'s");

        color1amt.clear();
        color2amt.clear();
        color3amt.clear();
        color4amt.clear();
        color5amt.clear();

        btnSubmitQty.setVisible(true);



    }

    @FXML
    public void btnSubmitQtyClick()
    {
        //set the amount for all of the colors

        instructionslbl.setText("Lastly, Enter the number of players in the game, and what the buy in is.");

        color1Amt = Integer.parseInt(color1amt.getText());
        color2Amt = Integer.parseInt(color2amt.getText());
        color3Amt = Integer.parseInt(color3amt.getText());
        color4Amt = Integer.parseInt(color4amt.getText());
        color5Amt = Integer.parseInt(color5amt.getText());

        //clearing the screen for other things


        c1Label.setVisible(false);
        c2Label.setVisible(false);
        c3Label.setVisible(false);
        c4Label.setVisible(false);
        c5Label.setVisible(false);

        color1tb.setVisible(false);
        color2tb.setVisible(false);
        color3tb.setVisible(false);
        color4tb.setVisible(false);
        color5tb.setVisible(false);

        whatiscolor1lbl.setVisible(false);
        whatiscolor2lbl.setVisible(false);
        whatiscolor3lbl.setVisible(false);
        whatiscolor4lbl.setVisible(false);
        whatiscolor5lbl.setVisible(false);

        color1amt.setVisible(false);
        color2amt.setVisible(false);
        color3amt.setVisible(false);
        color4amt.setVisible(false);
        color5amt.setVisible(false);

        btnSubmitQty.setVisible(false);
        //making new information available
        numPlayers.setVisible(true);
        buyAmount.setVisible(true);
        numPlayersBox.setVisible(true);
        buyAmountBox.setVisible(true);

        chipCircle.setVisible(true);
        calcLabel.setVisible(true);


        //circle combining with image
        Image im = new Image("PCD01_Red.jpg");
        chipCircle.setFill(new ImagePattern(im));
    }

    @FXML
    public void btnSubmitAllClick()
    {

        instructionslbl.setVisible(false);
        playerNum = Integer.parseInt(numPlayersBox.getText());
        buyIn = Float.parseFloat(buyAmountBox.getText());

        chipCircle.setDisable(true);
        calcLabel.setDisable(true);
        outputanchor.setVisible(true);

        System.out.println(color1 +" is worth "+color1Val+" and we have "+color1Amt+" in the set ");
        System.out.println(color2 +" is worth "+color2Val+" and we have "+color2Amt+" in the set ");
        System.out.println(color3 +" is worth "+color3Val+" and we have "+color3Amt+" in the set ");
        System.out.println(color4 +" is worth "+color4Val+" and we have "+color4Amt+" in the set ");
        System.out.println(color5 +" is worth "+color5Val+" and we have "+color5Amt+" in the set ");
        System.out.println("buy in "+buyIn.toString()+" player number"+playerNum);


        pokerChip chip1 = new pokerChip(color1,color1Val,color1Amt);
        pokerChip chip2 = new pokerChip(color2,color2Val,color2Amt);
        pokerChip chip3 = new pokerChip(color3,color3Val,color3Amt);
        pokerChip chip4 = new pokerChip(color4,color4Val,color4Amt);
        pokerChip chip5 = new pokerChip(color5,color5Val,color5Amt);
        //System.out.println("Please work");
        //System.out.println(chip1.color);
        ArrayList<pokerChip> chips = new ArrayList<pokerChip>();
        chips.add(chip1);
        chips.add(chip2);
        chips.add(chip3);
        chips.add(chip4);
        chips.add(chip5);
        chips.sort(new Comparator<pokerChip>() {
            @Override
            public int compare(pokerChip o1, pokerChip o2) {

                return Float.compare(o2.getValue(), o1.getValue());
            }
        });




        float moneyleft = buyIn;
        Float targetAmt = moneyleft/5;


        for(int i = 4;i>=0;i--) {
            if (targetAmt / chips.get(i).value <= chips.get(i).amount / playerNum)//replace maxc1 with chips.get(4).amount/playernum
            {
                chips.get(i).handoutAmount = (int) (targetAmt / chips.get(i).value);
                moneyleft -= chips.get(i).handoutAmount * chips.get(i).value;
                targetAmt = moneyleft / i;
            } else {
                chips.get(i).handoutAmount = chips.get(i).amount / playerNum;
                moneyleft -= chips.get(i).amount / playerNum * chips.get(i).value;
                targetAmt = moneyleft / i;
            }
        }

        for(int i = 4;i>=0;i--)
        {
            if(chips.get(i).handoutAmount!=chips.get(i).amount / playerNum && chips.get(i).value == moneyleft)
            {
                chips.get(i).handoutAmount+=1;
            }
            if(chips.get(i).handoutAmount!=chips.get(i).amount / playerNum && chips.get(i).value <= moneyleft) {
                chips.get(i).handoutAmount += 1;
            }
        }
        float total = 0;
        for(int i = 4;i>=0;i--)
        {
            total += chips.get(i).value*chips.get(i).handoutAmount;
        }

        if (buyIn-total > buyIn/20)
        {
            for(int x = 0;x<3;x++) {
                for (int i = 4; i >= 0; i--) {
                    if (chips.get(i).handoutAmount != chips.get(i).amount / playerNum && chips.get(i).value == moneyleft) {
                        chips.get(i).handoutAmount += 1;
                    }
                    if (chips.get(i).handoutAmount != chips.get(i).amount / playerNum && chips.get(i).value <= moneyleft + buyIn / 20) {
                        chips.get(i).handoutAmount += 1;
                    }
                }
            }
        }

        recLabel.setText("Each Player will start with $"+total+"0 and be handed the following chips to start");
        recLabel.setVisible(true);


        chip1Label.setText(chips.get(4).handoutAmount+" "+chips.get(4).color+" chips each worth $"+chips.get(4).getValue());
        chip2Label.setText(chips.get(3).handoutAmount+" "+chips.get(3).color+" chips each worth $"+chips.get(3).getValue());
        chip3Label.setText(chips.get(2).handoutAmount+" "+chips.get(2).color+" chips each worth $"+chips.get(2).getValue());
        chip4Label.setText(chips.get(1).handoutAmount+" "+chips.get(1).color+" chips each worth $"+chips.get(1).getValue());
        chip5Label.setText(chips.get(0).handoutAmount+" "+chips.get(0).color+" chips each worth $"+chips.get(0).getValue());

        chip1Label.setVisible(true);
        chip2Label.setVisible(true);
        chip3Label.setVisible(true);
        chip4Label.setVisible(true);
        chip5Label.setVisible(true);


        System.out.println("Hand out "+chips.get(4).handoutAmount+" "+chips.get(4).color+" chips.");
        System.out.println("Hand out "+chips.get(3).handoutAmount+" "+chips.get(3).color+" chips.");
        System.out.println("Hand out "+chips.get(2).handoutAmount+" "+chips.get(2).color+" chips.");
        System.out.println("Hand out "+chips.get(1).handoutAmount+" "+chips.get(1).color+" chips.");
        System.out.println("Hand out "+chips.get(0).handoutAmount+" "+chips.get(0).color+" chips.");


        System.out.println("Total money in chips is $"+total);

    }


    public class pokerChip
    {

        String color;
        float value;
        int amount;
        int handoutAmount;

        public pokerChip(String co,float va,int am)
        {
            color = co;
            value = va;
            amount = am;
            handoutAmount = 0;
        }

        public String toString()
        {
            String result = color+" "+value+" "+amount;
            return result;
        }

        public float getValue()
        {

            DecimalFormat decimalFormat = new DecimalFormat("##.00");
            return Float.parseFloat(decimalFormat.format(value));
        }



    }


}
