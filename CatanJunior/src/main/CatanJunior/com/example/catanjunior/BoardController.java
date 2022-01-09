package com.example.catanjunior;
/*Finished by Bate and Jiawei
* */
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import java.util.ArrayList;
import java.util.List;


public class BoardController {

    @FXML
    private Circle circle1;

    @FXML
    private Circle circle10;

    @FXML
    private Circle circle11;

    @FXML
    private Circle circle12;

    @FXML
    private Circle circle13;

    @FXML
    private Circle circle14;

    @FXML
    private Circle circle15;

    @FXML
    private Circle circle16;

    @FXML
    private Circle circle17;

    @FXML
    private Circle circle18;

    @FXML
    private Circle circle19;

    @FXML
    private Circle circle2;

    @FXML
    private Circle circle20;

    @FXML
    private Circle circle21;

    @FXML
    private Circle circle22;

    @FXML
    private Circle circle23;

    @FXML
    private Circle circle24;

    @FXML
    private Circle circle25;

    @FXML
    private Circle circle26;

    @FXML
    private Circle circle27;

    @FXML
    private Circle circle28;

    @FXML
    private Circle circle29;

    @FXML
    private Circle circle3;

    @FXML
    private Circle circle30;

    @FXML
    private Circle circle31;

    @FXML
    private Circle circle32;

    @FXML
    private Circle circle33;

    @FXML
    private Circle circle34;

    @FXML
    private Circle circle35;

    @FXML
    private Circle circle36;

    @FXML
    private Circle circle37;

    @FXML
    private Circle circle38;

    @FXML
    private Circle circle39;

    @FXML
    private Circle circle4;

    @FXML
    private Circle circle40;

    @FXML
    private Circle circle5;

    @FXML
    private Circle circle6;

    @FXML
    private Circle circle7;

    @FXML
    private Circle circle8;

    @FXML
    private Circle circle9;

    ////////////////////////////lines
    @FXML
    private Line line1;

    @FXML
    private Line line10;

    @FXML
    private Line line11;

    @FXML
    private Line line12;

    @FXML
    private Line line13;

    @FXML
    private Line line14;

    @FXML
    private Line line15;

    @FXML
    private Line line16;

    @FXML
    private Line line17;

    @FXML
    private Line line18;

    @FXML
    private Line line19;

    @FXML
    private Line line2;

    @FXML
    private Line line20;

    @FXML
    private Line line21;

    @FXML
    private Line line22;

    @FXML
    private Line line23;

    @FXML
    private Line line24;

    @FXML
    private Line line25;

    @FXML
    private Line line26;

    @FXML
    private Line line27;

    @FXML
    private Line line28;

    @FXML
    private Line line29;

    @FXML
    private Line line3;

    @FXML
    private Line line30;

    @FXML
    private Line line31;

    @FXML
    private Line line32;

    @FXML
    private Line line33;

    @FXML
    private Line line34;

    @FXML
    private Line line35;

    @FXML
    private Line line36;

    @FXML
    private Line line37;

    @FXML
    private Line line38;

    @FXML
    private Line line39;

    @FXML
    private Line line4;

    @FXML
    private Line line40;

    @FXML
    private Line line41;

    @FXML
    private Line line42;

    @FXML
    private Line line43;

    @FXML
    private Line line44;

    @FXML
    private Line line45;

    @FXML
    private Line line46;

    @FXML
    private Line line47;

    @FXML
    private Line line48;

    @FXML
    private Line line49;

    @FXML
    private Line line5;

    @FXML
    private Line line50;

    @FXML
    private Line line51;

    @FXML
    private Line line52;

    @FXML
    private Line line6;

    @FXML
    private Line line7;

    @FXML
    private Line line8;

    @FXML
    private Line line9;
    /////////////////////Button
    @FXML
    private Button GhostCaptainMove;

    @FXML
    private Button NextplayerButton;

    @FXML
    private Button Startlogic;

    @FXML
    private Button getCocotailes;

    @FXML
    private Button switch1;

    @FXML
    private Button switch10;

    @FXML
    private Button switch2;

    @FXML
    private Button switch3;

    @FXML
    private Button switch4;

    @FXML
    private Button switch5;

    @FXML
    private Button switch6;

    @FXML
    private Button switch7;

    @FXML
    private Button switch8;

    @FXML
    private Button switch9;

    @FXML
    private Button Ghost1;

    @FXML
    private Button Ghost11;

    @FXML
    private Button Ghost110;

    @FXML
    private Button Ghost12;

    @FXML
    private Button Ghost2;

    @FXML
    private Button Ghost3;

    @FXML
    private Button Ghost4;

    @FXML
    private Button Ghost5;

    @FXML
    private Button Ghost6;

    @FXML
    private Button Ghost7;

    @FXML
    private Button Ghost8;

    @FXML
    private Button Ghost9;

    // ///////////////////////Text
    @FXML
    private Text Culasses;

    @FXML
    private Text Goats;

    @FXML
    private Text Gold;

    @FXML
    private Text Market1;

    @FXML
    private Text Market2;

    @FXML
    private Text Market3;

    @FXML
    private Text Market4;

    @FXML
    private Text Market5;

    @FXML
    private Text Molasses;

    @FXML
    private Text Wood;

    @FXML
    private Label dice;

    @FXML
    private Text playername;


    @FXML
    private Text winlogic;

