package model;

public class Judge {
    private String judge_id;
    public String judge_name;
    private boolean status = true;
    private boolean GoldenBuzzerAvailiable = true;
    Judge(String id, String name) {
        judge_id = id;
        judge_name = name;
    }
    public boolean isGoldenAvailiable() {return GoldenBuzzerAvailiable;}
    public boolean isJudgeAvailiable() {return status;}
    public String getId() { return judge_id; }
}
