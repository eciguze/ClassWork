package javaguru.Lesson4;

public class PlayWithSwitch {
    public static void main(String[] args) {
        translateHTTPCode(200);
        translateHTTPCode(400);
        translateHTTPCode(500);
        translateHTTPCode(501);
    }

    private static void translateHTTPCode(int httpCode) {
        switch (httpCode) {
            case 200:
                System.out.println("OK");
                break;
            case 400:
                System.out.println("Bad request");
                break;
            case 500:
                System.out.println("Server error ");
            case 501:
                System.out.println("Server error 501");
                break;
            default:
                System.out.println("Unknown error");
        }
    }
}
