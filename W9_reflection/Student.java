package W9_reflection;

public class Student {

    private String gender;
    private String parentalLevel;
    private Integer mathScore;
    private Integer readingScore;
    private Integer writingScore;

    public Student(String gender, String parentalLevel, Integer mathScore, Integer readingScore, Integer writingScore) {
        this.gender = gender;
        this.parentalLevel = parentalLevel;
        this.mathScore = mathScore;
        this.readingScore = readingScore;
        this.writingScore = writingScore;
    }

    public String getGender() {
        return gender;
    }

    public String getParentalLevel() {
        return parentalLevel;
    }

    public Integer getMathScore() {
        return mathScore;
    }

    public Integer getReadingScore() {
        return readingScore;
    }

    public Integer getWritingScore() {
        return writingScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gender='" + gender + '\'' +
                ", parentalLevel='" + parentalLevel + '\'' +
                ", mathScore=" + mathScore +
                ", readingScore=" + readingScore +
                ", writingScore=" + writingScore +
                '}';
    }
}

