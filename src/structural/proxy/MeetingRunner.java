package structural.proxy;

public class MeetingRunner {
    public static void main(String[] args) {
        Meeting meeting = new MeetingProxy();
//        Meeting meeting = new MeetingService();

        meeting.runMeeting();
    }
}
