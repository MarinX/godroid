package go.godroid;

import go.Seq;

public abstract class Godroid {
    private Godroid() {} // uninstantiable

    public static void ListeAndServe() {
        go.Seq _in = new go.Seq();
        go.Seq _out = new go.Seq();
        Seq.send(DESCRIPTOR, CALL_ListeAndServe, _in, _out);
    }

    public static void SayGo(String txt) {
        go.Seq _in = new go.Seq();
        go.Seq _out = new go.Seq();
        _in.writeUTF16(txt);
        Seq.send(DESCRIPTOR, CALL_SayGo, _in, _out);
    }

    private static final int CALL_ListeAndServe = 1;
    private static final int CALL_SayGo = 2;
    private static final String DESCRIPTOR = "godroid";
}
