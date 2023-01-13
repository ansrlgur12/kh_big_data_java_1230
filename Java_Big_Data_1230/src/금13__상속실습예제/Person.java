package 금13__상속실습예제;

public class Person {
    int age;
    int sleep;

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setSleep(int sleep) { this.sleep = sleep; }
    public int getSleep() {
        return sleep;
    }

}
class Worker extends Person{
    int work;
    public void setWork(int work) {
        this.work = work;
    }
    public int getWork() {
        return work;
    }
}
class Student extends Person{
    int study;
    public void setStudy(int study) {
        this.study = study;
    }
    public String getStudy() {
        String[] studyStr = {"", "\"열심히\"", "\"적당히\"", "\"놀면서\""};
        return studyStr[study];
    }
}