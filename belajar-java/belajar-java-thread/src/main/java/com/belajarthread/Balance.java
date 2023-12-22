package com.belajarthread;

public class Balance {
    private Long value;

    public Balance(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public static void transfer (Balance from, Balance to, Long value) throws InterruptedException {
        synchronized (from) {
            Thread.sleep(1000L);
            from.setValue(from.getValue() - value); // mengurangi saldo dari balance from
        }

        synchronized (to) {
            to.setValue(to.getValue() + value); // menambah saldo dari balance to
        }
    }
}