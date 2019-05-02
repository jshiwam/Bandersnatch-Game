package com.android.jaiswalshiwam.destini;

public class StoryAns {
    private int ans1;
    private int ans2;
    private int story;
    StoryAns(int story,int ans1,int ans2){
        this.story=story;
        this.ans1=ans1;
        this.ans2=ans2;
    }

    public int getAns1() {
        return ans1;
    }

    public void setAns1(int ans1) {
        this.ans1 = ans1;
    }

    public int getAns2() {
        return ans2;
    }

    public void setAns2(int ans2) {
        this.ans2 = ans2;
    }

    public int getStory() {
        return story;
    }

    public void setStory(int story) {
        this.story = story;
    }
}
