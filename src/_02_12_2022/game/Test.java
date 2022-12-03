package _02_12_2022.game;

public class Test {
    public static void main(String[] args) {
        Pupil pupil1 = new Pupil("Anatoly", 16);
        Pupil pupil2 = new Pupil("Roman", 17);
        Pupil pupil3 = new Pupil("AntiRoman", 17);
        Pupil pupil4 = new Pupil("AntiAnatoly", 17);


        Student student1 = new Student("Nataliya", 22);
        Student student3 = new Student("AntiNataliya", 22);
        Student student2 = new Student("Marina", 23);
        Student student4 = new Student("AntiMarina", 23);

        Adult adult1 = new Adult("Mikhail", 38);
        Adult adult3 = new Adult("AntiMikhail", 38);
        Adult adult2 = new Adult("Yulia", 28);
        Adult adult4 = new Adult("AntiYulia", 28);

        Team<Pupil> pupilTeam1 = new Team("PT1");
        Team<Pupil> pupilTeam2 = new Team("PT2");

        Team<Student> studentTeam1 = new Team<>("ST1");
        Team<Student> studentTeam2 = new Team<>("ST2");

        Team<Adult> adultTeam1 = new Team<>("AT1");
        Team<Adult> adultTeam2 = new Team<>("AT2");

        pupilTeam1.addNewParticipant(pupil1);
        pupilTeam1.addNewParticipant(pupil2);
        pupilTeam2.addNewParticipant(pupil3);
        pupilTeam2.addNewParticipant(pupil4);

        studentTeam1.addNewParticipant(student1);
        studentTeam1.addNewParticipant(student2);
        studentTeam2.addNewParticipant(student3);
        studentTeam2.addNewParticipant(student4);

        adultTeam1.addNewParticipant(adult1);
        adultTeam1.addNewParticipant(adult2);
        adultTeam2.addNewParticipant(adult3);
        adultTeam2.addNewParticipant(adult4);

        pupilTeam1.playWith(pupilTeam2);
        studentTeam1.playWith(studentTeam2);
        adultTeam1.playWith(adultTeam2);
    }
}