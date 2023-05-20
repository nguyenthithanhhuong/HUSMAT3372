package oop.lab11.iterator.ex2;

public class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private String profileId, type;
    private int currentPosition;
    private Profile[] cache;

    public FacebookIterator(Facebook facebook, String profileId, String type) {
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
    }

    private void lazyInit() {
        if (cache == null) {

        }
    }

    @Override
    public Profile getNext() {
        if (hasNext()) {
            currentPosition++;
        }
        return cache[currentPosition];
    }

    @Override
    public boolean hasNext() {
        lazyInit();
        return currentPosition < cache.length;
    }
}
