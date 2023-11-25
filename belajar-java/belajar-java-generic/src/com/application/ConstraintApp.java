package com.application;

public class ConstraintApp {
    public static void main(String[] args) {
        Data<Integer> integerData = new Data<>(100);
        // Data<String> stringData = new Data<>("String"); // Error
        Data<Long> longData = new Data<>(1000L);


        System.out.println(integerData.getData());
        System.out.println(longData.getData());
    }

    public static class Data<T extends Number> {
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