    /*Market logic, which realize 5 markets and give them different resource
*/
    void refresh()
    {
        Market1.setText(market1_.getName());
        Market2.setText(market2_.getName());
        Market3.setText(market3_.getName());
        Market4.setText(market4_.getName());
        Market5.setText(market5_.getName());
        playername.setText(current_player.getName());
        Wood.setText("Wood:" + Integer.toString(current_player.wood));
        Culasses.setText("Culasses:" + Integer.toString(current_player.cutlasses));
        Gold.setText("Gold:" + Integer.toString(current_player.gold));
        Goats.setText("Goats:" + Integer.toString(current_player.goat));
        Molasses.setText("Molasses:" + Integer.toString(current_player.molasses));

        for(Circle curent_circle: current_player.occupied_cicle)
        {
            curent_circle.setFill(current_player.color);
        }

        for(Line curent_line: current_player.occupied_line)
        {
            curent_line.setStroke(current_player.color);
        }
    }
/*    creat enum Resource,which has five resource
* */
    public enum Resource {
        CUTLASS("Cutless"),
        MOLALESS("MOLALESS"),
        GOAT ("Goat"),
        GOLD ("Gold"),
        WOOD ("Wood");

        private final String name;
        private Resource(String s){
            name = s;
        }
        public String getName(){
            return this.name ;
        }
    }
//give every market a resource
    private Resource market1_ = Resource.CUTLASS;
    private Resource market2_ = Resource.MOLALESS;
    private Resource market3_ = Resource.GOAT;
    private Resource market4_ = Resource.GOLD;
    private Resource market5_ = Resource.WOOD;

    private boolean able_to_exchange_resource = false;
    private Resource exchange_market_resouce = Resource.CUTLASS;

//initialize the game, 4 players, each one has a born place
    @FXML
    void initialize()
    {
        set_line_and_circle_occupied();
        //init value
        player1.occupied_cicle.add(circle11);
        player1.occupied_line.add(line15);
        player2.occupied_cicle.add(circle34);
        player2.occupied_line.add(line41);
        player3.occupied_cicle.add(circle18);
        player3.occupied_line.add(line22);
        player4.occupied_cicle.add(circle5);
        player4.occupied_line.add(line11);
        refresh();
    }



    @FXML
    void ClickCocotailes() {

    }

    @FXML
    void ClickGhostCaptainMove() {

    }

    @FXML
    void ClickSwitch10() {
        if(current_player.gold >=2)
        {
            current_player.gold -=2;
            able_to_exchange_resource = true;
            exchange_market_resouce = Resource.GOLD;
        }
        refresh();
    }

    @FXML
    void ClickSwitch2() {
        if (able_to_exchange_resource)
        {
            if(market2_.name.equals(Resource.CUTLASS.getName()))
            {
                current_player.cutlasses ++;
                able_to_exchange_resource = false;
                market2_ = exchange_market_resouce;
            }
            if(market2_.name.equals(Resource.MOLALESS.getName()))
            {
                current_player.molasses ++;
                able_to_exchange_resource = false;
                market2_ = exchange_market_resouce;
            }
            if(market2_.name.equals(Resource.GOAT.getName()))
            {
                current_player.goat ++;
                able_to_exchange_resource = false;
                market2_ = exchange_market_resouce;
            }
            if(market2_.name.equals(Resource.GOLD.getName()))
            {
                current_player.gold++;
                able_to_exchange_resource = false;
                market2_ = exchange_market_resouce;
            }
            if(market2_.name.equals(Resource.WOOD.getName()))
            {
                current_player.wood ++;
                able_to_exchange_resource = false;
                market2_ = exchange_market_resouce;
            }
        }
        refresh();
    }

    @FXML
    void ClickSwitch3() {
        if (able_to_exchange_resource)
        {
            if(market3_.name.equals(Resource.CUTLASS.getName()))
            {
                current_player.cutlasses ++;
                able_to_exchange_resource = false;
                market3_ = exchange_market_resouce;
            }
            if(market3_.name.equals(Resource.MOLALESS.getName()))
            {
                current_player.molasses ++;
                able_to_exchange_resource = false;
                market3_ = exchange_market_resouce;
            }
            if(market3_.name.equals(Resource.GOAT.getName()))
            {
                current_player.goat ++;
                able_to_exchange_resource = false;
                market3_ = exchange_market_resouce;
            }
            if(market3_.name.equals(Resource.GOLD.getName()))
            {
                current_player.gold++;
                able_to_exchange_resource = false;
                market3_ = exchange_market_resouce;
            }
            if(market3_.name.equals(Resource.WOOD.getName()))
            {
                current_player.wood ++;
                able_to_exchange_resource = false;
                market3_ = exchange_market_resouce;
            }
        }
        refresh();

    }

    @FXML
    void ClickSwitch4() {
        if (able_to_exchange_resource)
        {
            if(market4_.name.equals(Resource.CUTLASS.getName()))
            {
                current_player.cutlasses ++;
                able_to_exchange_resource = false;
                market4_ = exchange_market_resouce;
            }
            if(market4_.name.equals(Resource.MOLALESS.getName()))
            {
                current_player.molasses ++;
                able_to_exchange_resource = false;
                market4_ = exchange_market_resouce;
            }
            if(market4_.name.equals(Resource.GOAT.getName()))
            {
                current_player.goat ++;
                able_to_exchange_resource = false;
                market4_ = exchange_market_resouce;
            }
            if(market4_.name.equals(Resource.GOLD.getName()))
            {
                current_player.gold++;
                able_to_exchange_resource = false;
                market4_ = exchange_market_resouce;
            }
            if(market4_.name.equals(Resource.WOOD.getName()))
            {
                current_player.wood ++;
                able_to_exchange_resource = false;
                market4_ = exchange_market_resouce;
            }
        }
        refresh();
    }

