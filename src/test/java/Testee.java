class Consumer {
    void consume(String a, String b) {
        System.out.println(a + " " + b);
    }
}

class Producer {
    String returnSomething() {
        return "5";
    }
}

class Testee {

    private Consumer consumer;
    private Producer producer;

    Testee(Consumer consumer, Producer producer) {
        this.consumer = consumer;
        this.producer = producer;
    }

    String dummy(String name, String age) {
        consumer.consume(name, age);
        return producer.returnSomething();
    }
}
