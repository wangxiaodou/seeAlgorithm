package pet;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 实现猫狗队列
 *
 */
public class DogCatStack {

    private Queue<PetEnterQueue> dogQ;
    private Queue<PetEnterQueue> catQ;
    private long count;

    public DogCatStack(){
        dogQ = new LinkedList<>();
        catQ = new LinkedList<>();
        count = 0L;
    }

    public void add(Pet pet){
        if (pet.getType().equals("dog")){
            dogQ.add(new PetEnterQueue(pet,count++));
        }else if (pet.getType().equals("cat")){
            catQ.add(new PetEnterQueue(pet,count++));
        }else{
            throw new RuntimeException("error type");
        }
    }

    public Pet pollAll(){
        if( !dogQ.isEmpty() && !catQ.isEmpty()){
            if (dogQ.peek().getCount() < catQ.peek().getCount()){
                return dogQ.poll().getPet();
            }else{
                return catQ.poll().getPet();
            }
        }else if (!dogQ.isEmpty() ){
            return dogQ.poll().getPet();
        }else if(!catQ.isEmpty()){
            return catQ.poll().getPet();
        }else{
            throw new RuntimeException("queue is Empty");
        }
    }


    public Dog pollDog(){
        if (!dogQ.isEmpty() ){
            return (Dog) dogQ.poll().getPet();
        }else{
            throw new RuntimeException("queue is Empty");
        }
    }

    public Cat pollCat(){
        if (!catQ.isEmpty() ){
            return (Cat) catQ.poll().getPet();
        }else{
            throw new RuntimeException("queue is Empty");
        }
    }
}

