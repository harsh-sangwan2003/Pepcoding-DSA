import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class create_min_heap {

  public static class PriorityQueue {
    ArrayList<Integer> data;

    public PriorityQueue() {
      data = new ArrayList<>();
    }

    //O(log(n))

    public void add(int val) {
      // write your code here

      data.add(val);

      upheapify(data.size()-1);
    }

    //O(log(n))
    public int remove() {
      // write your code here

      if(data.size()<=0)
      {
        System.out.println("Underflow");
        return -1;
      }

      else{

        int val = data.get(0);

        swap(0,data.size()-1);

        data.remove(data.size()-1);

        downheapify(0);

        return val;
      }

    }

    public void upheapify(int idx){

      if(idx<=0)
      return;

      int pi = (idx-1)/2;

      if(data.get(idx)<data.get(pi)){

        swap(idx,pi);

        upheapify(pi);
      }

    }

    public void downheapify(int pi){

      int minIdx = pi;

      int lci = 2*pi + 1;
      int rci = 2*pi + 2;

      if(lci<data.size() && (data.get(minIdx)>data.get(lci)))
      minIdx = lci;

      if(rci<data.size() && (data.get(minIdx)>data.get(rci)))
      minIdx = rci;

      if(minIdx!=pi){

        swap(minIdx,pi);

        downheapify(minIdx);
      }
    }

    public void swap(int i, int j){

      int val1 = data.get(i);
      int val2 = data.get(j);

      data.set(i,val2);
      data.set(j,val1);

    }

    //O(1)
    public int peek() {
      // write your code here

      if(data.size()==0)
      {
        System.out.println("Underflow");
        return -1;
      }

      else{

        return data.get(0);
      }
    }

    //O(1)
    public int size() {
      // write your code here

      return data.size();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue qu = new PriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}