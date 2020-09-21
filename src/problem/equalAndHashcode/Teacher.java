package problem.equalAndHashcode;

import java.util.Objects;

/**
 * @author hc
 * @create 2020/9/21 0021 22:59
 */
public class Teacher {

    private int teaNo;

    private String teaName;

    private String teaGender;

    private int teaAge;

    public Teacher() {
    }

    public Teacher(int teaNo, String teaName, String teaGender, int teaAge) {
        this.teaNo = teaNo;
        this.teaName = teaName;
        this.teaGender = teaGender;
        this.teaAge = teaAge;
    }

    public int getTeaNo() {
        return teaNo;
    }

    public void setTeaNo(int teaNo) {
        this.teaNo = teaNo;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public String getTeaGender() {
        return teaGender;
    }

    public void setTeaGender(String teaGender) {
        this.teaGender = teaGender;
    }

    public int getTeaAge() {
        return teaAge;
    }

    public void setTeaAge(int teaAge) {
        this.teaAge = teaAge;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teaNo=" + teaNo +
                ", teaName='" + teaName + '\'' +
                ", teaGender='" + teaGender + '\'' +
                ", teaAge=" + teaAge +
                '}';
    }

    //重写了equal hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return teaNo == teacher.teaNo &&
                teaAge == teacher.teaAge &&
                teaName.equals(teacher.teaName) &&
                teaGender.equals(teacher.teaGender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teaNo, teaName, teaGender, teaAge);
    }
}
