package hashMap_and_Heap;
import java.io.*;
import java.util.*;

public class Generic_Heap_14 {

  public static class PriorityQueue<T> {
    ArrayList<T> data;
    Comparator comp;

    public PriorityQueue() {
      data = new ArrayList<>();
      comp = null;
    }
    public PriorityQueue(Comparator comp) {
    	data = new ArrayList<>();
    	this.comp = comp;
    }
    private boolean isSmaller(int i, int j) {
    	if(comp == null) {
    		Comparable ith = (Comparable) data.get(i);
    		Comparable jth = (Comparable) data.get(j);
    		if(ith.compareTo(jth) < 0) {
    			return true;
    		}else {
    			return false;
    		}
    	}else {
    		T ith = data.get(i);
    		T jth = data.get(j);
    		
    		if(comp.compare(ith, jth) < 0) {
    			return true;
    		}else {
    			return false;
    		}
    	}
    }

    public void add(T val) {
      data.add(val);
      upheapify(data.size() - 1);
    }
    private void upheapify(int i){
        if(i == 0){
            return;
        }
        int pi = (i - 1) / 2;
        if(isSmaller(i, pi) == true ){
            swap(i, pi);
            upheapify(pi);
        }
    }
    private void swap(int i, int j){
        T ith = data.get(i);
        T jth = data.get(j);
        data.set(i, jth);
        data.set(j, ith);
    }

    public T remove() {
      if(this.size() == 0){
          System.out.println("Underflow");
          return null;
      }
      swap(0, data.size() - 1);
      T val = data.remove(data.size() - 1);
      downheapify(0);
      return val;
    }
    private void downheapify(int pi){
        int mini = pi;
        
        int li = 2 * pi + 1;
        if(li < data.size() && isSmaller(li, mini) == true){
           mini = li; 
        }
        int ri = 2 * pi + 2;
        if(ri < data.size() && isSmaller(ri, mini) == true){
           mini = ri; 
        }
        
        if(mini != pi){
            swap(pi, mini);
            downheapify(mini);
        }
    }

    public T peek() {
      if(this.size() == 0){
          System.out.println("Underflow");
          return null;
      }
      return data.get(0);
    }

    public int size() {
      return data.size();
    }
  }
  static class Student implements Comparable<Student>{
	  int rno;
	  int ht;
	  int wt;
	  Student(int rno, int ht, int wt){
		  this.rno = rno;
		  this.ht = ht;
		  this.wt = wt;
	  }
	  public int compareTo(Student o) {
		  return this.rno - o.rno;
	  }
	  public String toString() {
		  return "Rno = " + this.rno + ", Ht = "+ this.ht + ", Wt = " + this.wt;
	  }
  }
	  static class StudentHtComparator implements Comparator<Student>{
		  public int compare(Student s1, Student s2) {
			  return s1.ht - s2.ht;
		  }
	  }
	  static class StudentWtComparator implements Comparator<Student>{
		  public int compare(Student s1, Student s2) {
			  return s1.wt - s2.wt;
		  }
	  }

  public static void main(String[] args) throws Exception {
	  int[] arr = {10, 2, 17, 3, 18, 9, 22};
	  PriorityQueue<Student> pq = new PriorityQueue<>(new StudentWtComparator());
	  pq.add(new Student(10, 180, 82));
	  pq.add(new Student(15, 185, 86));
	  pq.add(new Student(12, 181, 85));
	  pq.add(new Student(11, 170, 61));
	  pq.add(new Student(14, 175, 71));
	  while(pq.size() > 0) {
		  System.out.println(pq.peek());
		  pq.remove();
	  }
  }
}