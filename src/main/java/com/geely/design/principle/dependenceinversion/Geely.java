package com.geely.design.principle.dependenceinversion;

public class Geely {

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    private ICourse iCourse;

    public Geely() {
    }

    public Geely(ICourse iCourse){
        this.iCourse = iCourse;
    }

    public void studyImoocCourse(){
        iCourse.studyCourse();
    }
}
