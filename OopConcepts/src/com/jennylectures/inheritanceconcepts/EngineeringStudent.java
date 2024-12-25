package com.jennylectures.inheritanceconcepts;

public class EngineeringStudent extends Student{
    private byte courseDuration;

    public byte getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(byte courseDuration) {
        this.courseDuration = courseDuration;
    }
}
