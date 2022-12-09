public class CustomConnection implements AutoCloseable {
    private final int id;

    public CustomConnection(int id) {
        this.id = id;
    }

    public void connect() {
        System.out.println("connected! : " + id);
    }

    @Override
    public void close() throws Exception {
        System.out.println("closing connection! : " + id);
        throw new Exception("something went wrong on connection : " + id + "!");
//        System.out.println("connection closed!");
    }
}
