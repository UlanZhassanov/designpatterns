package structural.proxy;

public class MeetingService implements Meeting {
    public MeetingService() {
        callMembers();
    }

    public void callMembers(){
        System.out.println("Calling all meeting members");
    }

    @Override
    public void runMeeting() {
        System.out.println("Run meeting");
    }
}
