package ejercicio4;

public class DVD extends LibraryItem {
    private String director;
    private int duration;

    public DVD(String title, int itemId, boolean isLoaned, String director, int duration) {
        super(title, itemId, isLoaned);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Director: " + director);
        System.out.println("Duration: " + duration);
    }
}
