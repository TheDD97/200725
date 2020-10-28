package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyMath {
    public ArrayList<Integer> primeNumbersGenerator(int n) {
        ArrayList<Integer> primeNumbers=new ArrayList<Integer>();
        if(n>=2)
            primeNumbers.add(2);
        for (int i=3;i<=n;i++){
            if(isPrime(i))
                primeNumbers.add(i);
        }
        System.out.println("CIAO");
        return primeNumbers;
    }

    private boolean isPrime(int n){
        if (n<2)
            return false;
        int div=0;
        for(int i=1;i<n;i++)
            if(n%i==0)
                div++;
            if(div==1)
                return true;
            return false;
    }
}
