package xyz.n7mn.dev.json;

public class Changes {

    private String commit;
    private String summary;
    private String message;

    public Changes(String commit, String summary, String message){
        this.commit = commit;
        this.summary = summary;
        this.message = message;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
