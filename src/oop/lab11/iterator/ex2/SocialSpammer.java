package oop.lab11.iterator.ex2;

public class SocialSpammer {
    public void send(ProfileIterator iterator, String message) {
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendEmail(profile.getEmail(), message);
        }
    }

    private void sendEmail(String email, String message) {
        System.out.printf("Send to email %s: %s", email, message);
    }
}
