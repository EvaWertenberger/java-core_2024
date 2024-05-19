package lr6;

public class Task1 {
    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            new NewThread(i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class NewThread implements Runnable {
        private int number;
        private Thread t;
        public NewThread(int number) {
            this.number = number;
            t = new Thread(this, String.valueOf(number));
            t.start();
        }

        public void run() {
            System.out.println("Поток: " + t.getName());
        }
    }
}

