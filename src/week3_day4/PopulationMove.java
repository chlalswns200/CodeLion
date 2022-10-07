package week3_day4;

public class PopulationMove {
    //전입 to 전출 from
    private int fromSido;
    private int toSido;

    public PopulationMove(int toSido, int fromSido) {
        this.toSido = toSido;
        this.fromSido = fromSido;
    }

    //오버로딩
    public PopulationMove(String toSido, String fromSido){
        this.toSido = Integer.parseInt(toSido);
        this.fromSido = Integer.parseInt(fromSido);
    }

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }
}