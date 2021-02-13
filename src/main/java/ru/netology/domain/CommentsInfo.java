package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private int date;
    private int likes;
    private String text;
    private int from_id;
    private String authorName;
    private boolean canPost;
    private boolean canClose;
    private boolean canOpen;
    private boolean canLike;
    private boolean InterestingAtFirst;
    private boolean newFirst;
    private boolean showNextComments;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getFrom_id() {
        return from_id;
    }

    public void setFrom_id(int from_id) {
        this.from_id = from_id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isInterestingAtFirst() {
        return InterestingAtFirst;
    }

    public void setInterestingAtFirst(boolean interestingAtFirst) {
        InterestingAtFirst = interestingAtFirst;
    }

    public boolean isNewFirst() {
        return newFirst;
    }

    public void setNewFirst(boolean newFirst) {
        this.newFirst = newFirst;
    }

    public boolean isShowNextComments() {
        return showNextComments;
    }

    public void setShowNextComments(boolean showNextComments) {
        this.showNextComments = showNextComments;
    }
}