    @FXML
    void ClickSwitch5() {
        if (able_to_exchange_resource)
        {
            if(market5_.name.equals(Resource.CUTLASS.getName()))
            {
                current_player.cutlasses ++;
                able_to_exchange_resource = false;
                market5_ = exchange_market_resouce;
            }
            if(market5_.name.equals(Resource.MOLALESS.getName()))
            {
                current_player.molasses ++;
                able_to_exchange_resource = false;
                market5_ = exchange_market_resouce;
            }
            if(market5_.name.equals(Resource.GOAT.getName()))
            {
                current_player.goat ++;
                able_to_exchange_resource = false;
                market5_ = exchange_market_resouce;
            }
            if(market5_.name.equals(Resource.GOLD.getName()))
            {
                current_player.gold++;
                able_to_exchange_resource = false;
                market5_ = exchange_market_resouce;
            }
            if(market5_.name.equals(Resource.WOOD.getName()))
            {
                current_player.wood ++;
                able_to_exchange_resource = false;
                market5_ = exchange_market_resouce;
            }
        }
        refresh();
    }

    @FXML
    void ClickSwitch6() {
        if(current_player.cutlasses >=2)
        {
            current_player.cutlasses -=2;
            able_to_exchange_resource = true;
            exchange_market_resouce = Resource.CUTLASS;
        }
        refresh();
    }

    @FXML
    void ClickSwitch7() {
        if(current_player.goat >=2)
        {
            current_player.goat -=2;
            able_to_exchange_resource = true;
            exchange_market_resouce = Resource.GOAT;
        }
        refresh();
    }

    @FXML
    void ClickSwitch8() {
        if(current_player.molasses >=2)
        {
            current_player.molasses -=2;
            able_to_exchange_resource = true;
            exchange_market_resouce = Resource.MOLALESS;
        }
        refresh();
    }

    @FXML
    void ClickSwitch9() {
        if(current_player.wood >=2)
        {
            current_player.wood -=2;
            able_to_exchange_resource = true;
            exchange_market_resouce = Resource.WOOD;
        }
        refresh();
    }


    @FXML
    void clickSwitch1() {
        if (able_to_exchange_resource)
        {
            if(market1_.name.equals(Resource.CUTLASS.name()))
            {
                current_player.cutlasses ++;
                able_to_exchange_resource = false;
                market1_ = exchange_market_resouce;
            }
            if(market1_.name.equals(Resource.MOLALESS.name()))
            {
                current_player.molasses ++;
                able_to_exchange_resource = false;
                market1_ = exchange_market_resouce;
            }
            if(market1_.name.equals(Resource.GOAT.name()))
            {
                current_player.goat ++;
                able_to_exchange_resource = false;
                market1_ = exchange_market_resouce;
            }
            if(market1_.name.equals(Resource.GOLD.name()))
            {
                current_player.gold++;
                able_to_exchange_resource = false;
                market1_ = exchange_market_resouce;
            }
            if(market1_.name.equals(Resource.WOOD.name()))
            {
                current_player.wood ++;
                able_to_exchange_resource = false;
                market1_ = exchange_market_resouce;
            }
        }
        refresh();
    }

    boolean able_to_click_circle()
    {
        if (current_player.cutlasses >=1 && current_player.molasses >=1 && current_player.goat >= 1 && current_player.wood >=1)
        {
            return true;
        }
        return false;
    }

    boolean able_to_click_line()
    {
        if (current_player.goat >= 1 && current_player.wood >=1)
        {
            return true;
        }
        return false;
    }

    void pay_circle_fee(Circle inuput_circle)
    {
        current_player.cutlasses--;
        current_player.molasses--;
        current_player.goat--;
        current_player.wood--;
        current_player.occupied_cicle.add(inuput_circle);
    }

    void pay_line_fee(Line input_line)
    {
        current_player.goat--;
        current_player.wood--;
        current_player.occupied_line.add(input_line);
    }

    boolean already_occupied_line(Line input_line)
    {
        for (Line c : player1.occupied_line)
        {
            if (c.equals(input_line))return true;
        }
        for (Line c : player2.occupied_line)
        {
            if (c.equals(input_line))return true;
        }
        for (Line c : player3.occupied_line)
        {
            if (c.equals(input_line))return true;
        }
        for (Line c : player4.occupied_line)
        {
            if (c.equals(input_line))return true;
        }
        return false;
    }

    boolean already_occupied_circle(Circle input_circle)
    {
        for (Circle c : player1.occupied_cicle)
        {
            if (c.equals(input_circle))return true;
        }
        for (Circle c : player2.occupied_cicle)
        {
            if (c.equals(input_circle))return true;
        }
        for (Circle c : player3.occupied_cicle)
        {
            if (c.equals(input_circle))return true;
        }
        for (Circle c : player4.occupied_cicle)
        {
            if (c.equals(input_circle))return true;
        }
        return false;
    }


    @FXML
    void circleclick1() {
        if (able_to_click_circle() && !already_occupied_circle(circle1))
        {
            pay_circle_fee(circle1);
        }
        refresh();
    }

    @FXML
    void circleclick10() {
        if (able_to_click_circle() && !already_occupied_circle(circle10))
        {
            pay_circle_fee(circle10);
        }
        refresh();
    }

    @FXML
    void circleclick11() {
        if (able_to_click_circle() && !already_occupied_circle(circle11))
        {
            pay_circle_fee(circle11);
        }
        refresh();
    }

    @FXML
    void circleclick12() {
        if (able_to_click_circle() && !already_occupied_circle(circle12))
        {
            pay_circle_fee(circle12);
        }
        refresh();
    }

    @FXML
    void circleclick13() {
        if (able_to_click_circle() && !already_occupied_circle(circle13))
        {
            pay_circle_fee(circle13);
        }
        refresh();
    }

    @FXML
    void circleclick14() {
        if (able_to_click_circle() && !already_occupied_circle(circle14))
        {
            pay_circle_fee(circle14);
        }
        refresh();
    }

    @FXML
    void circleclick15() {
        if (able_to_click_circle() && !already_occupied_circle(circle15))
        {
            pay_circle_fee(circle15);
        }
        refresh();
    }

