public class CampStaff {
    public CampStaff() {}
    public void build(String building) {
        System.out.println("В лагере построили " + building);
    }
    public void place(String loc, String items) {
        System.out.println(items + " положили " + loc);
    }
}
