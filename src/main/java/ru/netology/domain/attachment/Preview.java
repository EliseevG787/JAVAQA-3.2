package ru.netology.domain.attachment;

public class Preview {
    private Photo photo;
    private Graffiti graffiti;
    private AudioMessage audioMessage;

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public Graffiti getGraffiti() {
        return graffiti;
    }

    public void setGraffiti(Graffiti graffiti) {
        this.graffiti = graffiti;
    }

    public AudioMessage getAudioMessage() {
        return audioMessage;
    }

    public void setAudioMessage(AudioMessage audioMessage) {
        this.audioMessage = audioMessage;
    }
}