    @FXML
    void circleclick16() {
        if (able_to_click_circle() && !already_occupied_circle(circle16))
        {
            pay_circle_fee(circle16);
        }
        refresh();
    }

    @FXML
    void circleclick17() {
        if (able_to_click_circle() && !already_occupied_circle(circle17))
        {
            pay_circle_fee(circle17);
        }
        refresh();
    }

    @FXML
    void circleclick18() {
        if (able_to_click_circle() && !already_occupied_circle(circle18))
        {
            pay_circle_fee(circle18);
        }
        refresh();
    }

    @FXML
    void circleclick19() {
        if (able_to_click_circle() && !already_occupied_circle(circle19))
        {
            pay_circle_fee(circle19);
        }
        refresh();
    }

    @FXML
    void circleclick2() {
        if (able_to_click_circle() && !already_occupied_circle(circle2))
        {
            pay_circle_fee(circle2);
        }
        refresh();
    }

    @FXML
    void circleclick20() {
        if (able_to_click_circle() && !already_occupied_circle(circle20))
        {
            pay_circle_fee(circle20);
        }
        refresh();
    }

    @FXML
    void circleclick21() {
        if (able_to_click_circle() && !already_occupied_circle(circle21))
        {
            pay_circle_fee(circle21);
        }
        refresh();
    }

    @FXML
    void circleclick22() {
        if (able_to_click_circle() && !already_occupied_circle(circle22))
        {
            pay_circle_fee(circle22);
        }
        refresh();
    }

    @FXML
    void circleclick23() {
        if (able_to_click_circle() && !already_occupied_circle(circle23))
        {
            pay_circle_fee(circle23);
        }
        refresh();
    }

    @FXML
    void circleclick24() {
        if (able_to_click_circle() && !already_occupied_circle(circle24))
        {
            pay_circle_fee(circle24);
        }
        refresh();
    }

    @FXML
    void circleclick25() {
        if (able_to_click_circle() && !already_occupied_circle(circle25))
        {
            pay_circle_fee(circle25);
        }
        refresh();
    }

    @FXML
    void circleclick26() {
        if (able_to_click_circle() && !already_occupied_circle(circle26))
        {
            pay_circle_fee(circle26);
        }
        refresh();
    }

    @FXML
    void circleclick27() {
        if (able_to_click_circle() && !already_occupied_circle(circle27))
        {
            pay_circle_fee(circle27);
        }
        refresh();
    }

    @FXML
    void circleclick28() {
        if (able_to_click_circle() && !already_occupied_circle(circle28))
        {
            pay_circle_fee(circle28);
        }
        refresh();
    }

    @FXML
    void circleclick29() {
        if (able_to_click_circle() && !already_occupied_circle(circle29))
        {
            pay_circle_fee(circle29);
        }
        refresh();
    }

    @FXML
    void circleclick3() {
        if (able_to_click_circle() && !already_occupied_circle(circle3))
        {
            pay_circle_fee(circle3);
        }
        refresh();
    }

    @FXML
    void circleclick30() {
        if (able_to_click_circle() && !already_occupied_circle(circle30))
        {
            pay_circle_fee(circle30);
        }
        refresh();
    }

    @FXML
    void circleclick31() {
        if (able_to_click_circle() && !already_occupied_circle(circle31))
        {
            pay_circle_fee(circle31);
        }
        refresh();
    }

    @FXML
    void circleclick32() {
        if (able_to_click_circle() && !already_occupied_circle(circle32))
        {
            pay_circle_fee(circle32);
        }
        refresh();
    }

    @FXML
    void circleclick33() {
        if (able_to_click_circle() && !already_occupied_circle(circle33))
        {
            pay_circle_fee(circle33);
        }
        refresh();
    }

    @FXML
    void circleclick34() {
        if (able_to_click_circle() && !already_occupied_circle(circle34))
        {
            pay_circle_fee(circle34);
        }
        refresh();
    }

    @FXML
    void circleclick35() {
        if (able_to_click_circle() && !already_occupied_circle(circle35))
        {
            pay_circle_fee(circle35);
        }
        refresh();
    }

    @FXML
    void circleclick36() {
        if (able_to_click_circle() && !already_occupied_circle(circle36))
        {
            pay_circle_fee(circle36);
        }
        refresh();
    }

    @FXML
    void circleclick37() {
        if (able_to_click_circle() && !already_occupied_circle(circle37))
        {
            pay_circle_fee(circle37);
        }
        refresh();
    }

    @FXML
    void circleclick38() {
        if (able_to_click_circle() && !already_occupied_circle(circle38))
        {
            pay_circle_fee(circle38);
        }
        refresh();
    }

    @FXML
    void circleclick39() {
        if (able_to_click_circle() && !already_occupied_circle(circle39))
        {
            pay_circle_fee(circle39);
        }
        refresh();
    }

    @FXML
    void circleclick4() {
        if (able_to_click_circle() && !already_occupied_circle(circle4))
        {
            pay_circle_fee(circle4);
        }
        refresh();
    }

    @FXML
    void circleclick40() {
        if (able_to_click_circle() && !already_occupied_circle(circle40))
        {
            pay_circle_fee(circle40);
        }
        refresh();
    }

    @FXML
    void circleclick5() {
        if (able_to_click_circle() && !already_occupied_circle(circle5))
        {
            pay_circle_fee(circle5);
        }
        refresh();
    }

    @FXML
    void circleclick6() {
        if (able_to_click_circle() && !already_occupied_circle(circle6))
        {
            pay_circle_fee(circle6);
        }
        refresh();
    }

    @FXML
    void circleclick7() {
        if (able_to_click_circle() && !already_occupied_circle(circle7))
        {
            pay_circle_fee(circle7);
        }
        refresh();
    }

