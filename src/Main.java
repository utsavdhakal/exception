public class Main {

    public static void main(String[] args) {

        try (Connection con = new Connection(101);
             Connection con02 = new Connection(201)) {
            con.connect();
            con02.connect();
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*connected! : 101
        connected! : 201
        closing connection! : 201
        java.lang.Exception: something went wrong on connection : 201!
            at CustomConnection.close(CustomConnection.java:15)
            at Main.main(Main.java:7)
            Suppressed: java.lang.Exception: something went wrong on connection : 101!
                at CustomConnection.close(CustomConnection.java:15)
                at Main.main(Main.java:3)
        closing connection! : 101*/

    }
}