package notification;

public class Subscription {
    private String url;
    private String frequency;
    private String communicationChannel;

    public Subscription(String url, String frequency, String communicationChannel) {
        this.url = url;
        this.frequency = frequency;
        this.communicationChannel = communicationChannel;
    }

    public String getUrl() {
        return url;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getCommunicationChannel() {
        return communicationChannel;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public void setCommunicationChannel(String communicationChannel) {
        this.communicationChannel = communicationChannel;
    }
}