    @FXML
    void circleclick8() {
        if (able_to_click_circle() && !already_occupied_circle(circle8))
        {
            pay_circle_fee(circle8);
        }
        refresh();
    }

    @FXML
    void circleclick9() {
        if (able_to_click_circle() && !already_occupied_circle(circle9))
        {
            pay_circle_fee(circle9);
        }
        refresh();
    }

    @FXML
    void lineClick1() {
        if (able_to_click_line() && !already_occupied_line(line1))
        {
            pay_line_fee(line1);
        }
        refresh();

    }

    @FXML
    void lineClick10() {
        if (able_to_click_line() && !already_occupied_line(line10))
        {
            pay_line_fee(line10);
        }
        refresh();
    }

    @FXML
    void lineClick11() {
        if (able_to_click_line() && !already_occupied_line(line11))
        {
            pay_line_fee(line11);
        }
        refresh();
    }

    @FXML
    void lineClick12() {
        if (able_to_click_line() && !already_occupied_line(line12))
        {
            pay_line_fee(line12);
        }
        refresh();
    }

    @FXML
    void lineClick13() {
        if (able_to_click_line() && !already_occupied_line(line13))
        {
            pay_line_fee(line13);
        }
        refresh();
    }

    @FXML
    void lineClick14() {
        if (able_to_click_line() && !already_occupied_line(line14))
        {
            pay_line_fee(line14);
        }
        refresh();
    }

    @FXML
    void lineClick15() {
        if (able_to_click_line() && !already_occupied_line(line15))
        {
            pay_line_fee(line15);
        }
        refresh();
    }

    @FXML
    void lineClick16() {
        if (able_to_click_line() && !already_occupied_line(line16))
        {
            pay_line_fee(line16);
        }
        refresh();
    }

    @FXML
    void lineClick17() {
        if (able_to_click_line() && !already_occupied_line(line17))
        {
            pay_line_fee(line17);
        }
        refresh();
    }

    @FXML
    void lineClick18() {
        if (able_to_click_line() && !already_occupied_line(line18))
        {
            pay_line_fee(line18);
        }
        refresh();
    }

    @FXML
    void lineClick19() {
        if (able_to_click_line() && !already_occupied_line(line19))
        {
            pay_line_fee(line19);
        }
        refresh();
    }

    @FXML
    void lineClick2() {
        if (able_to_click_line() && !already_occupied_line(line2))
        {
            pay_line_fee(line2);
        }
        refresh();
    }

    @FXML
    void lineClick20() {
        if (able_to_click_line() && !already_occupied_line(line20))
        {
            pay_line_fee(line20);
        }
        refresh();
    }

    @FXML
    void lineClick21() {
        if (able_to_click_line() && !already_occupied_line(line21))
        {
            pay_line_fee(line21);
        }
        refresh();
    }

    @FXML
    void lineClick22() {
        if (able_to_click_line() && !already_occupied_line(line22))
        {
            pay_line_fee(line22);
        }
        refresh();
    }

    @FXML
    void lineClick23() {
        if (able_to_click_line() && !already_occupied_line(line23))
        {
            pay_line_fee(line23);
        }
        refresh();
    }

    @FXML
    void lineClick24() {
        if (able_to_click_line() && !already_occupied_line(line24))
        {
            pay_line_fee(line24);
        }
        refresh();
    }

    @FXML
    void lineClick25() {
        if (able_to_click_line() && !already_occupied_line(line25))
        {
            pay_line_fee(line25);
        }
        refresh();
    }

    @FXML
    void lineClick26() {
        if (able_to_click_line() && !already_occupied_line(line26))
        {
            pay_line_fee(line26);
        }
        refresh();
    }

    @FXML
    void lineClick27() {
        if (able_to_click_line() && !already_occupied_line(line27))
        {
            pay_line_fee(line27);
        }
        refresh();
    }

    @FXML
    void lineClick28() {
        if (able_to_click_line() && !already_occupied_line(line28))
        {
            pay_line_fee(line28);
        }
        refresh();
    }

    @FXML
    void lineClick29() {
        if (able_to_click_line() && !already_occupied_line(line29))
        {
            pay_line_fee(line29);
        }
        refresh();
    }

    @FXML
    void lineClick3() {
        if (able_to_click_line() && !already_occupied_line(line3))
        {
            pay_line_fee(line3);
        }
        refresh();
    }

    @FXML
    void lineClick30() {
        if (able_to_click_line() && !already_occupied_line(line30))
        {
            pay_line_fee(line30);
        }
        refresh();
    }

    @FXML
    void lineClick31() {
        if (able_to_click_line() && !already_occupied_line(line31))
        {
            pay_line_fee(line31);
        }
        refresh();
    }

    @FXML
    void lineClick32() {
        if (able_to_click_line() && !already_occupied_line(line32))
        {
            pay_line_fee(line32);
        }
        refresh();
    }

    @FXML
    void lineClick34() {
        if (able_to_click_line() && !already_occupied_line(line34))
        {
            pay_line_fee(line34);
        }
        refresh();
    }

    @FXML
    void lineClick35() {
        if (able_to_click_line() && !already_occupied_line(line35))
        {
            pay_line_fee(line35);
        }
        refresh();
    }

    @FXML
    void lineClick36() {
        if (able_to_click_line() && !already_occupied_line(line36))
        {
            pay_line_fee(line36);
        }
        refresh();
    }

    @FXML
    void lineClick37() {
        if (able_to_click_line() && !already_occupied_line(line37))
        {
            pay_line_fee(line37);
        }
        refresh();
    }

    @FXML
    void lineClick38() {
        if (able_to_click_line() && !already_occupied_line(line38))
        {
            pay_line_fee(line38);
        }
        refresh();
    }

    @FXML
    void lineClick39() {
        if (able_to_click_line() && !already_occupied_line(line39))
        {
            pay_line_fee(line39);
        }
        refresh();
    }

