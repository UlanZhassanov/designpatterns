package structural.proxy;

public class MeetingProxy implements Meeting{
    private MeetingService meetingService;

    public MeetingProxy() {
    }

    @Override
    public void runMeeting() {
        if (meetingService == null){
            meetingService = new MeetingService();
        }

        meetingService.runMeeting();
    }
}
