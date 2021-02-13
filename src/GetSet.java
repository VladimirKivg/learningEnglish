public class GetSet {
    String rusian;
    String english;


    @Override
    public String toString() {
        return "GetSet{" +
                "rusian='" + rusian + '\'' +
                ", english='" + english + '\'' +
                '}';
    }

    public String getRusian() {
        return rusian;
    }

    public void setRusian(String rusian) {
        this.rusian = rusian;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }
}