    @FXML
    void lineClick4() {
        if (able_to_click_line() && !already_occupied_line(line4))
        {
            pay_line_fee(line4);
        }
        refresh();
    }

    @FXML
    void lineClick40() {
        if (able_to_click_line() && !already_occupied_line(line40))
        {
            pay_line_fee(line40);
        }
        refresh();
    }

    @FXML
    void lineClick41() {
        if (able_to_click_line() && !already_occupied_line(line41))
        {
            pay_line_fee(line41);
        }
        refresh();
    }

    @FXML
    void lineClick42() {
        if (able_to_click_line() && !already_occupied_line(line42))
        {
            pay_line_fee(line42);
        }
        refresh();
    }

    @FXML
    void lineClick43() {
        if (able_to_click_line() && !already_occupied_line(line43))
        {
            pay_line_fee(line43);
        }
        refresh();
    }

    @FXML
    void lineClick44() {
        if (able_to_click_line() && !already_occupied_line(line44))
        {
            pay_line_fee(line44);
        }
        refresh();
    }

    @FXML
    void lineClick45() {
        if (able_to_click_line() && !already_occupied_line(line45))
        {
            pay_line_fee(line45);
        }
        refresh();
    }

    @FXML
    void lineClick46() {
        if (able_to_click_line() && !already_occupied_line(line46))
        {
            pay_line_fee(line46);
        }
        refresh();
    }

    @FXML
    void lineClick47() {
        if (able_to_click_line() && !already_occupied_line(line47))
        {
            pay_line_fee(line47);
        }
        refresh();
    }

    @FXML
    void lineClick48() {
        if (able_to_click_line() && !already_occupied_line(line48))
        {
            pay_line_fee(line48);
        }
        refresh();
    }

    @FXML
    void lineClick49() {
        if (able_to_click_line() && !already_occupied_line(line49))
        {
            pay_line_fee(line49);
        }
        refresh();
    }

    @FXML
    void lineClick5() {
        if (able_to_click_line() && !already_occupied_line(line5))
        {
            pay_line_fee(line5);
        }
        refresh();
    }

    @FXML
    void lineClick50() {
        if (able_to_click_line() && !already_occupied_line(line50))
        {
            pay_line_fee(line50);
        }
        refresh();
    }

    @FXML
    void lineClick51() {
        if (able_to_click_line() && !already_occupied_line(line51))
        {
            pay_line_fee(line51);
        }
        refresh();
    }

    @FXML
    void lineClick52() {
        if (able_to_click_line() && !already_occupied_line(line52))
        {
            pay_line_fee(line52);
        }
        refresh();
    }

    @FXML
    void lineClick6() {
        if (able_to_click_line() && !already_occupied_line(line6))
        {
            pay_line_fee(line6);
        }
        refresh();
    }

    @FXML
    void lineClick7() {
        if (able_to_click_line() && !already_occupied_line(line7))
        {
            pay_line_fee(line7);
        }
        refresh();
    }

    @FXML
    void lineClick8() {
        if (able_to_click_line() && !already_occupied_line(line8))
        {
            pay_line_fee(line8);
        }
        refresh();
    }

    @FXML
    void lineClick9() {
        if (able_to_click_line() && !already_occupied_line(line9))
        {
            pay_line_fee(line9);
        }
        refresh();
    }
    @FXML
    void ClickGhost1() {

    }

    @FXML
    void ClickGhost10() {

    }

    @FXML
    void ClickGhost11() {

    }

    @FXML
    void ClickGhost12() {

    }

    @FXML
    void ClickGhost2() {

    }

    @FXML
    void ClickGhost3() {

    }

    @FXML
    void ClickGhost4() {

    }

    @FXML
    void ClickGhost5() {

    }

    @FXML
    void ClickGhost6() {

    }

    @FXML
    void ClickGhost7() {

    }

    @FXML
    void ClickGhost8() {

    }

    @FXML
    void ClickGhost9() {

    }

    public List<Circle> one_number_cl_circle = new ArrayList<Circle>();
    public List<Circle> one_number_wood_circle = new ArrayList<Circle>();
    public List<Circle> one_number_goat_circle = new ArrayList<Circle>();

    public List<Circle> two_number_wood_circle = new ArrayList<Circle>();
    public List<Circle> two_number_ml_circle = new ArrayList<Circle>();
    public List<Circle> two_number_goat_circle = new ArrayList<Circle>();

    public List<Circle> three_number_gold_circle = new ArrayList<Circle>();
    public List<Circle> three_number_wood_circle = new ArrayList<Circle>();

    public List<Circle> four_number_cl_circle = new ArrayList<Circle>();
    public List<Circle> four_number_ml_circle = new ArrayList<Circle>();
    public List<Circle> five_number_gold_circle = new ArrayList<Circle>();
    public List<Circle> five_number_goat_circle = new ArrayList<Circle>();


    public List<Line> one_number_cl_line = new ArrayList<Line>();
    public List<Line> one_number_wood_line = new ArrayList<Line>();
    public List<Line> one_number_goat_line = new ArrayList<Line>();

    public List<Line> two_number_wood_line = new ArrayList<Line>();
    public List<Line> two_number_ml_line = new ArrayList<Line>();
    public List<Line> two_number_goat_line = new ArrayList<Line>();

    public List<Line> three_number_gold_line = new ArrayList<Line>();
    public List<Line> three_number_wood_line = new ArrayList<Line>();

    public List<Line> four_number_cl_line = new ArrayList<Line>();
    public List<Line> four_number_ml_line = new ArrayList<Line>();
    public List<Line> five_number_gold_line = new ArrayList<Line>();
    public List<Line> five_number_goat_line = new ArrayList<Line>();


