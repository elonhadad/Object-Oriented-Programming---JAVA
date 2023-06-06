import java.util.List;
import java.util.concurrent.locks.Lock;

public class Philosopher implements IPhilosopher {
    private int place;
    private int count;
    private int meals;
    private Lock lock;
    private boolean eating;
    private RandomSleep rs;
    private List<Fork> forks;

    public Philosopher(int place, List<Fork> forks, int meals,Lock lock) {
        this.count = 0;
        this.lock = lock;
        this.place = place;
        this.forks = forks;
        this.meals = meals;
        this.eating = false;
        this.rs = new RandomSleep(place);
    }


    @Override
    public boolean isEating() {
        return eating;
    }

    @Override
    public int getPlace() {
        return place;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        while (true){
            rs.sleep();
            Fork left = forks.get((place% forks.size()));
            Fork right = forks.get((place+1) % forks.size());

            lock.lock();

            synchronized (left){
                left.setOwner(place);
                synchronized (right){
                    lock.unlock();
                    right.setOwner(place);
                    eating = true;
                    count++;
                    rs.sleep();
                    eating = false;

                }
                right.setOwner(0);
            }
            left.setOwner(0);
            if (count == meals)
                break;
        }
        System.out.println("philo:" + place + " ate: " + count);
    }
}
