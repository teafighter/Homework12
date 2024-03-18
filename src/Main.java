public class Main {
    public static void main(String[] args) {
        
        Author tolstoy = new Author("Leo", "Tolstoy");
        Author dostoevsky = new Author("Fedor", "Dostoevsky");
        Book warAndPeace = new Book("War and peace", tolstoy, 1867);
        Book crimeAndPunishment = new Book(" Crime and Punishment", dostoevsky, 1866);
        crimeAndPunishment.setYear(1867);
        }
    }