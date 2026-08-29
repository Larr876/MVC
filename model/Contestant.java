package model;


public class Contestant {
    private String contestant_id;
    public String contestant_name;
    public Status status = Status.PENDING;
    public String performance;
    public Contestant(String id, String name, String perf) {
        contestant_id = id;
        contestant_name = name;
        performance = perf;
    }
    public String getId() { return contestant_id; }
    public boolean isPass() {
        switch (status) {
            case PASS:
                return true;
            case FAIL:
                return false;
            default:
                return false;
        }
    }
}