package oop.lab11.iterator.ex2;

public interface SocialNetwork {
    public ProfileIterator createFriendsIterator(String profileId);

    public ProfileIterator createCoworkersIterator(String profileId);
}