    private void set_line_and_circle_occupied()
    {
        one_number_cl_circle.add(circle22);
        one_number_cl_circle.add(circle32);
        one_number_cl_circle.add(circle23);
        one_number_cl_circle.add(circle33);
        one_number_cl_circle.add(circle34);
        one_number_cl_circle.add(circle24);
        one_number_goat_circle.add(circle26);
        one_number_goat_circle.add(circle36);
        one_number_goat_circle.add(circle27);
        one_number_goat_circle.add(circle37);
        one_number_goat_circle.add(circle28);
        one_number_goat_circle.add(circle38);
        one_number_wood_circle.add(circle3);
        one_number_wood_circle.add(circle13);
        one_number_wood_circle.add(circle4);
        one_number_wood_circle.add(circle14);
        one_number_wood_circle.add(circle5);
        one_number_wood_circle.add(circle15);

        two_number_wood_circle.add(circle24);
        two_number_wood_circle.add(circle34);
        two_number_wood_circle.add(circle25);
        two_number_wood_circle.add(circle35);
        two_number_wood_circle.add(circle26);
        two_number_wood_circle.add(circle36);
        two_number_ml_circle.add(circle28);
        two_number_ml_circle.add(circle38);
        two_number_ml_circle.add(circle29);
        two_number_ml_circle.add(circle39);
        two_number_ml_circle.add(circle30);
        two_number_ml_circle.add(circle40);
        two_number_goat_circle.add(circle5);
        two_number_goat_circle.add(circle15);
        two_number_goat_circle.add(circle6);
        two_number_goat_circle.add(circle16);
        two_number_goat_circle.add(circle7);
        two_number_goat_circle.add(circle17);

        three_number_wood_circle.add(circle10);
        three_number_wood_circle.add(circle21);
        three_number_wood_circle.add(circle11);
        three_number_wood_circle.add(circle22);
        three_number_wood_circle.add(circle12);
        three_number_wood_circle.add(circle23);
        three_number_gold_circle.add(circle16);
        three_number_gold_circle.add(circle27);
        three_number_gold_circle.add(circle17);
        three_number_gold_circle.add(circle28);
        three_number_gold_circle.add(circle18);
        three_number_gold_circle.add(circle29);


        four_number_cl_circle.add(circle1);
        four_number_cl_circle.add(circle11);
        four_number_cl_circle.add(circle2);
        four_number_cl_circle.add(circle12);
        four_number_cl_circle.add(circle3);
        four_number_cl_circle.add(circle13);
        four_number_ml_circle.add(circle7);
        four_number_ml_circle.add(circle17);
        four_number_ml_circle.add(circle8);
        four_number_ml_circle.add(circle18);
        four_number_ml_circle.add(circle9);
        four_number_ml_circle.add(circle19);


        five_number_gold_circle.add(circle12);
        five_number_gold_circle.add(circle23);
        five_number_gold_circle.add(circle13);
        five_number_gold_circle.add(circle24);
        five_number_gold_circle.add(circle14);
        five_number_gold_circle.add(circle15);
        five_number_goat_circle.add(circle18);
        five_number_goat_circle.add(circle29);
        five_number_goat_circle.add(circle19);
        five_number_goat_circle.add(circle30);
        five_number_goat_circle.add(circle20);
        five_number_goat_circle.add(circle31);

        one_number_cl_line.add(line31);
        one_number_cl_line.add(line40);
        one_number_cl_line.add(line45);
        one_number_cl_line.add(line32);
        one_number_cl_line.add(line41);
        one_number_cl_line.add(line46);
        one_number_wood_line.add(line3);
        one_number_wood_line.add(line10);
        one_number_wood_line.add(line17);
        one_number_wood_line.add(line18);
        one_number_wood_line.add(line11);
        one_number_wood_line.add(line4);
        one_number_goat_line.add(line35);
        one_number_goat_line.add(line42);
        one_number_goat_line.add(line49);
        one_number_goat_line.add(line50);
        one_number_goat_line.add(line43);
        one_number_goat_line.add(line36);


        two_number_wood_line.add(line33);
        two_number_wood_line.add(line41);
        two_number_wood_line.add(line47);
        two_number_wood_line.add(line48);
        two_number_wood_line.add(line42);
        two_number_wood_line.add(line34);
        two_number_goat_line.add(line5);
        two_number_goat_line.add(line11);
        two_number_goat_line.add(line19);
        two_number_goat_line.add(line20);
        two_number_goat_line.add(line12);
        two_number_goat_line.add(line6);
        two_number_ml_line.add(line37);
        two_number_ml_line.add(line43);
        two_number_ml_line.add(line51);
        two_number_ml_line.add(line52);
        two_number_ml_line.add(line44);
        two_number_ml_line.add(line38);

        three_number_wood_line.add(line14);
        three_number_wood_line.add(line24);
        three_number_wood_line.add(line30);
        three_number_wood_line.add(line31);
        three_number_wood_line.add(line25);
        three_number_wood_line.add(line15);
        three_number_gold_line.add(line20);
        three_number_gold_line.add(line27);
        three_number_gold_line.add(line36);
        three_number_gold_line.add(line37);
        three_number_gold_line.add(line28);
        three_number_gold_line.add(line21);


        four_number_cl_line.add(line1);
        four_number_cl_line.add(line9);
        four_number_cl_line.add(line15);
        four_number_cl_line.add(line16);
        four_number_cl_line.add(line10);
        four_number_cl_line.add(line2);
        four_number_ml_line.add(line7);
        four_number_ml_line.add(line12);
        four_number_ml_line.add(line21);
        four_number_ml_line.add(line22);
        four_number_ml_line.add(line13);
        four_number_ml_line.add(line8);


        five_number_gold_line.add(line16);
        five_number_gold_line.add(line25);
        five_number_gold_line.add(line32);
        five_number_gold_line.add(line33);
        five_number_gold_line.add(line26);
        five_number_gold_line.add(line17);
        five_number_goat_line.add(line22);
        five_number_goat_line.add(line28);
        five_number_goat_line.add(line38);
        five_number_goat_line.add(line39);
        five_number_goat_line.add(line29);
        five_number_goat_line.add(line33);
    }

