package MaximumFrequencyStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/maximum-frequency-stack/

public class TimeLimitExceedFreqStack {
    ArrayList<Integer> stack;
    Map<Integer, Integer> freq;
    int maxfreq = 0;

    public TimeLimitExceedFreqStack() {
        this.stack = new ArrayList<Integer>();
        this.freq = new HashMap<Integer, Integer>();
    }

    public void push(int val) {
        this.stack.add(val);
        int currFreq = this.freq.getOrDefault(val, 0);
        this.freq.put(val, ++currFreq);
        if (maxfreq < currFreq) {
            maxfreq = currFreq;
        }
    }

    public ArrayList<Integer> findMostFrequentNumbers() {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(Integer i : this.stack){
            if(this.freq.get(i) ==  this.maxfreq){
                result.add(i);
            }
        }
        return result;
    }

    public int pop() {
        ArrayList<Integer> mostFrequent = this.findMostFrequentNumbers();
        int closest = 0;
        if (mostFrequent.size() > 0) {
            closest = mostFrequent.get(mostFrequent.size() - 1);
            for (int i = this.stack.size() - 1; i >= 0; i--) {
                if (this.stack.get(i) == closest) {
                    this.stack.remove(i);
                    this.maxfreq--;
                    break;
                }
            }
            int freq = this.freq.get(closest);
            this.freq.put(closest, freq - 1);
        }
        for (int i = this.stack.size() - 1; i >= 0; i--) {
            if (this.freq.get(this.stack.get(i)) > this.maxfreq) {
                this.maxfreq = this.freq.get(this.stack.get(i));
            }
        }
        return closest;

    }

    public static void main(String args[]) {
        TimeLimitExceedFreqStack fq = new TimeLimitExceedFreqStack();
        fq.push(5);
        fq.push(7);
        fq.push(5);
        fq.push(7);
        fq.push(4);
        fq.push(5);
        System.out.println(fq.pop());
        System.out.println(fq.pop());
        System.out.println(fq.pop());
        System.out.println(fq.pop());
    }
}
