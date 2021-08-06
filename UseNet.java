
public class UseNet{

    public static void main(String arg[]) throws IDNotUniqueException{

        Resistor R1 = new Resistor(100, "R1");
        Resistor R2 = new Resistor(200, "R2");
        Resistor R3 = new Resistor(300, "R3");
        Resistor R4 = new Resistor(400, "R4");
        Resistor R5 = new Resistor(500, "R5");
        Resistor R6 = new Resistor(600, "R6");

        //Parallel R13 = new Parallel();
        //Net R123 = new Serial();
        //Net R45 = new Serial();
        //Net R12345 = new Parallel(R123, R45);

        
        //Net myNet = new Serial(new Parallel(R6, new Serial(R5,R4)), new Serial(R2, new Parallel(R1,R3)));
        Net serial1 = new Serial(R2, new Parallel(R1,R3));
        Net serial2 = new Serial(R4,R5);
        Net myNet = new Parallel(new Parallel(serial1,serial2), R6);
        //Net myNet = new Parallel(new Serial(new Parallel(R1, R3), R2), new Parallel(new Serial(R4, R5), R6));
        System.out.println("Gesamtwiderstand: " + myNet.ohm() + " Ohm");



        //myNet.resistors.add("R1");


        //Net myNet2 = Serial(Parallel(Serial(Parallel(Serial(R1, R2), R3),R4),R5),R6);
        //System.out.println("Gesamtwiderstand: " + myNet2.ohm() + " Ohm");
    }


}