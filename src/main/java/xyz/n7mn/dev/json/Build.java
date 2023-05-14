package xyz.n7mn.dev.json;

public class Build {

    private int build;
    private String time;
    private String channel;
    private boolean promoted;
    private Changes[] changes;
    private Downloads downloads;

    public Build(int build, String time, String channel, boolean promoted, Changes[] changes, Downloads downloads){
        this.build = build;
        this.time = time;
        this.channel = channel;
        this.promoted = promoted;
        this.changes = changes;
        this.downloads = downloads;
    }

    public int getBuild() {
        return build;
    }

    public void setBuild(int build) {
        this.build = build;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public boolean isPromoted() {
        return promoted;
    }

    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }

    public Changes[] getChanges() {
        return changes;
    }

    public void setChanges(Changes[] changes) {
        this.changes = changes;
    }

    public Downloads getDownloads() {
        return downloads;
    }

    public void setDownloads(Downloads downloads) {
        this.downloads = downloads;
    }
}
