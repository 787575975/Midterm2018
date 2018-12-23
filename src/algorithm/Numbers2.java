package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class Numbers2 {
    public static void main(String[] args) {
           int[] num = new int[1000000];


       Random ran = new Random();
        for(int i=0; i<((int[]) num).length; i++){
            num[i] = ran.nextInt(1000000);
        }
        ConnectToSqlDB con = new ConnectToSqlDB();
        Sort algo = new Sort();
        algo.selectionSort(num);
        long selectionsSortExecutionTime = algo.executionTime;
        System.out.println("Execution time"+((int[]) num).length+ " number in selection sort "+selectionsSortExecutionTime);
        //ConnectToSqlDB.insertDataFromArrayToSqlTable(num,"selectionSort","SortingNumbers");




    }
}

