import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//merge overlapping meetings. 
// sort the meetings first. 
// as you loop through the meeting times, compare two meetings, if they can overlap then we merge them
// if they cant then we push the current lower meeting to the finished list
// if the start time of i + 1 < the end time of i then merge. 
// if you merge then the start time will be i starttime, and the endtime will be the greater of the two end times. 
public class MergeMeeting {

    public static List<Meeting> mergeRanges(List<Meeting> meetings) {

        List<Meeting> sortedMeetings = new ArrayList<>();

        for ( Meeting meeting : meetings ) {
            Meeting meetingCopy = new Meeting(meeting.getStartTime(), meeting.getEndTime() );
            sortedMeetings.add(meetingCopy);
        }

        Collections.sort(sortedMeetings, new Comparator<Meeting>() {
            public int compare(Meeting m1, Meeting m2) {
                return m1.getStartTime() - m2.getStartTime();
            }
        });

        List<Meeting> mergedMeetings = new ArrayList<>();
        mergedMeetings.add(sortedMeetings.get(0));

        for ( Meeting currentMeeting : sortedMeetings ) {

            Meeting lastMergedMeeting = mergedMeetings.get(mergedMeetings.size() - 1);

            if ( currentMeeting.getStartTime() <= lastMergedMeeting.getEndTime()) {
                lastMergedMeeting.setEndTime(Math.max(lastMergedMeeting.getEndTime(), currentMeeting.getEndTime()));
            } else {
                mergedMeetings.add(currentMeeting);
            }
        }

        for ( Meeting meeting : mergedMeetings ) {
            Object startTime = meeting.getStartTime();
            Object endTime = meeting.getEndTime();
            System.out.println(startTime);
            System.out.println(endTime);
        }

        return mergedMeetings;

    }

    public static void main(String[] args) {

        List<Meeting> meetings = new ArrayList<>();
        Meeting firstMeeting = new Meeting(1, 3);
        Meeting secondMeeting = new Meeting(2, 4);
        meetings.add(firstMeeting);
        meetings.add(secondMeeting);

        System.out.println(mergeRanges(meetings));

    }

}

