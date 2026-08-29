package model;


public class Decision {
    public String judge_id;
    public String contestant_id;
    public String result;
    Decision(String judgeId, String constestantId, String result) {
        judge_id = judgeId;
        contestant_id = constestantId;
        this.result = result;
    }
    public String getJudgeId() { return judge_id; }
    public String getContestantId() { return contestant_id; }
    public String getResult() { return result; }
}
