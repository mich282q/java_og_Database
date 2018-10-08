package mich282q.Smarthome;

public class Hus {
    private Vindue[] vinduer = new Vindue[5];
    private Lys[] lys = new Lys[10];
    private Varme[] varme = new Varme[3];
    private Opvaskemaskine[] opvaskemaskines = new Opvaskemaskine[1];
    private Kaffe[] kaffes = new Kaffe[1];
    private Computer[] computers = new Computer[2];

    public Hus(){
        Lokation stue = new Lokation("Stuen");
        Lokation bad = new Lokation("Badeværelse");
        Lokation sove = new Lokation("Soveværelse");

        Vindue vindueStue = new Vindue();
        Vindue vindueBad = new Vindue();
        Vindue vindueSove = new Vindue();
        Lys lysStue = new Lys();
        Lys lysBad = new Lys();
        Lys lysSove = new Lys();
        Varme varmeStue = new Varme();
        Varme varmeBad = new Varme();
        Varme varmeSove = new Varme();

        vinduer[1] = vindueStue;
        vinduer[3] = vindueBad;
        vinduer[4] = vindueSove;
        lys[1] = lysStue;
        lys[2] = lysBad;
        lys[3] = lysSove;
        varme[1] = varmeStue;
        varme[2] = varmeBad;
        varme[3] = varmeSove;


    }
}

