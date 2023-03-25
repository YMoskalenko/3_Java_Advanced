class DaemonThread extends Thread {
    public static void main(String[] args) {
        DaemonThread thread1 = new DaemonThread();
        DaemonThread thread2 = new DaemonThread();
        
        thread1.setDaemon(true);
        thread2.setDaemon(false);

        System.out.println("\n Запускаємо перший потік: ");
        thread1.start();
        System.out.println("Отримуємо ім'я: " + thread1.getName());
        System.out.println("Потік Daemon? " + thread1.isDaemon());
        System.out.println("Отримуємо id: " + thread1.getId());
        System.out.println("Отримуємо priority: " + thread1.getPriority());
        System.out.println("Отримуємо thread group: " + thread1.getThreadGroup());
        System.out.println("Потік працює?: " + thread1.isAlive());
        System.out.println("Отримуємо class: " + thread1.getClass());

        System.out.println("\n Запускаємо другий потік: ");
        thread2.start();
        System.out.println("Отримуємо ім'я: " + thread2.getName());
        System.out.println("Потік Daemon? " + thread2.isDaemon());
        System.out.println("Отримуємо id: " + thread2.getId());
        System.out.println("Отримуємо priority: " + thread2.getPriority());
        System.out.println("Отримуємо thread group: " + thread2.getThreadGroup());
        System.out.println("Потік працює?: " + thread2.isAlive());
        System.out.println("Отримуємо class: " + thread2.getClass());
    }

    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Це потік Демон");
        } else {
            System.out.println("Це потік користувача");
        }
    }
}
