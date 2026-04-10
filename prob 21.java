class Restaurant {
    boolean ready = false;

    synchronized void prepare() {
        try {
            System.out.println("Chef prepared food");
            ready = true;
            notify();
        } catch (Exception e) {
        }
    }

    synchronized void serve() {
        try {
            if (!ready)
                wait();
            System.out.println("Waiter served food");
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant();
        new Thread(() -> r.serve()).start();
        new Thread(() -> r.prepare()).start();
    }
}