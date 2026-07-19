package DAY13;
class Session {

    String topic;
    int duration;
    String trainer;
    String room;

    Session(String topic, int duration, String trainer, String room) {
        this.topic = topic;
        this.duration = duration;
        this.trainer = trainer;
        this.room = room;
    }

    Session(String topic, int duration) {
        this(topic, duration, "Not Assigned", "Not Assigned");
    }

    Session(String topic) {
        this(topic, 1);
    }

    void displaySession() {
        System.out.println("\nSESSION DETAILS");
        System.out.println("Topic: " + topic);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Trainer: " + trainer);
        System.out.println("Room: " + room);
    }
}

public class TrainerSession {
    public static void main(String[] args) {

        Session s1 = new Session("Java Arrays");
        Session s2 = new Session("Java Arrays", 2);
        Session s3 = new Session("Java Arrays", 2,
                "Mahendra Yadav", "Lab 3");

        s1.displaySession();
        s2.displaySession();
        s3.displaySession();
    }
}