    public enum PlayerNumber {
        PLAYER1 ("PLAYER1",0, Color.RED, 5 , 5 ,5 ,5 , 5),
        PLAYER2 ("PLAYER2",1, Color.BLUE, 5 , 5,5,5 , 5),
        PLAYER3 ("PLAYER3",2, Color.YELLOW, 0 , 0 ,0 ,0 , 0),
        PLAYER4 ("PLAYER4",3, Color.GREEN, 0 , 0 ,0 ,0 , 0);
        private final String name;
        private final int index;
        private final Color color;
        public int cutlasses;
        public int goat;
        public int gold;
        public int molasses;
        public int wood;

        public List<Circle> occupied_cicle = new ArrayList<Circle>();
        public List<Line> occupied_line = new ArrayList<Line>();

        private PlayerNumber(String s, int i,Color c, int cut, int goat, int gold, int molasses, int wood ){
            this.name = s;  // String for name of Suspect
            this.index = i; // int for index of SuspectCard
            this.color = c;
            this.cutlasses = cut;
            this.goat = goat;
            this.gold = gold;
            this.molasses = molasses;
            this.wood = wood;
        }
        public String getName(){
            return this.name;
        }
        public int getIndex() {
            return this.index;
        }
    }

    private PlayerNumber player1 = PlayerNumber.PLAYER1;
    private PlayerNumber player2 = PlayerNumber.PLAYER2;
    private PlayerNumber player3 = PlayerNumber.PLAYER3;
    private PlayerNumber player4 = PlayerNumber.PLAYER4;

    private PlayerNumber current_player = player1;

    private PlayerNumber get_next_player(PlayerNumber player)
    {
        if(player.getIndex() == 0)
        {
            return player2;
        }
        else if(player.getIndex() == 1)
        {
            return player3;
        }
        else if(player.getIndex() == 2)
        {
            return player4;
        }
        else{
            assert(player.getIndex() == 3);
            return player1;
        }
    }

    @FXML
    protected void clickNextplayerButton() {
        current_player = get_next_player(current_player);
        refresh();
    }

    public int number_in_circle_array(List<Circle> query, List<Circle> target)
    {
        int counter = 0;
        for (Circle circle1: query)
        {
            for (Circle circle2: target)
            {
                if(circle1.equals(circle2))
                {
                    counter++;
                }
            }
        }
        return counter;
    }

    public int number_in_line_array(List<Line> query, List<Line> target)
    {
        int counter = 0;
        for (Line Line1: query)
        {
            for (Line Line2: target)
            {
                if(Line1.equals(Line2))
                {
                    counter++;
                }
            }
        }
        return counter;
    }

    @FXML
    protected void DiceClick() {
        int number;
        number = (int) (Math.random() * 6.0D) + 1;
        this.dice.setText(Integer.toString(number));

        if (number == 1)
        {
            current_player.cutlasses += number_in_circle_array(current_player.occupied_cicle, one_number_cl_circle);
            current_player.goat += number_in_circle_array(current_player.occupied_cicle, one_number_goat_circle);
            current_player.wood += number_in_circle_array(current_player.occupied_cicle, one_number_wood_circle);
            current_player.cutlasses += number_in_line_array(current_player.occupied_line, one_number_cl_line);
            current_player.goat += number_in_line_array(current_player.occupied_line, one_number_goat_line);
            current_player.wood += number_in_line_array(current_player.occupied_line, one_number_wood_line);
        }
        else if (number == 2)
        {
            current_player.goat += number_in_circle_array(current_player.occupied_cicle, two_number_goat_circle);
            current_player.molasses += number_in_circle_array(current_player.occupied_cicle, two_number_ml_circle);
            current_player.wood += number_in_circle_array(current_player.occupied_cicle, two_number_wood_circle);
            current_player.goat += number_in_line_array(current_player.occupied_line, two_number_goat_line);
            current_player.molasses += number_in_line_array(current_player.occupied_line, two_number_ml_line);
            current_player.wood += number_in_line_array(current_player.occupied_line, two_number_wood_line);
        }
        else if (number == 3)
        {
            current_player.gold += number_in_circle_array(current_player.occupied_cicle, three_number_gold_circle);
            current_player.wood += number_in_circle_array(current_player.occupied_cicle, three_number_wood_circle);
            current_player.gold += number_in_line_array(current_player.occupied_line, three_number_gold_line);
            current_player.wood += number_in_line_array(current_player.occupied_line, three_number_wood_line);
        }
        else if (number == 4)
        {
            current_player.cutlasses += number_in_circle_array(current_player.occupied_cicle, four_number_cl_circle);
            current_player.molasses += number_in_circle_array(current_player.occupied_cicle, four_number_ml_circle);
            current_player.cutlasses += number_in_line_array(current_player.occupied_line, four_number_cl_line);
            current_player.molasses += number_in_line_array(current_player.occupied_line, four_number_ml_line);
        }
        else if (number == 5)
        {
            current_player.goat += number_in_circle_array(current_player.occupied_cicle, five_number_goat_circle);
            current_player.gold += number_in_circle_array(current_player.occupied_cicle, five_number_gold_circle);
            current_player.goat += number_in_line_array(current_player.occupied_line, five_number_goat_line);
            current_player.gold += number_in_line_array(current_player.occupied_line, five_number_gold_line);
        }
        else
        {
            assert(number ==6);
        }
        refresh();



    }


}
