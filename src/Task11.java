public class Task11 {
    public static void main(String[] args) {
        System.out.println("Задание №11");
        long startSeconds = 133_414L;
        long days = startSeconds / 86400;
        Long hours = (startSeconds % 86400) / 3600;
        long minutes = ((startSeconds % 86400) % 3600) / 60;
        long seconds = ((startSeconds % 86400) % 3600) / 24;
        System.out.println(days);
        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);

    }
}
