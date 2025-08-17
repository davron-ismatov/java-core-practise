package org.example.javacoreandspringpractise.thread;

public class LivelockExample {
    static class Ball {
        private Player owner;

        public Ball(final Player owner) {
            this.owner = owner;
        }

        public synchronized Player getOwner() {
            return this.owner;
        }

        public synchronized void setOwner(final Player owner) {
            System.out.println("Ball owner changing from " + (this.owner != null ? this.owner.getName() : "none") + " to " + owner.getName());
            this.owner = owner;
        }
    }

    static class Player extends Thread {
        private boolean active = true;

        public Player(String name) {
            super(name);
        }

        public synchronized boolean isActive() {
            return this.active;
        }

        public void playWith(final Player other, final Ball ball) {
//            Lock
            while (this.active) {
                synchronized (ball) {
                    if (ball.getOwner() != this) {
                        System.out.println(this.getName() + ": Waiting for the ball. Current owner: " + ball.getOwner().getName());
                        try {
                            ball.wait(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println(this.getName() + ": I have the ball. Passing it to " + other.getName());
                        if (other.isActive()) {
                            ball.setOwner(other);
                            ball.notifyAll(); // notify other threads waiting for the ball
                        } else {
                            System.out.println(this.getName() + ": " + other.getName() + " is inactive. Stopping.");
                            this.active = false;
                        }
                    }
                }
            }
            System.out.println(this.getName() + ": Stopped playing.");
        }
    }


    public static void main(String[] args) {
        final Player p1 = new Player("Player 1");
        final Player p2 = new Player("Player 2");
        final Ball ball = new Ball(p1);

        System.out.println("Starting the game...");
        p1.start();
        p2.start();

        new Thread(() -> p1.playWith(p2, ball)).start();
        new Thread(() -> p2.playWith(p1, ball)).start();
    }

}
