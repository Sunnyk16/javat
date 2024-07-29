enum status {
    running, pending, failed
}

public class enummm {
    public static void main(String[] args) {

        status s = status.pending;

        switch (s) {
            case running:
                System.out.println("all good");
                break;
            case pending:
                System.out.println("in queue");
                break;
            case failed:
            System.out.println("try again");    

            default:
                System.out.println("error");
        }

    }

}
